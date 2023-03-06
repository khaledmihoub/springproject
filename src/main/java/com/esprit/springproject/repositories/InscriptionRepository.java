package com.esprit.springproject.repositories;

import com.esprit.springproject.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InscriptionRepository extends JpaRepository<Inscription, Integer> {



}
