package com.rizvi.spring.repositories;

import com.rizvi.spring.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
