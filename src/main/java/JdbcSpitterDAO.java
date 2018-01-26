import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class JdbcSpitterDAO {

    private SimpleJdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


}
