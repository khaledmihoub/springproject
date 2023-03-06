package com.esprit.springproject.services;
import com.esprit.springproject.entities.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPiste();

    Piste addPiste(Piste p );

    Piste updatePiste (Piste p );

    Piste retrievePiste (Integer idPiste);

    void deletePiste( Integer idPiste);
}