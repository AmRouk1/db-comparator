package pt.henriques.db.comparator.jpa.repository.user;


import org.springframework.stereotype.Repository;

import pt.henriques.db.comparator.jpa.repository.ReadRepository;
import pt.henriques.db.comparator.model.tablespace.TablespaceStructure;

@Repository
public interface UserTablespaceRepository extends ReadRepository<TablespaceStructure, String>{ }