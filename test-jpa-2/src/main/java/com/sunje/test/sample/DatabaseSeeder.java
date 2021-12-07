package com.sunje.test.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void insertData() {
        jdbcTemplate.execute("INSERT INTO Board(c1,c2) VALUES(6, 'Hugo')");
        jdbcTemplate.execute("INSERT INTO Board(c1,c2) VALUES(7, 'Alighieri')");
        jdbcTemplate.execute("INSERT INTO Board(c1,c2) VALUES(8, 'Zweig')");
        jdbcTemplate.execute("INSERT INTO Board(c1,c2) VALUES(9, 'Wilde')");
    }
}