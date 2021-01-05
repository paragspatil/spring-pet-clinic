package com.example.springpetclinic.services.map;

import com.example.springpetclinic.model.Owner;
import com.example.springpetclinic.services.CrudService;
import com.example.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapservice<Owner,Long> implements OwnerService {


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

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
