package Parcial2.Cartas1.JuegoArray;

public class Ronda {
    private final Carta cartaJ1, cartaJ2;
    public Ronda(Carta cartaJ1,Carta cartaJ2){
        this.cartaJ1=cartaJ1;
        this.cartaJ2=cartaJ2;
    }

    public int determinarGanador(){

        int valor1 = this.cartaJ1.getNumero();
        int valor2 = this.cartaJ2.getNumero();

        if(valor1<valor2){
            return 2;
        }
        if(valor2>valor1){
            return 1;
        }
        return 0;
    }
}
