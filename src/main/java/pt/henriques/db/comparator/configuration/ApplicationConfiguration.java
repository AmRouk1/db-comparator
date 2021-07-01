package pt.henriques.db.comparator.configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.*;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableJpaRepositories(ApplicationConfiguration.APPLICATION_BASE_PACKAGE)
//@EntityScan(ApplicationConfiguration.APPLICATION_BASE_PACKAGE)
//@EnableTransactionManagement

@SpringBootApplication(exclude = {
	    DataSourceAutoConfiguration.class,
	    DataSourceTransactionManagerAutoConfiguration.class,
	    HibernateJpaAutoConfiguration.class
	})
public class ApplicationConfiguration {

	static final String APPLICATION_BASE_PACKAGE = "pt.henriques.db.comparator";
}