package pt.henriques.db.comparator.model;

import java.util.List;

import lombok.*;
import pt.henriques.db.comparator.model.index.IndexStructure;
import pt.henriques.db.comparator.model.table.TableStructure;
import pt.henriques.db.comparator.model.tablespace.TablespaceStructure;

@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class DefinitionStructure {

	private String user;
	private List<TablespaceStructure> tablespaces;
	private List<TableStructure> tableStrucures;
	private List<IndexStructure> indexStructures;
}