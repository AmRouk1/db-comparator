package pt.henriques.db.comparator.model.table.constraint;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Getter @Setter
@Entity
@Table(name = "USER_CONSTRAINTS")
public class ConstraintStructure {

	@Id @Column(name = "CONSTRAINT_NAME")		private String name;
		@Column(name = "R_CONSTRAINT_NAME")		private String constraintNameReferenced;
		@Column(name = "DELETE_RULE")			private String deleteRule;
		@Column(name = "OWNER")					private String owner;
		@Column(name = "R_OWNER")				private String ownerReferenced;
		@Column(name = "TABLE_NAME") 			private String tableName;
		@Column(name = "SEARCH_CONDITION")		private String searchCondition;
		@Column(name = "SEARCH_CONDITION_VC")	private String searchConditionVc;
		@Column(name = "STATUS")				private String status;
		@Column(name = "CONSTRAINT_TYPE")		private String type;

		@OneToMany(mappedBy = "name") List<ColumnConstraintReference> columns;
}