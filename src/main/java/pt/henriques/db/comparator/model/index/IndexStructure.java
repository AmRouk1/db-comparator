package pt.henriques.db.comparator.model.index;

import javax.persistence.*;

import lombok.*;

@Getter @Setter
@Entity
@Table(name = "USER_INDEXES")
public class IndexStructure {

	@Id @Column(name = "INDEX_NAME")	private String name;
		@Column(name = "STATUS")		private String status;
		@Column(name = "TABLE_NAME")	private String tableName;
		@Column(name = "TABLE_OWNER")	private String tableOwner;
		@Column(name = "TABLESPACE")	private String tablespaceName;
		@Column(name = "TABLE_TYPE")	private String tableType;
		@Column(name = "INDEX_TYPE")	private String type;
		@Column(name = "UNIQUENESS")	private String uniqueness;
}