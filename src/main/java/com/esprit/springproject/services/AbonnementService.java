package com.esprit.springproject.services;

import com.esprit.springproject.entities.Abonnement;
import com.esprit.springproject.entities.enumm.TypeAbonnement;
import com.esprit.springproject.repositories.AbonnementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

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
    public Set<Abonnement> getAbonnementByType(TypeAbonnement type){


    return  AbonnementRepository.findAbonnementByTypeAbon(type);

    }

    @Override
    public void deleteAbonnement(Integer idAbonnement) {
        AbonnementRepository.deleteById(idAbonnement);
    }
}