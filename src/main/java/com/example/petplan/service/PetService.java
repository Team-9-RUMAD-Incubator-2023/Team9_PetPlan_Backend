package com.example.petplan.service;

import java.util.List;
import java.util.Optional;

import com.example.petplan.entity.Pet;

public interface PetService {
    List<Pet> getAllPets();

    Pet createPet(Pet pet);
    Pet updatePet(Long id, Pet pet);

    Pet getPetById(Long id);

    Pet savePet(Pet pet);

    void deletePet(Long id);
}
