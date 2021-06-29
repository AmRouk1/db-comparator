package pt.henriques.db.comparator;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;
import pt.henriques.db.comparator.implementation.core.StructuralComparison;

@SpringBootApplication
@RequiredArgsConstructor
public class DatabaseComparatorApplication implements CommandLineRunner {

	private final StructuralComparison structuralComparison;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseComparatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		structuralComparison.compare();
	}
}