package pt.henriques.db.comparator.model.table.column;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
@Table(name = "USER_TAB_COLS")
@IdClass(ColumnStructureId.class)
public class ColumnStructure {

	@Id @Column(name = "TABLE_NAME") 		private String tableName;
	@Id @Column(name = "COLUMN_NAME") 		private String name;
		@Column(name = "DATA_TYPE")			private String dataType;
		@Column(name = "DATA_LENGTH")		private long dataLength;
		@Column(name = "DATA_PRECISION")	private Integer dataPrecision;
		@Column(name = "NULLABLE")			private boolean nullable;
		@Column(name = "COLUMN_ID")			private int columnId;
}
