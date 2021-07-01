package pt.henriques.db.comparator.model.table.constraint;

import javax.persistence.*;

import lombok.*;

@Getter @Setter
@Entity
@Table(name = "USER_CONS_COLUMNS")
@IdClass(ColumnConstraintReferenceId.class)
public class ColumnConstraintReference {

	@Id @Column(name = "CONSTRAINT_NAME")	private String name;
	@Id @Column(name = "OWNER")				private String ownerName;
	@Id @Column(name = "TABLE_NAME")		private String tableName;
	@Id @Column(name = "COLUMN_NAME")		private String columnName;
		@Column(name = "POSITION")			private Integer position;
}
