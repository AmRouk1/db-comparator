package pt.henriques.db.comparator.jpa.repository;

import java.util.*;

import org.springframework.data.repository.*;

@NoRepositoryBean
public interface ReadRepository<T, ID> extends Repository<T, ID> {

    Optional<T> findById(ID id);
    List<T> findAll();
}