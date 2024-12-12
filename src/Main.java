import Hilos.Hilo;
import Models.Pasajero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pasajero> listaPasajeros = leerCSV();
        ArrayList<Pasajero> primerClase = new ArrayList<>();
        ArrayList<Pasajero> segundaClase = new ArrayList<>();
        ArrayList<Pasajero> terceraClase = new ArrayList<>();

        for(Pasajero pasajero: listaPasajeros){
            if(pasajero.getClase().equals("1")){
                primerClase.add(pasajero);
            }else if(pasajero.getClase().equals("2")){
                segundaClase.add(pasajero);
            }else{
                terceraClase.add(pasajero);
            }
        }
        System.out.println("Bienvenido al Titanic");

        Hilo hilo1 = new Hilo(primerClase);
        Hilo hilo2 = new Hilo(segundaClase);
        Hilo hilo3 = new Hilo(terceraClase);

        hilo1.start();
        hilo2.start();
        hilo3.start();

        try{
            hilo1.join();
            hilo2.join();
            hilo3.join();
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }

    }
    public static ArrayList<Pasajero> leerCSV(){
        ArrayList<Pasajero> listaPasajeros = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("src/DB/Titanic.csv"))){
            String linea;
            int contador = 0;
            while((linea = br.readLine()) != null){
                contador++;
                String[] persona = linea.split(",");
                if(contador > 2){
                    Pasajero pasajero = new Pasajero(persona[0],persona[1],persona[2],Integer.parseInt(persona[3]),persona[4],persona[5]);
                    listaPasajeros.add(pasajero);
                }
            }
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        return listaPasajeros;
    }
    public static void imprimirLista(ArrayList<Pasajero> lista){
        for(Pasajero pasajero: lista){
            System.out.println(pasajero.getClase());
        }
    }

}