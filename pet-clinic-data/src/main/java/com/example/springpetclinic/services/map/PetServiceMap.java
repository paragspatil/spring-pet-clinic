package com.example.springpetclinic.services.map;
import com.example.springpetclinic.model.Pet;
import com.example.springpetclinic.services.CrudService;
import com.example.springpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapservice<Pet,Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        super.save(pet.getId(), pet);
        return pet;
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
