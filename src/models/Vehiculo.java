package models;

import java.util.ArrayList;

public class Vehiculo {
    private String numeroTaxi;
    private ArrayList<Vehiculo> Vehiculos = new ArrayList<>();
    private String choferElegir;
    private int vehiculoElegir;

    public Vehiculo(String choferElegir, int vehiculoElegir) {
        this.choferElegir = choferElegir;
        this.vehiculoElegir = vehiculoElegir;
    }

    @Override
    public String toString() {
        return "numeroTaxi=" + numeroTaxi;
    }

    public Vehiculo(String numeroTaxi) {
        this.numeroTaxi = numeroTaxi;
    }

    public String getNumeroTaxi() {
        return numeroTaxi;
    }

    public void setNumeroTaxi(String numeroTaxi) {
        this.numeroTaxi = numeroTaxi;
    }


    public Vehiculo(ArrayList<Vehiculo> vehiculos) {
        Vehiculos = vehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return Vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        Vehiculos = vehiculos;
    }
}
