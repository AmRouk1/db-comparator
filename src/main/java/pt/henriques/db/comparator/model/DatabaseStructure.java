package pt.henriques.db.comparator.model;

import java.util.List;

import lombok.*;

@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class DatabaseStructure {

	private String user;
	private List<Tablespace> tablespaces;
	private List<TableStructure> tableStrucures;
}
