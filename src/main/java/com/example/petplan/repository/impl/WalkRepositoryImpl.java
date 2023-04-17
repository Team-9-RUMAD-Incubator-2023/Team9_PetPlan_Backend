package com.example.petplan.repository.impl;

import com.example.petplan.entity.Walk;
import com.example.petplan.repository.WalkRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public abstract class WalkRepositoryImpl implements WalkRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Walk> getAllWalks() {
        return entityManager.createQuery("SELECT w FROM Walk w", Walk.class).getResultList();
    }

    @Override
    public Walk getWalkById(Long id) {
        return entityManager.find(Walk.class, id);
    }

    @Override
    public void addWalk(Walk walk) {
        entityManager.persist(walk);
    }

    @Override
    public void updateWalk(Walk walk) {
        entityManager.merge(walk);
    }

    @Override
    public void deleteWalk(Long id) {
        Walk walk = getWalkById(id);
        entityManager.remove(walk);
    }

}
