package spitter.java;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;


@Component("jdbcSpitterDao")
public class JdbcSpitterDao implements SpitterDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final String SQL_INSERT_SPITTER =
            "insert into spitter(username, password, fullname, email) values(?, ?, ?, ?)";
    public void addSpitter(Spitter spitter) {
        jdbcTemplate.update(SQL_INSERT_SPITTER,
                spitter.getUsername(),
                spitter.getPassword(),
                spitter.getFullName(),
                spitter.getEmail());
    }

/*
    private static final String SQL_INSERT_SPITTER =
            "insert into spitter (username, password, fullname) " +
                    "values(:username, :password, :fullname)";

    public void addSpitter(Spitter spitter) {
        Map<String, Object> params = new HashMap <String, Object>();
        params.put("username", spitter.getUsername());
        params.put("password", spitter.getPassword());
        params.put("fullname", spitter.getFullName());

        jdbcTemplate.update(SQL_INSERT_SPITTER, params);

    }
*/



}
