package spitter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spitter.dao.JdbcSpitterDaoImpl;
import spitter.model.Spitter;

public class MainSpitter {
    public static void main(String[] args) {
/*
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/config.xml");
        JdbcSpitterDaoImpl dao = (JdbcSpitterDaoImpl) ctx.getBean("jdbcSpitterDao");


*/
      /*  ApplicationContext ctx = new ClassPathXmlApplicationContext("/config.xml");
        JdbcSpitterDaoImpl dao = (JdbcSpitterDaoImpl) ctx.getBean("HibernateSpitterDao");

        Spitter spitter = new Spitter();
        spitter.setFullName("Miluoki");
        spitter.setUsername("Geneva");
        spitter.setPassword("tester");
        spitter.setEmail("alik@gmail.com");
        dao.addSpitter(spitter);


*/
    }
}
