package com.esprit.springproject.services;

import com.esprit.springproject.entities.Piste;
import com.esprit.springproject.repositories.PisteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteService implements IPisteService {
    PisteRepository pistr;
    @Override
    public List<Piste> retrieveAllPiste() {
        return pistr.findAll();
    }

    @Override
    public Piste addPiste(Piste p) {
        return pistr.save(p);
    }

    @Override
    public Piste updatePiste(Piste p) {
        return pistr.save(p);
    }

    @Override
    public Piste retrievePiste(Integer idPiste) {
        return pistr.findById(idPiste).get();
    }

    @Override
    public void deletePiste(Integer idPiste) {
        pistr.deleteById(idPiste);

    }
}
