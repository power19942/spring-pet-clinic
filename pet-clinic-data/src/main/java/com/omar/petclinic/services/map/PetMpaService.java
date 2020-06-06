package com.omar.petclinic.services.map;

import com.omar.petclinic.model.Pet;
import com.omar.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMpaService extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object,object.getId());
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
