package com.esprit.springproject.entities;

import com.esprit.springproject.entities.enumm.Couleur;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdSkieur")
    private Integer IdSkieur; // Clé prim
    private Long numSkieur;
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
