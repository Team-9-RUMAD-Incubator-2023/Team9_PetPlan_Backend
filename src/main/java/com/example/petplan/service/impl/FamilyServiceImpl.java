package com.example.petplan.service.impl;

import com.example.petplan.entity.Family;
import com.example.petplan.entity.Member;
import com.example.petplan.repository.FamilyRepository;
import com.example.petplan.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class FamilyServiceImpl implements FamilyService {

    private final FamilyRepository familyRepository;

    @Autowired
    public FamilyServiceImpl(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }

    @Override
    public List<Family> getAllFamilies() {
        return familyRepository.findAll();
    }

    @Override
    public Family getFamilyById(Long id) {
        return familyRepository.findById(id);
    }

    @Override
    public Family saveFamily(Family family) {
        return familyRepository.save(family);
    }

    @Override
    public void deleteFamily(Long id) {
        familyRepository.deleteFamily(id);
    }

    @Override
    public void addFamilyMember(Long id, Member member) {
        familyRepository.addFamilyMember(id, member);
    }
}
