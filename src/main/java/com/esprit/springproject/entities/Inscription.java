package com.esprit.springproject.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idInscription")
    private Integer idInscription;
    private Long numInscription;
    private Integer numSemaine; // Clé prim
    @ManyToOne
    private Skieur skieur;
    @ManyToOne
    private Cours cour;
}
