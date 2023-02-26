package tn.tlich.spring.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Inscription")
public  class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_Inscription", nullable = false)
        private Long numInscription;
        private Integer numSemaine;
        @ManyToOne
         private Skieur skieur;

        @ManyToOne
         private Cours cours;




    }