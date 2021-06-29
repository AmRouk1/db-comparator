package pt.henriques.db.comparator.jpa.repository;

import org.springframework.stereotype.Repository;

import pt.henriques.db.comparator.model.TableStructure;

@Repository
public interface UserTableRepository extends ReadRepository<TableStructure, String>{ }