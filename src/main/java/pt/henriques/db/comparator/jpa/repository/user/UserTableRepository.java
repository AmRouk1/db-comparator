package pt.henriques.db.comparator.jpa.repository.user;

import org.springframework.stereotype.Repository;

import pt.henriques.db.comparator.jpa.repository.ReadRepository;
import pt.henriques.db.comparator.model.table.TableStructure;

@Repository
public interface UserTableRepository extends ReadRepository<TableStructure, String>{ }