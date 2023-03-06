package com.esprit.springproject.services;
import com.esprit.springproject.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscription();

    Inscription addInscription(Inscription i);

    Inscription updateInscription (Inscription i);

    Inscription retrieveInscription (Integer idInscription);

    void deleteInscription( Integer idInscription);
}