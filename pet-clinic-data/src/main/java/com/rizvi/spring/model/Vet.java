package com.rizvi.spring.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vets")
public class Vet extends Person{
    private static final Long id = null;
    @ManyToMany(fetch = FetchType.EAGER)
   @JoinTable(name = "vet_specialities", joinColumns=@JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();

    public Vet(String firstName, String lastName) {
        super();
    }

//    public Vet() {
//
//        super();
//    }

    public Set<Speciality> getSpecialities() {

        return specialities;
    }

    public void setSpeciality(Set<Speciality> specialities) {

        this.specialities = specialities;
    }
}
