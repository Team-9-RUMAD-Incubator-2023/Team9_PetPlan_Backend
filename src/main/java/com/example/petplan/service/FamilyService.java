package com.example.petplan.service;

import java.util.List;
import java.util.Optional;

import com.example.petplan.entity.Family;
import com.example.petplan.entity.Member;

public interface FamilyService {
    List<Family> getAllFamilies();
    Family createFamily(Family family);
    Family updateFamily(Long id, Family family);

    Family getFamilyById(Long id);

    Family saveFamily(Family family);

    void deleteFamily(Long id);

    void addFamilyMember(Long id, Member member);
}
