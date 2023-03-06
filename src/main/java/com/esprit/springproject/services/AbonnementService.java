package com.esprit.springproject.services;

import com.esprit.springproject.entities.Abonnement;
import com.esprit.springproject.repositories.AbonnementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AbonnementService implements IAbonnementService{

    AbonnementRepository AbonnementRepository ;
    @Override
    public List<Abonnement> retrieveAllAbonnement() {
        return AbonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement a) {
        AbonnementRepository.save(a);
        return a;
    }

    @Override
    public Abonnement updateAbonnement(Abonnement a) {
        AbonnementRepository.save(a);
        return a;
    }

    @Override
    public Abonnement retrieveAbonnement(Integer idAbonnement) {
        return AbonnementRepository.findById(idAbonnement).get();
    }

    @Override
    public void deleteAbonnement(Integer idAbonnement) {
        AbonnementRepository.deleteById(idAbonnement);
    }
}