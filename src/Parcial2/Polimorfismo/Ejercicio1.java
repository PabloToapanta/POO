package Parcial2.Polimorfismo;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Vehiculo> lista = new ArrayList<>();
        lista.add(new Coche("Chevrolet",200));
        lista.add(new Bicicleta("Montero",50));
        lista.add(new Avion("AirPlanes",700));
        for (Vehiculo item: lista) {
            item.acelerar();
            if(item instanceof conducible){
                conducible esConducible = (conducible) item;
                esConducible.conducir();
            }else {
                System.out.println("Este vehiculo "+item.getMarca()+" no es conducible");
            }
        }

    }
}
