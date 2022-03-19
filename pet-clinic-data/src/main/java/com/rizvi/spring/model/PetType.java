package com.rizvi.spring.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class PetType extends BaseEntity {


    public PetType(Long id, String name) {
        super();
        this.name = name;
    }

    @Column(name = "name")
    private String name;

    public PetType() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
