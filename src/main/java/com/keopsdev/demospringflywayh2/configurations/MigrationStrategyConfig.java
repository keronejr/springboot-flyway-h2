package com.keopsdev.demospringflywayh2.configurations;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MigrationStrategyConfig {
 
    @Bean
    public FlywayMigrationStrategy flywayMigrationStrategy() {
        
    	return flyway -> {
    		//PARA EVIRAR QUE O FLYWAY RODER BASTA COMENTAR A LINHA ABAIXO
            flyway.migrate();
        };
    }
    
    /* IMPLEMENTAÇÂO PRA FAZER O FLYWAY POPULAR O BANCO APOS O HIBERNATE CRIAR AS TABELA
    @Autowired
    public void FlywayConfiguration(DataSource dataSource) {
        Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).load().migrate(); //setschemas("").
    }
    */
}
