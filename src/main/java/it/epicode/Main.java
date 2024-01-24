package it.epicode;

import it.epicode.dao.EventoDAO;
import it.epicode.entities.Evento;
import it.epicode.entities.TipoEvento;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EventoDAO eventodao = new EventoDAO();
        Evento evento = new Evento();
        evento.setTitolo("concerto");
        evento.setDescrizione("concerto sting");
        evento.setData_evento(LocalDate.of(2023,11,20));
        evento.setTipoEvento(TipoEvento.PUBBLICO);
        evento.setNumeroMassimoPartecipanti(200000);

        eventodao.save(evento);
        System.out.println(evento);
    }
}