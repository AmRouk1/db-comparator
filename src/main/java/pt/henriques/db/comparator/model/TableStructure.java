package pt.henriques.db.comparator.model;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "USER_TABLES")
@Getter @Setter
public class TableStructure {

	@Id @Column(name = "TABLE_NAME") 					private String tableName;
		@Column(name = "TABLESPACE_NAME")				private String tableSpaceName;
		@Column(name = "STATUS")						private String status;
		@OneToMany(fetch = FetchType.EAGER, mappedBy = "tableName") private List<ColumnStructure> columnStructures;
}