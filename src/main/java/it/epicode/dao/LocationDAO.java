package it.epicode.dao;

import it.epicode.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class LocationDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public LocationDAO() {
        this.emf = emf;
        this.em = em;
    }

    public Location save (Location l){
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(l);
        et.commit();
        em.refresh(l);
        return l;
    }

    public Location getById (int id){
        return em.find(Location.class, id);
    }

    public void delete (int id){
        EntityTransaction et = em.getTransaction();
        et.begin();
        Location l = getById(id);
        em.remove(l);
        et.commit();
    }
}
