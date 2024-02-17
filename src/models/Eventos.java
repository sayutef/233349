package models;

import java.util.ArrayList;

public class Eventos {
    private String eventos;
    private ArrayList <Eventos> evento = new ArrayList<>();
    private int eventosRealizados;

    public int getEventosRealizados() {
        return eventosRealizados;
    }

    public void setEventosRealizados(int eventosRealizados) {
        this.eventosRealizados = eventosRealizados;
    }
    public int setEventosRealizados(){
        return eventosRealizados;
    }

    public Eventos(){}
    public Eventos(String eventos) {
        this.eventos = eventos;
    }

    public String getEventos() {
        return eventos;
    }

    public void setEventos(String eventos) {
        this.eventos = eventos;
    }
}
