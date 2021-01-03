package com.example.springpetclinic.services.map;

import com.example.springpetclinic.model.Pet;
import com.example.springpetclinic.model.Vet;
import com.example.springpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapservice<Vet,Long> implements CrudService<Vet,Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        super.save(vet.getId(), vet);
        return vet;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
