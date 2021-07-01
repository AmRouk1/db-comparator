package pt.henriques.db.comparator.implementation.core;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pt.henriques.db.comparator.jpa.repository.user.UserTableRepository;
import pt.henriques.db.comparator.model.table.constraint.*;

@Service
@RequiredArgsConstructor
public class StructuralComparison {

	private final UserTableRepository userTableRepository;

	public void compare() {
		userTableRepository.findAll()
							.stream()
							.flatMap(table -> table.getConstraintStructures()
												.stream()
												.map(cons -> String.join(" | ", table.getTableName(), cons.getName(), getConsColumnName(cons)))
							)
							.forEach(System.out::println);
	}

	public String getConsColumnName(ConstraintStructure constraintStructure) {
		return constraintStructure.getColumns().stream().map(ColumnConstraintReference::getColumnName).collect(Collectors.joining(", "));
	}
}
