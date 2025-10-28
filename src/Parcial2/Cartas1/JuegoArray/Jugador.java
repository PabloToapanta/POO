package Parcial2.Cartas1.JuegoArray;

public class Jugador {
    private final String nombre;
    private Carta[] mano;
    private int puntuacion;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.puntuacion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public Carta[] getMano() {
        return mano;
    }

    public void setMano(Carta[] mano) {
        this.mano = mano;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    public void recibirCartas(Carta[] cartas){
        this.mano = new Carta[cartas.length];
        for(int i = 0; i < cartas.length; i++){

            this.mano[i] = cartas[i];
        }
    }

    public void incementarPuntaje(){
        this.puntuacion++;
    }
    public void mostrarMano (){
        System.out.printf("Mano de %s:%n",this.nombre);
        for(int i = 0; i < this.mano.length; i++){
            System.out.printf("[%d] %s. ",i,this.mano[i]);
        }
    }
}