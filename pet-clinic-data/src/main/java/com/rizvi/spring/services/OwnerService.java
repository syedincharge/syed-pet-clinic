package com.rizvi.spring.services;

import com.rizvi.spring.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

     Owner findByLastName(String lastName);

}
