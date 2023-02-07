package com.esprit.springproject.entities;

import com.esprit.springproject.entities.enumm.TypeAbonnement;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idMoniteur")
    private Integer idMoniteur; // Clé prim
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecru;
    @OneToMany
    private Set<Cours> cours;

}
