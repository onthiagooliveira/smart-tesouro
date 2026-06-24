package com.smart_tesouro.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Testcontainers
class DatabaseConnectionTest {

    @Container
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:16-alpine");

    static class TestConfig {
        @Bean
        public void setProperties() {
            System.setProperty("spring.datasource.url", postgres.getJdbcUrl());
            System.setProperty("spring.datasource.username", postgres.getUsername());
            System.setProperty("spring.datasource.password", postgres.getPassword());
        }
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void shouldBeAbleToConnectToDatabase() {
        // Tenta rodar uma query simples para validar a conexão
        Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
        assertTrue(result != null && result == 1, "A conexão com o banco deveria retornar 1");
    }
}