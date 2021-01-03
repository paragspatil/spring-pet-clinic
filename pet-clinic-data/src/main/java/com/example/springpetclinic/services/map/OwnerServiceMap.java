package com.example.springpetclinic.services.map;

import com.example.springpetclinic.model.Owner;
import com.example.springpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapservice<Owner,Long> implements CrudService<Owner,Long> {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Owner owner) {
     super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        super.save(owner.getId(), owner);
        return owner;
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}