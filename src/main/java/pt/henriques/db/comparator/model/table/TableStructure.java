package pt.henriques.db.comparator.model.table;

import java.util.List;

import javax.persistence.*;

import lombok.*;
import pt.henriques.db.comparator.model.*;
import pt.henriques.db.comparator.model.table.column.ColumnStructure;
import pt.henriques.db.comparator.model.table.constraint.ConstraintStructure;

@Entity
@Table(name = "USER_TABLES")
@Getter @Setter
public class TableStructure {

	@Id @Column(name = "TABLE_NAME") 		private String 						tableName;
		@Column(name = "TABLESPACE_NAME")	private String 						tableSpaceName;
		@Column(name = "STATUS")			private String 						status;

		@OneToMany(mappedBy = "tableName") private List<ColumnStructure> 		columnStructures;
		@OneToMany(mappedBy = "tableName") private List<ConstraintStructure> 	constraintStructures;
}