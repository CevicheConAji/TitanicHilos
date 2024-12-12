package Hilos;

import Models.Pasajero;

import java.util.ArrayList;

public class Hilo extends Thread{
    private ArrayList<Pasajero> listaPasajeros;

    public Hilo(ArrayList<Pasajero> listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }
    @Override
    public void run() {
        int vivos = 0;
        int muertos = 0;
        int totalPasajeros = listaPasajeros.size();
        float porcentajeVivos = 0f;
        float porcentajeMuertos = 0f;

        for(Pasajero pasajero: listaPasajeros){
            if(pasajero.getVivo().equals("S")){
                vivos++;
            }
            if(pasajero.getVivo().equals("N")){
                muertos++;
            }
        }
        porcentajeVivos = (vivos*100)/totalPasajeros;
        porcentajeMuertos = (muertos*100)/totalPasajeros;

        System.out.println("Total Pasajeros: "+ totalPasajeros+" Vivos: "+vivos+" ("+porcentajeVivos +"%) Muertos: "+muertos+" ("+porcentajeMuertos+"%)");

    }
}
