package pt.henriques.db.comparator.model.table.column;

import java.io.Serializable;

import lombok.*;

@SuppressWarnings("serial")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode
public class ColumnStructureId implements Serializable {

	private String tableName;
	private String name;
}