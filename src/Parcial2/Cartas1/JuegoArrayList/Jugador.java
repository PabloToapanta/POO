package Parcial2.Cartas1.JuegoArrayList;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private final String nombre;
    private final List<Carta> mano = new ArrayList<>();
    private int puntuacion=0;

    public Jugador(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public List<Carta> getMano() {
        return mano;
    }

    public int tamanioMano(){
        return this.mano.size();
    }

    public void recibirCartas(Carta carta){
        if(carta!=null){
            this.mano.add(carta);
        }
    }

    public Carta tomarCarta(int indice){
        if(indice<0 || indice>=this.mano.size()){
            throw new IllegalArgumentException("El indice esta fuera de rango de Juego");
        }
        return this.mano.remove(indice);//Saca el objeto de la lista, pero mantiene el objeto en memoria
    }

    public ArrayList<Integer> indicesJugables(Carta tope, String palo){
        ArrayList<Integer> jugables = new ArrayList<>();
        for (int i = 0; i < this.mano.size(); i++) {
            Carta c = this.mano.get(i);
            boolean mismoValor= (c.getNumero()== tope.getNumero());
            boolean mismoPalo=(c.getPalo().equals(tope.getPalo()));
            boolean esOcho = (c.getNumero()==8);
            if(mismoPalo || mismoValor || esOcho){
                jugables.add(i);
            }
        }
            return jugables;
    }

    public void mostrarMano(){
        System.out.printf("Mano de juego de %s ");
        for (int i = 0; i < this.mano.size(); i++) {
            System.out.printf("[%d] %s", (i+1),this.mano.get(i));
        }
    }
}
