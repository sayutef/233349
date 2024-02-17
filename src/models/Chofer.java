package models;

import java.util.ArrayList;

public class Chofer {
    private ArrayList<Chofer> chofers;
    private String nombreChofer;

    public Chofer(ArrayList<Chofer> chofers) {
        this.chofers = chofers;
    }

    public Chofer(String nombreChofer) {
        this.nombreChofer = nombreChofer;
    }

    public ArrayList<Chofer> getChofers() {
        return chofers;
    }

    public void setChofers(ArrayList<Chofer> chofers) {
        this.chofers = chofers;
    }

    public String getNombreChofer() {
        return nombreChofer;
    }

    public void setNombreChofer(String nombreChofer) {
        this.nombreChofer = nombreChofer;
    }

    @Override
    public String toString() {
        return "nombreChofer='" + nombreChofer + '\'' ;
    }
}
