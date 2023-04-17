package com.example.petplan.repository.impl;

import com.example.petplan.entity.Pet;
import com.example.petplan.repository.PetRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public abstract class PetRepositoryImpl implements PetRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Pet> getAllPets() {
        return entityManager.createQuery("SELECT p FROM Pet p", Pet.class).getResultList();
    }

    @Override
    public Pet getPetById(Long id) {
        return entityManager.find(Pet.class, id);
    }

    @Override
    public void addPet(Pet pet) {
        entityManager.persist(pet);
    }

    @Override
    public void updatePet(Pet pet) {
        entityManager.merge(pet);
    }

    @Override
    public void deletePet(Long id) {
        Pet pet = getPetById(id);
        entityManager.remove(pet);
    }

}
