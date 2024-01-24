package it.epicode.dao;

import it.epicode.entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PersonaDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAO() {
        emf = Persistence.createEntityManagerFactory("gestione_eventi");
        em = emf.createEntityManager();
    }

    public Persona save (Persona p){
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(p);
        et.commit();
        em.refresh(p);
        return p;
    }

    public Persona getById (int id){
        return em.find(Persona.class, id);
    }

    public void delete (int id){
        EntityTransaction et = em.getTransaction();
        et.begin();
        Persona p = getById(id);
        em.remove(p);
        et.commit();
    }
}
