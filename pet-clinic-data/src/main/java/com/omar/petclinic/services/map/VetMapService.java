package com.omar.petclinic.services.map;

import com.omar.petclinic.model.Pet;
import com.omar.petclinic.model.Vet;
import com.omar.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {
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
        return super.save(object,object.getId());
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
