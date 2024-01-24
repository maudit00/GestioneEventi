package it.epicode.dao;

import it.epicode.entities.Partecipazione;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class PartecipazioneDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PartecipazioneDAO() {
        this.emf = emf;
        this.em = em;
    }

    public Partecipazione save (Partecipazione p){
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(p);
        et.commit();
        em.refresh(p);
        return p;
    }

    public Partecipazione getById (int id){
        return em.find(Partecipazione.class, id);
    }

    public void delete (int id){
        EntityTransaction et = em.getTransaction();
        et.begin();
        Partecipazione p = getById(id);
        em.remove(p);
        et.commit();
    }
}
