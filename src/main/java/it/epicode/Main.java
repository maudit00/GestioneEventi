package it.epicode;

import it.epicode.dao.EventoDAO;
import it.epicode.dao.LocationDAO;
import it.epicode.dao.PartecipazioneDAO;
import it.epicode.dao.PersonaDAO;
import it.epicode.entities.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    final static EventoDAO eventoDao = new EventoDAO();
    final static PersonaDAO personaDao = new PersonaDAO();
    final static LocationDAO locationDao = new LocationDAO();
    final static PartecipazioneDAO partecipazioneDao = new PartecipazioneDAO();
    public static void main(String[] args) {

        Evento evento = new Evento();
        evento.setTitolo("concerto");
        evento.setDescrizione("concerto beyonce");
        evento.setData_evento(LocalDate.of(2022,10,20));
        evento.setTipoEvento(TipoEvento.PUBBLICO);
        evento.setNumeroMassimoPartecipanti(2000000);

        Persona persona = new Persona("Pippo", "Franco", "pippo@gmail.com", LocalDate.of(1965,6,7), 'M');

        /*
        Persona persona1 = personaDao.getById(1);
        System.out.println(persona1.getPartecipazioneList().stream().toList());

         */

        personaDao.save(persona);
        Location location = new Location ("Stadio San Siro", "Milano");
        locationDao.save(location);
        evento.setLocation(location);
        eventoDao.save(evento);

        Partecipazione partecipazione = new Partecipazione(persona, evento, Stato.CONFERMATA);
        partecipazioneDao.save(partecipazione);
    }

}