package tn.tlich.spring.entity;


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
@Table(name = "Skieur")
public  class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_skieur", nullable = false)
        private Long numSkieur;
        private String nomS;
        private String prenomS;

        private Date dateNaissance;
        private String ville;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Piste> pistes;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "numInscription")
    private Set<Inscription> inscriptions;

    @OneToOne
    private Abonnement abonnement;



    }