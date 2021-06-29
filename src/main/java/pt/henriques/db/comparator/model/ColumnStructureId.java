package pt.henriques.db.comparator.model;

import java.io.Serializable;

import lombok.*;

@SuppressWarnings("serial")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode
public class ColumnStructureId implements Serializable {

	private String tableName;
	private String columnName;
}