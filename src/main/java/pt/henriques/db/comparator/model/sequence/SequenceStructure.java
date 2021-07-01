package pt.henriques.db.comparator.model.sequence;

import javax.persistence.*;

import lombok.*;

@Getter @Setter
@Entity
@Table(name = "USER_SEQUENCES")
public class SequenceStructure {

	@Id @Column(name = "SEQUENCE_NAME")	private String name;

		@Column(name = "CYCLE_FLAG")	private boolean cycleFlag;
		@Column(name = "EXTEND_FLAG")	private boolean extendFlag;
		@Column(name = "KEEP_VALUE")	private boolean keepValue;
		@Column(name = "ORDER_FLAG")	private boolean orderFlag;
		@Column(name = "SCALE_FLAG")	private boolean scaleFlag;
		@Column(name = "SESSION_FLAG")	private boolean sessionFlag;

		@Column(name = "INCREMENT_BY")	private Integer incrementBy;
		@Column(name = "LAST_NUMBER")	private Integer lastNumber;
		@Column(name = "MAX_VALUE")		private Integer maxValue;
		@Column(name = "MIN_VALUE")		private Integer minValue;
}