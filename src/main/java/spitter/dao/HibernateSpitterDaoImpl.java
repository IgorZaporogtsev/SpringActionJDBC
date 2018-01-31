package spitter.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spitter.model.Spitter;

import java.util.List;

@Repository //@Repository("HibernateSpitterDao") TODO
public class HibernateSpitterDaoImpl implements SpitterDao {

    private static final Logger logger = LoggerFactory.getLogger(HibernateSpitterDaoImpl.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

   /* @Autowired
    public HibernateSpitterDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;                       // Конструирует DAO
    }

    private Session currentSession() {           // Извлекает текущий
        return sessionFactory.getCurrentSession();  // сеанс из фабрики  SessionFactory
    }*/

    @Override
    public void addSpitter(Spitter spitter) {
     //   currentSession().save(spitter);              // Использует текущий сеанс

        Session session = this.sessionFactory.getCurrentSession();
        session.persist(spitter);
        logger.info("spitter successfully SAVE. Spitter details: " + spitter);
    }

    @Override
    public void updateSpitter(Spitter spitter) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(spitter);
        logger.info("spitter successfully UPDATE. Spitter details: " + spitter);
    }

    @Override
    public void removeSpitter(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Spitter spitter = session.load(Spitter.class, new Integer(id));

        if(spitter!=null){
            session.delete(spitter);
        }
        logger.info("spitter successfully DELETE. Spitter details: " + spitter);
    }

    @Override
    public Spitter getSpitterById(int id) {
        Session session =this.sessionFactory.getCurrentSession();
        Spitter spitter =  session.load(Spitter.class, new Integer(id));
        logger.info("Book successfully LOADED. Book details: " + spitter);

        return spitter;
    }

    @Override
    @SuppressWarnings("unchecked") //TODO
    public List<Spitter> listBooks() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Spitter> spitterList = session.createQuery("from Book").list();
        for(Spitter book: spitterList){
            logger.info("Spitter list: " + book);
        }

        return spitterList;
    }


}
