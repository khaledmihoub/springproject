package com.esprit.springproject.repositories;

import com.esprit.springproject.entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PisteRepository extends JpaRepository<Piste, Integer> {
    public Piste findByNumPiste(Long numPiste);
}
