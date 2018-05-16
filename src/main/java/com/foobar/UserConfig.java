package com.foobar;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
        entityManagerFactoryRef = "UrEntityManagerFactory",
        transactionManagerRef = "UrTransactionManager",
        basePackages = {"com.foobar.User.repository"}
)
public class UserConfig {

    public class PRConfig {
        @Bean(name = "userDatasourse")
        @ConfigurationProperties(prefix = "user.datasource")
        public DataSource dataSource() {
            return DataSourceBuilder.create().build();
        }

        @Bean(name = "UrEntityManagerFactory")
        public LocalContainerEntityManagerFactoryBean UrEntityManagerFactory(
                EntityManagerFactoryBuilder builder, @Qualifier("userDatasourse") DataSource dataSource) {
            return builder.dataSource(dataSource).packages("com.foobar.User.entities")
                    .persistenceUnit("User")
                    .build();
        }

        @Bean(name = "UrTransactionManager")
        public PlatformTransactionManager UrTransactionManager(
                @Qualifier("UrEntityManagerFactory") EntityManagerFactory UrEntityManagerFactory) {
            return new JpaTransactionManager(UrEntityManagerFactory);
        }

    }
}
