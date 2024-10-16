package com.example.foyerbichadha.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne(cascade = CascadeType.ALL)
    private Foyer foyer;

    @OneToMany(mappedBy = "chambre", cascade = CascadeType.ALL)
    private List<chambre> chambre;



}
