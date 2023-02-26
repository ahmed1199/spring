package tn.tlich.spring.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Cours")
public  class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_Cours", nullable = false)
        private Long numCours;
        private Integer niveau;
        private Float prix;
        @Enumerated(EnumType.STRING)
        private Support support;
        @Enumerated(EnumType.STRING)
        private TypeCours typeCours;
        private Integer creneau;
        @OneToMany(cascade = CascadeType.ALL,mappedBy = "cours")
       private Set<Inscription> inscriptions;
       



    }