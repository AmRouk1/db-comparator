package pt.henriques.db.comparator.implementation.core;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pt.henriques.db.comparator.jpa.repository.UserTableRepository;

@Service
@RequiredArgsConstructor
public class StructuralComparison {

	private final UserTableRepository userTableRepository;

	public void compare() {
		userTableRepository.findAll()
							.stream()
							.flatMap(table -> table.getColumnStructures()
												.stream()
												.map(column -> String.join(" | ", table.getTableName(), column.getColumnName()))
							)
							.forEach(System.out::println);
	}
}
