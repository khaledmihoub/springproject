package com.esprit.springproject.repositories;

import com.esprit.springproject.entities.Moniteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MoniteurRepository extends JpaRepository<Moniteur, Integer> {







}
