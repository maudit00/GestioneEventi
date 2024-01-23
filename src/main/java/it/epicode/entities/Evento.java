package it.epicode.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "eventi")
public class Evento {
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    @Column
}
