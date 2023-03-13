package com.esprit.springproject.services;
import com.esprit.springproject.entities.Abonnement;
import com.esprit.springproject.entities.enumm.TypeAbonnement;

import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnement();

    Abonnement addAbonnement(Abonnement a);

    Abonnement updateAbonnement (Abonnement a);

    Abonnement retrieveAbonnement (Integer idAbonnement);

    void deleteAbonnement( Integer idAbonnement);
    Set<Abonnement> getAbonnementByType(TypeAbonnement type);

}
