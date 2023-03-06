package com.esprit.springproject.entities;

import com.esprit.springproject.entities.enumm.Support;
import com.esprit.springproject.entities.enumm.TypeAbonnement;
import com.esprit.springproject.entities.enumm.TypeCours;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idAbonnement")
    private Integer idAbonnement; // Clé prim
    private Date dateDebut;
    private Date dateFin;
    private Float prixAbon;

    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;

}
