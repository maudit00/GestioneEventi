package it.epicode.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "location")
public class Location {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String Nome;
    private String Città;

    public Location() {
    }

    public Location(int id, String nome, String città) {
        this.id = id;
        Nome = nome;
        Città = città;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCittà() {
        return Città;
    }

    public void setCittà(String città) {
        Città = città;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", Nome='" + Nome + '\'' +
                ", Città='" + Città + '\'' +
                '}';
    }
}
