package com.esprit.springproject.repositories;

import com.esprit.springproject.entities.Abonnement;
import com.esprit.springproject.entities.enumm.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;


@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement, Integer> {

public Set<Abonnement> findAbonnementByTypeAbon(TypeAbonnement ta);
}
