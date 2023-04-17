package com.example.petplan.repository;

import com.example.petplan.entity.Walk;

import java.time.LocalDate;
import java.util.List;

public interface WalkRepository {
    List<Walk> findAll();
    Walk findById(Long id);
    List<Walk> findByDate(LocalDate date);
    Walk save(Walk walk);
    void delete(Walk walk);

    List<Walk> getAllWalks();

    Walk getWalkById(Long id);

    void addWalk(Walk walk);

    void updateWalk(Walk walk);

    void deleteWalk(Long id);
}
