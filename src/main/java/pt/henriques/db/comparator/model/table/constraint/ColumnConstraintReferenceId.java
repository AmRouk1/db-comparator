package pt.henriques.db.comparator.model.table.constraint;

import java.io.Serializable;

import lombok.*;

@SuppressWarnings("serial")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode
public class ColumnConstraintReferenceId implements Serializable {

	private String name;
	private String ownerName;
	private String tableName;
	private String columnName;
}
