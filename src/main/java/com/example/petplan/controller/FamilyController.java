package com.example.petplan.controller;

import com.example.petplan.entity.Family;
import com.example.petplan.entity.Member;
import com.example.petplan.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/families")
public class FamilyController {

    @Autowired
    private FamilyService familyService;

    @PostMapping
    public ResponseEntity<Family> createFamily(@RequestBody Family family) {
        Family newFamily = familyService.createFamily(family);
        return new ResponseEntity<>(newFamily, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Family> getFamilyById(@PathVariable("id") Long id) {
        Family family = familyService.getFamilyById(id);
        return new ResponseEntity<>(family, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Family> updateFamily(@PathVariable("id") Long id, @RequestBody Family family) {
        Family updatedFamily = familyService.updateFamily(id, family);
        return new ResponseEntity<>(updatedFamily, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFamily(@PathVariable("id") Long id) {
        familyService.deleteFamily(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}/members")
    public ResponseEntity<Void> addFamilyMember(@PathVariable Long id, @RequestBody Member member) {
        familyService.addFamilyMember(id, member);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
