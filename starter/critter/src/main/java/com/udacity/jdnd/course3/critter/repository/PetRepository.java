package com.udacity.jdnd.course3.critter.repository;

import com.udacity.jdnd.course3.critter.entitie.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    List<Pet> findAllByOwnerId(Long ownerId);
}
