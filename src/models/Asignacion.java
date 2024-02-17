package models;

import java.time.LocalDate;

public class Asignacion {
    private int date;
    private int dates;
    private String chofer;
    private int vehiculo;
    private int fecha;

    public int getFecha() {
        return fecha;
    }

    public Asignacion(String chofer, int vehiculo) {
        this.chofer = chofer;
        this.vehiculo = vehiculo;
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public int getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(int vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Asignacion(int dates) {
        this.dates = dates;
    }

    public int getDates() {
        return dates;
    }

    public void setDates(int dates) {
        this.dates = dates;
    }

    public Asignacion(){}

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }




    public void imprimir2(){
        System.out.println("Chofer: "+ chofer +"vehiculo: "+ vehiculo);
    }

    @Override
    public String toString() {
        return "Fecha: " + dates;
    }
}
