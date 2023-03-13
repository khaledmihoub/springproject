package com.esprit.springproject.repositories;

import com.esprit.springproject.entities.Cours;
import com.esprit.springproject.entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CoursRepository extends JpaRepository<Cours, Integer> {


    public Cours findByNumCours(Long num);

}
