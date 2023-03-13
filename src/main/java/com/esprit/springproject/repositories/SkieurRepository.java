package com.esprit.springproject.repositories;


import com.esprit.springproject.entities.Piste;
import com.esprit.springproject.entities.Skieur;
import com.esprit.springproject.entities.enumm.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface SkieurRepository extends JpaRepository<Skieur, Integer> {

    public Skieur findByNumSkieur(Long numSkieur);
    public List<Skieur> findByAbonnement_TypeAbon(TypeAbonnement type);

}
