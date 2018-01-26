import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcDeveloperRunner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        JdbcTemplateDeveloperDaoImpl jdbcTemplateDeveloperDao =
                (JdbcTemplateDeveloperDaoImpl) context.getBean("jdbcTemplateDeveloperDao");

        System.out.println("========Creating new records to DB========");
        jdbcTemplateDeveloperDao.createDeveloper("Proselyte", "Java Developer", 3);
        jdbcTemplateDeveloperDao.createDeveloper("Petr", "C++ Developer", 2);
        jdbcTemplateDeveloperDao.createDeveloper("DesignerAsya", "UI Developer", 1);

        System.out.println("========Developers List========");

        List developers = jdbcTemplateDeveloperDao.listDevelopers();
        for (Developer developer : developers) {
            System.out.println(developer);
        }

        System.out.println("========Some changes to DB========");
        jdbcTemplateDeveloperDao.updateDeveloper(33, "DesignerAsya", "UI Developer", 2);
        jdbcTemplateDeveloperDao.removeDeveloper(32);

        System.out.println("========Final Developers List========");

        List finalDevelopers = jdbcTemplateDeveloperDao.listDevelopers();
        for (Developer developer : finalDevelopers) {
            System.out.println(developer);
        }
    }
}
