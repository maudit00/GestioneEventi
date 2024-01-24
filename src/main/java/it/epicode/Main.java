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
        evento.setDescrizione("concerto sting");
        evento.setData_evento(LocalDate.of(2023,11,20));
        evento.setTipoEvento(TipoEvento.PUBBLICO);
        evento.setNumeroMassimoPartecipanti(200000);

        eventoDao.save(evento);
        Persona persona = new Persona("Alberto", "Elia", "alberto@gmail.com", LocalDate.of(1989,6,7), 'M');
        personaDao.save(persona);
        Location location = new Location ("Stadio Olimpico", "Roma");
        locationDao.save(location);
        Partecipazione partecipazione = new Partecipazione(persona, evento, Stato.CONFERMATA);
        partecipazioneDao.save(partecipazione);
    }

}