package com.example.springpetclinic.services.map;

import com.example.springpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;
    final Long ownerId = 1L;
    final String lastName = "smith";
    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetMapService(),new PetTypeMapService());
        Owner owner1 = Owner.builder().build();
        owner1.setId(ownerId);
        owner1.setLastName(lastName);
        ownerMapService.save(owner1);
        System.out.println();

    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(1,ownerSet.size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);
        assertEquals(0,ownerMapService.findAll().size());

    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));
        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void saveExistingId() {
        Owner owner2 = Owner.builder().build();
        long id = 2L;
        owner2.setId(id);
        Owner savedOwner = ownerMapService.save(owner2);
        assertEquals(id,savedOwner.getId());


    }
    @Test
    void saveNoId(){
        Owner owner3 = Owner.builder().build();
        Owner savedOwner = ownerMapService.save(owner3);
        assertEquals(2L,savedOwner.getId());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(ownerId,owner.getId());
    }

    @Test
    void findByLastName() {
      Owner lastNameOwner = ownerMapService.findByLastName(lastName);
      assertEquals(1,lastNameOwner.getId());
    }

    @Test
    void findByLastNameNotFound() {
        Owner lastNameOwner = ownerMapService.findByLastName("foo");
        assertNull(lastNameOwner);
    }
}