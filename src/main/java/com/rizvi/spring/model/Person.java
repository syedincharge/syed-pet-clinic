package com.rizvi.spring.model;

import javax.persistence.Column;

public class Person {

   // @Column(name = "first_name")
    private String firstName;

   // @Column(name = "last_name")
    private String lastName;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
