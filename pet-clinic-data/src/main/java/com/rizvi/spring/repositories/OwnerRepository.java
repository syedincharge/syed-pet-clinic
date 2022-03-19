package com.rizvi.spring.repositories;

import com.rizvi.spring.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    

    List<Owner> findAllByLastNameLike(String lastName);

    Owner findByLastName(String lastName);
}
