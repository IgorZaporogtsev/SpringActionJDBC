import java.util.List;

public interface DeveloperDao {
    public void setDataSource(DataSource dataSource);

    public void createDeveloper(String name, String specialty, Integer experience);

    public Developer getDeveloperById(Integer id);

    public List listDevelopers();

    public void removeDeveloper(Integer id);

    public void updateDeveloper(Integer id, String name, String specialty, Integer experience);

}
