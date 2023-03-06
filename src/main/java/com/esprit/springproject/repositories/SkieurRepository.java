package com.esprit.springproject.repositories;


import com.esprit.springproject.entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SkieurRepository extends JpaRepository<Skieur, Integer> {



}
