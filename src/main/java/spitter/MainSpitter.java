package spitter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spitter.dao.JdbcSpitterDao;
import spitter.model.Spitter;

public class MainSpitter {
    public static void main(String[] args) {
/*
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/config.xml");
        JdbcSpitterDao dao = (JdbcSpitterDao) ctx.getBean("jdbcSpitterDao");


*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/config.xml");
        JdbcSpitterDao dao = (JdbcSpitterDao) ctx.getBean("HibernateSpitterDao");

        Spitter spitter = new Spitter();
        spitter.setFullName("Miluoki");
        spitter.setUsername("Geneva");
        spitter.setPassword("tester");
        spitter.setEmail("alik@gmail.com");
        dao.addSpitter(spitter);



    }
}
