package spitter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("HibernateSpitterDao")
public class HibernateSpitterDao implements SpitterDao{

    private SessionFactory sessionFactory;

    @Autowired
    public HibernateSpitterDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;                       // Конструирует DAO
    }

    private Session currentSession() {           // Извлекает текущий
        return sessionFactory.getCurrentSession();  // сеанс из фабрики  SessionFactory
    }


    public void addSpitter(Spitter spitter) {
        currentSession().save(spitter); // Использует текущий сеанс
    }




}
