package com.keopsdev.demospringflywayh2.configurations;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MigrationStrategyConfig {
 
    @Bean
    public FlywayMigrationStrategy flywayMigrationStrategy() {
        
    	return flyway -> {
            flyway.migrate();
        };
    }
}