package dev.pascoaltec.contentcalendar.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ContentJdbcTemplateRepository {
    
    private final JdbcTemplate jdbcTemplate;

    public ContentJdbcTemplateRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
}
