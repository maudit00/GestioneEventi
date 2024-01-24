package it.epicode.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table (name = "persone")
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    private String nome;
    private String cognome;

    private String email;
    @Column (name = "data_di_nascita")
    private LocalDate dataDiNascita;
    private char sesso;


    @OneToMany(mappedBy = "partecipazione")
    private List<Partecipazione> partecipazioneList;


}
