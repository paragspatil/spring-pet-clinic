package com.example.springpetclinic.services.springdatajpa;

import com.example.springpetclinic.model.PetType;
import com.example.springpetclinic.repositories.PetTypeRepository;
import com.example.springpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDjpaService implements PetTypeService {
    private final PetTypeRepository petTypeRepository;

    public PetTypeSDjpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypeSet = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypeSet::add);
        return petTypeSet;
    }

    @Override
    public PetType findById(Long aLong) {

        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType petType) {
        return petTypeRepository.save(petType);
    }

    @Override
    public void delete(PetType petType) {
    petTypeRepository.delete(petType);
    }

    @Override
    public void deleteById(Long aLong) {
         petTypeRepository.deleteById(aLong);
    }
}
