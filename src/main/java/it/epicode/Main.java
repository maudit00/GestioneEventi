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
        evento.setTitolo("partita");
        evento.setDescrizione("partita di calcio");
        evento.setData_evento(LocalDate.of(2024,01,20));
        evento.setTipoEvento(TipoEvento.PUBBLICO);

        eventodao.save(evento);
        System.out.println(evento);
        Evento e2 = eventodao.getById(1);
        System.out.println(e2);

        eventodao.delete(1);
    }
}