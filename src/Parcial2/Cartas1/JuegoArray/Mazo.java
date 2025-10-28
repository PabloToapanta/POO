package Parcial2.Cartas1.JuegoArray;

import java.security.SecureRandom;

public class Mazo {
    private final int CARTAS = 52;
    private final Carta[] cartas = new Carta [CARTAS];
    SecureRandom sr = new SecureRandom();

    private int cartaVista=0;

    public Mazo(){
        String[] palos = new String[]{"Corazones", "Diamante", "Espadas", "Treboles"};
        int recorrido=0;
        for(int i = 0 ; i< palos.length;i++) {
            for (int j = 2; j <= 14; j++) {
                cartas[recorrido++]=new Carta(j,palos[i]);
            }
        }
    }

    public int getCARTAS() {
        return CARTAS;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public int getCartaVista() {
        return cartaVista;
    }

    public void setCartaVista(int cartaVista) {
        this.cartaVista = cartaVista;
    }
    public void imprimitMazo(){
        for (Carta carta : this.cartas){
            System.out.printf("%s%n",carta.toString());
        }
    }

    public void barajar(){

        for (int i = 0; i < this.cartas.length; i++) {
            int nuevaPos = sr.nextInt(CARTAS);
            Carta intermedia = this.cartas[nuevaPos];
            this.cartas[nuevaPos]= intermedia;
        }
    }

    public Carta [] repartir(int n){
        if(this.cartaVista+n>cartas.length){
            throw new IllegalArgumentException("ERROR");
        }
        Carta[] mano = new Carta[n];
        for (int i = 0; i < n; i++) {
            mano[i]=cartas[cartaVista++];
        }
        return mano;
    }


}
