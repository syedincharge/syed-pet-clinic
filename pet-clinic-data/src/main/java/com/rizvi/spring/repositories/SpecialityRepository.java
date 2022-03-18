package com.rizvi.spring.repositories;

import com.rizvi.spring.model.Speciality;
import org.springframework.data.repository.CrudRepository;

import javax.sql.rowset.CachedRowSet;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {

}
