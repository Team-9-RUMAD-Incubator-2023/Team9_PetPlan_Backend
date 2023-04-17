package com.example.petplan.repository.impl;

import com.example.petplan.entity.Family;
import com.example.petplan.repository.FamilyRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public abstract class FamilyRepositoryImpl implements FamilyRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Family> getAllFamilies() {
        return entityManager.createQuery("SELECT f FROM Family f", Family.class).getResultList();
    }

    @Override
    public Family getFamilyById(Long id) {
        return entityManager.find(Family.class, id);
    }

    @Override
    public void addFamily(Family family) {
        entityManager.persist(family);
    }

    @Override
    public void updateFamily(Family family) {
        entityManager.merge(family);
    }

    @Override
    public void deleteFamily(Long id) {
        Family family = getFamilyById(id);
        entityManager.remove(family);
    }

}
