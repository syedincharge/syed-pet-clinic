package com.rizvi.spring.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity //telling JPA this is the entity that is gonna persisted into the database
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    @Column(name = "description")
    private String description;

    public Speciality(Long id) {

        super();
    }

    public Speciality() {

    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
