package pt.henriques.db.comparator.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(ApplicationConfiguration.APPLICATION_BASE_PACKAGE)
@EntityScan(ApplicationConfiguration.APPLICATION_BASE_PACKAGE)
@EnableTransactionManagement
public class ApplicationConfiguration {

	static final String APPLICATION_BASE_PACKAGE = "pt.henriques.db.comparator";
}