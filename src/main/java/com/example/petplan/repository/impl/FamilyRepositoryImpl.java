package com.example.petplan.repository.impl;

import com.example.petplan.entity.Family;
import com.example.petplan.entity.Member;
import com.example.petplan.repository.FamilyRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

import java.util.*;

@Repository
@Transactional
public abstract class FamilyRepositoryImpl implements FamilyRepository {

    private final Map<Long, Family> familyMap = new HashMap<>();

    @Override
    public Family save(Family family) {
        familyMap.put(family.getId(), family);
        return family;
    }

    @Override
    public List<Family> findAll() {
        return new ArrayList<>(familyMap.values());
    }

    @Override
    public Family findById(Long id) {
        return familyMap.get(id);
    }

    @Override
    public void delete(Long id) {
        familyMap.remove(id);
    }

    @Override
    public void addFamilyMember(Long id, Member member) {
        Family family = familyMap.get(id);
        if (family != null) {
            family.addMember(member);
        }
    }

}
