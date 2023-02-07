package com.esprit.springproject.entities;

import com.esprit.springproject.entities.enumm.Couleur;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdSkieur")
    private Integer IdSkieur; // Clé prim
    private Long numSkieur; // Clé primaire
    private String numS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;

    @OneToOne
    private Abonnement abonnement;
    @ManyToMany
    private Set<Piste> pistes;
    @OneToMany(mappedBy = "skieur")
    private Set<Inscription> inscriptions;
}
