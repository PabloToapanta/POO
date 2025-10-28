package Parcial2.Cartas1.Cartas;

import java.security.SecureRandom;

public class Mazo {
    private final int CARTAS = 52;

    private final Carta[] mazoCartas = new Carta[CARTAS];

    private int cartaVista=0;

    SecureRandom  sr = new SecureRandom();

    public Mazo() {
        String[] palos = new String[]{"Corazones", "Diamante", "Espadas", "Treboles"};
        String[] numeros = new String[]{"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Juglar", "Reina", "Rey"};
        for (int i = 0; i < this.mazoCartas.length; i++) {
            this.mazoCartas[i]=new Carta(numeros[i%13],palos[i/13]);
        }
    }

    public int getCARTAS() {
        return CARTAS;
    }

    public Carta[] getMazoCartas() {
        return mazoCartas;
    }

    public int getCartaVista() {
        return cartaVista;
    }

    public void setCartaVista(int cartaVista) {
        this.cartaVista = cartaVista;
    }

    public void barajar(){
        for (int i = 0; i < this.mazoCartas.length; i++) {
        int nuevaPos = sr.nextInt(CARTAS);
        Carta intermedia = this.mazoCartas[nuevaPos];
        this.mazoCartas[nuevaPos]=this.mazoCartas[i];
        this.mazoCartas[i]=intermedia;
        }
    }

    public Carta siguienteCarta(){
        if(this.cartaVista<CARTAS){
            return this.mazoCartas[this.cartaVista++];
        }else{
            System.out.println("EL MAZO ESTA VACIO");
            return null;
        }
    }

    public void imprimitMazo(){
        for (Carta carta : this.mazoCartas){
            System.out.printf("%s%n",carta.toString());
        }
    }
}
