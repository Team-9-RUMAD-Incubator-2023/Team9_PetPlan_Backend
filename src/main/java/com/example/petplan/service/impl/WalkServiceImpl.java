package com.example.petplan.service.impl;

import com.example.petplan.entity.Walk;
import com.example.petplan.repository.WalkRepository;
import com.example.petplan.service.WalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class WalkServiceImpl implements WalkService {

    private final WalkRepository walkRepository;

    @Autowired
    public WalkServiceImpl(WalkRepository walkRepository) {
        this.walkRepository = walkRepository;
    }

    @Override
    public List<Walk> getAllWalks() {
        return walkRepository.findAll();
    }

    @Override
    public Walk getWalkById(Long id) {
        return walkRepository.findById(id);
    }

    @Override
    public Walk saveWalk(Walk walk) {
        return walkRepository.save(walk);
    }

    @Override
    public void deleteWalk(Long id) {
        walkRepository.deleteWalk(id);
    }
}
