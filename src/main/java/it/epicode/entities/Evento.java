package it.epicode.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "eventi")
public class Evento {
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    @Column (name = "id")
    private int id;

    @Column (name = "titolo")
    private String titolo;
    @Column (name = "data_evento")
    private LocalDate data_evento;

}
