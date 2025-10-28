package Parcial2.Cartas1.JuegoArray;

public class Juego {
        private int rondas = 5;

    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    public void jugar(){


        System.out.println("CARTAS CON ARREGLOS TRADICIONALES");

        Mazo mazo = new Mazo();
        mazo.barajar();

        Jugador j1 = new Jugador("Juan");
        Jugador j2 = new Jugador("Ana");

        j1.recibirCartas(mazo.repartir(rondas));
        j2.recibirCartas(mazo.repartir(rondas));


        j1.mostrarMano();
        j2.mostrarMano();

        System.out.print("COMIENZA EL JUEGO");

        for (int i = 0; i < rondas; i++) {

        }
    }
}
