package com.esprit.springproject.services;

import com.esprit.springproject.entities.Cours;
import com.esprit.springproject.repositories.CoursRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CoursService implements ICoursService {

    CoursRepository CoursR;
    @Override
    public List<Cours> retrieveAllCours() {
        return CoursR.findAll();
    }

    @Override
    public Cours addcours(Cours c) {
        CoursR.save(c);
        return c;
    }

    @Override
    public Cours updatecours(Cours c) {
        return CoursR.save(c);
    }

    @Override
    public Cours retrievecours(Integer idCours) {
        return CoursR.findById(idCours).get();
    }

    @Override
    public void deletecours(Integer idCours) {
        CoursR.deleteById(idCours);

    }
}