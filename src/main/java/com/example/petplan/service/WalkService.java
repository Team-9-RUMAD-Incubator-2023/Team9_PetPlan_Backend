package com.example.petplan.service;

import java.util.List;
import java.util.Optional;

import com.example.petplan.entity.Walk;

public interface WalkService {
    List<Walk> getAllWalks();

    Walk createWalk(Walk walk);
    Walk updateWalk(Long id, Walk walk);

    Walk getWalkById(Long id);

    Walk saveWalk(Walk walk);

    void deleteWalk(Long id);
}
