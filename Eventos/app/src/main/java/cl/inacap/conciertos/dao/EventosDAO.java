package cl.inacap.conciertos.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.conciertos.dto.Evento;

public class EventosDAO {

    private static List<Evento> eventos = new ArrayList<>();

    public List<Evento> getAll(){
        return eventos;
    }
    public void add(Evento evento){
        eventos.add(evento);
    }
    public void remove(Evento evento){
        eventos.remove(evento);
    }
}
