package it.epicode.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

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
    @Column (name = "descrizione")
    private String descrizione;
    @Enumerated (EnumType.STRING)
    @Column (name = "tipo_evento")
    private TipoEvento tipoEvento;
    @Column (name = "numero_massimo_partecipanti")
    private int numeroMassimoPartecipanti;
    @OneToMany ( mappedBy = "evento", cascade = CascadeType.REMOVE)
    private List<Partecipazione> partecipazione;

    @OneToOne
    @JoinColumn(name = "location_fk")
    private Location location;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public List<Partecipazione> getPartecipazione() {
        return partecipazione;
    }

    public void setPartecipazione(List<Partecipazione> partecipazione) {
        this.partecipazione = partecipazione;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public void setData_evento(LocalDate data_evento) {
        this.data_evento = data_evento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", data_evento=" + data_evento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                '}';
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public Evento(int id, String titolo, LocalDate data_evento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti) {
        this.id = id;
        this.titolo = titolo;
        this.data_evento = data_evento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public Evento() {
    }
}
