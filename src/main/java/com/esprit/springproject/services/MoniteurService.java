package com.esprit.springproject.services;

import com.esprit.springproject.entities.Moniteur;
import com.esprit.springproject.repositories.MoniteurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class MoniteurService implements IMoniteurService{
MoniteurRepository mr ;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return mr.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur e) {
        return mr.save(e);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur e) {
        return mr.save(e);
    }

    @Override
    public Moniteur retrieveMoniteur(Integer idMoniteur) {
        return mr.findById(idMoniteur).get();
    }

    @Override
    public void deleteMoniteur(Integer idMoniteur) {
        mr.deleteById(idMoniteur);
    }
}
