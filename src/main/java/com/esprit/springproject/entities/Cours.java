package com.esprit.springproject.entities;

import com.esprit.springproject.entities.enumm.Couleur;
import com.esprit.springproject.entities.enumm.Support;
import com.esprit.springproject.entities.enumm.TypeCours;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCours")
    private Integer idCours; // Clé prim
    private Long numCours;
    private Integer niveau;
    private Float prix;
    private Integer creneau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    @OneToMany(mappedBy = "cour")
    private Set<Inscription> inscriptions;


}
