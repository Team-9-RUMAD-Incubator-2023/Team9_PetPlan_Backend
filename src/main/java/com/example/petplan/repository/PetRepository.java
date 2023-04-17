package com.example.petplan.repository;

import com.example.petplan.entity.Pet;

import java.util.List;

public interface PetRepository {
    List<Pet> findAll();
    Pet findById(Long id);
    Pet save(Pet pet);
    void delete(Pet pet);

    List<Pet> getAllPets();

    Pet getPetById(Long id);

    void addPet(Pet pet);

    void updatePet(Pet pet);

    void deletePet(Long id);
}
