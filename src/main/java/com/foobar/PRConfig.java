package com.foobar;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "PrEntityManagerFactory",
        transactionManagerRef = "PrTransactionManager",
        basePackages = {"com.foobar.PayRoll.repository"}
)
public class PRConfig {
    @Bean(name = "mysqlDatasourse")
    @ConfigurationProperties(prefix = "mysql.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "PrEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean PrEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("mysqlDatasourse") DataSource dataSource) {
        return builder.dataSource(dataSource).packages("com.foobar.PayRoll.entities")
                .persistenceUnit("PayRates").persistenceUnit("Employee")
                .build();
    }

    @Bean(name = "PrTransactionManager")
    public PlatformTransactionManager PrTransactionManager(
            @Qualifier("PrEntityManagerFactory") EntityManagerFactory PrEntityManagerFactory) {
        return new JpaTransactionManager(PrEntityManagerFactory);
    }

}
