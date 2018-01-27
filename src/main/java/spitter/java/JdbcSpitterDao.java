package spitter.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.*;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;


@Component("jdbcSpitterDao")
public class JdbcSpitterDao implements SpitterDao {

    private JdbcTemplate jdbcTemplate;

//    @Autowired
//    public void setDataSource(DataSource dataSource) {
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
//    }

/*

    public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
*/


    private static final String SQL_INSERT_SPITTER =
            "insert into spitter(username, password, fullname, email, update_by_email) values(?, ?, ?, ?, ?)";
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
