package models;

import java.util.ArrayList;

public class Arqueo {
    int ganancia;

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }

    public Arqueo (){

    }
    public void imprimir(){
        System.out.println("Ganancia total: "+ this.ganancia);
    }

}
