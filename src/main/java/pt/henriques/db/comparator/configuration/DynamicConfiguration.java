package pt.henriques.db.comparator.configuration;


import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;

public class DynamicConfiguration {

	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
}
