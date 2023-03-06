package com.esprit.springproject.services;
import com.esprit.springproject.entities.Abonnement;

import java.util.List;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnement();

    Abonnement addAbonnement(Abonnement a);

    Abonnement updateAbonnement (Abonnement a);

    Abonnement retrieveAbonnement (Integer idAbonnement);

    void deleteAbonnement( Integer idAbonnement);}