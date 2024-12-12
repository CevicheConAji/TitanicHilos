package Hilos;

import Models.Pasajero;

import java.util.ArrayList;

public class PrimeraClase extends Thread{
    private ArrayList<Pasajero> listaPasajeros;

    public PrimeraClase(ArrayList<Pasajero> listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }
}
