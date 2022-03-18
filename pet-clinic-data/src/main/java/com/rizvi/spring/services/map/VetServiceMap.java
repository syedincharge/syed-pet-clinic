package com.rizvi.spring.services.map;

import com.rizvi.spring.model.Speciality;
import com.rizvi.spring.model.Vet;
import com.rizvi.spring.services.SpecialityService;
import com.rizvi.spring.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
      super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
      super.delete(object);
    }

    @Override
    public Vet save(Vet object) {

        if(object.getSpecialities().size()  > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
