package com.rizvi.spring.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@MappedSuperclass annotation indicates that this object is not to be created in the database
// that we are expecting other classes to inherit from it.
@MappedSuperclass //this is saying "hey JPA, we're going to inherit from this class or other classes are going to inheriting it"
public class BaseEntity implements Serializable {

    @Id //this annotation tells JPA that this is the ID value
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //prefer boxed types to primitives(long) for hibernate, in that boxed types can be Null whereas primitive types cannot.

    public boolean isNew() {
        return this.id == null;
    }
    
}
