package com.esprit.springproject.services;

import com.esprit.springproject.entities.Inscription;
import com.esprit.springproject.repositories.InscriptionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionService implements IInscriptionService {
    InscriptionRepository irep;

    @Override
    public List<Inscription> retrieveAllInscription() {
        return irep.findAll();
    }

    @Override
    public Inscription addInscription(Inscription i) {
        return irep.save(i);
    }

    @Override
    public Inscription updateInscription(Inscription i) {
        return irep.save(i);
    }

    @Override
    public Inscription retrieveInscription(Integer idInscription) {
        return irep.findById(idInscription).get();
    }

    @Override
    public void deleteInscription(Integer idInscription) {
        irep.deleteById(idInscription);
    }
}