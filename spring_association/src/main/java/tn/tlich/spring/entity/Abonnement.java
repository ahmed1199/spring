package tn.tlich.spring.entity;


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
@Table(name = "Abonnement")
public  class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_Abonnement", nullable = false)
        private Long numAbon;
        private Date dateDebut;
        private Date dateFin;
        private Float prixAbon;
        @Enumerated(EnumType.STRING)
        private TypeAbonnement typeAbon;
        @OneToOne(mappedBy = "abonnement")
        private Skieur skieur;


    }