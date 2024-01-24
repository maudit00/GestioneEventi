package it.epicode.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "partecipazioni")
public class Partecipazione {
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private int id;



    @ManyToOne
    @JoinColumn ( name = "id_persona")
    private Persona persona;
    @ManyToOne
    @JoinColumn ( name = "id_evento")
    private Evento evento;
    private Stato stato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public Partecipazione(int id, Persona persona, Evento evento, Stato stato) {
        this.id = id;
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

    public Partecipazione() {
    }
}
