package com.example.petplan.repository;

import com.example.petplan.entity.Family;

import java.util.List;

public interface FamilyRepository {
    List<Family> findAll();
    Family findById(Long id);
    Family save(Family family);
    void delete(Family family);

    List<Family> getAllFamilies();

    Family getFamilyById(Long id);

    void addFamily(Family family);

    void updateFamily(Family family);

    void deleteFamily(Long id);

}
