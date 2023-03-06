package com.esprit.springproject.services;

import com.esprit.springproject.entities.Inscription;
import com.esprit.springproject.entities.Skieur;
import com.esprit.springproject.repositories.AbonnementRepository;
import com.esprit.springproject.repositories.InscriptionRepository;
import com.esprit.springproject.repositories.SkieurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SkieurService implements ISkieurService {
    SkieurRepository skirepo;
    AbonnementRepository arepo;
    InscriptionRepository irepo;
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
}