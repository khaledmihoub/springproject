package com.esprit.springproject.services;

import com.esprit.springproject.entities.Cours;
import com.esprit.springproject.entities.Inscription;
import com.esprit.springproject.entities.Piste;
import com.esprit.springproject.entities.Skieur;
import com.esprit.springproject.entities.enumm.TypeAbonnement;
import com.esprit.springproject.repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SkieurService implements ISkieurService {
    SkieurRepository skirepo;
    AbonnementRepository arepo;
    InscriptionRepository irepo;
    PisteRepository pisrepo;
    CoursRepository cr;
    @Override
    public List<Skieur> retrieveAllSkieur() {
        return skirepo.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur s) {
        return skirepo.save(s);
    }
    @Override
    public Skieur addSkieurwithabonn(Skieur s) {
        arepo.save(s.getAbonnement());
        return skirepo.save(s);
    }
    @Override
    public Skieur addSkieurwithinscriptions(Skieur s) {
        for (Inscription inscription : s.getInscriptions()) {
                irepo.save(inscription);
        }
        return skirepo.save(s);
    }
    @Override
    public Skieur updateSkieur(Skieur s) {

        return skirepo.save(s);
    }

    @Override
    public Skieur retrieveSkieur(Integer idSkieur) {

        return skirepo.findById(idSkieur).get();
    }

    @Override
    public void deleteSkieur(Integer idSkieur) {
        skirepo.deleteById(idSkieur);
    }

    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste){
      Skieur s =  skirepo.findByNumSkieur(numSkieur);
      Piste p =  pisrepo.findByNumPiste(numPiste);
      s.getPistes().add(p);
       return s;

    }

    public Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours){
        Cours c = cr.findByNumCours(numCours);
        for (Inscription inscription : skieur.getInscriptions()) {
            inscription.setCour(c);
        }
        return skirepo.save(skieur);
    }

    public List<Skieur> retrieveSkieursByAbonnementType(TypeAbonnement typeAbonnement){
        return skirepo.findByAbonnement_TypeAbon(typeAbonnement);
    }




}