package com.esprit.springproject.repositories;

import com.esprit.springproject.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours, Integer> {
}
