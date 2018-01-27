package spitter.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpitter {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/config.xml");
        JdbcSpitterDao dao = (JdbcSpitterDao) ctx.getBean("jdbcSpitterDao", JdbcSpitterDao.class);

        Spitter spitter = new Spitter();
        spitter.setFullName("Alik Mheryan");
        spitter.setUsername("Alik");
        spitter.setPassword("tester");
        spitter.setEmail("alik@gmail.com");
        dao.addSpitter(spitter);

        //Spitter retrievedSpitter = dao.getSpitterById(3L);
        //System.out.print(retrievedSpitter);

    }
}
