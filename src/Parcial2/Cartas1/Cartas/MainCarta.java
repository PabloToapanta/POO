package Parcial2.Cartas1.Cartas;

public class MainCarta {
    public static void main(String[] args) {
        Mazo mazoCarta = new Mazo();
        mazoCarta.imprimitMazo();
        System.out.println();
        mazoCarta.barajar();
        System.out.println();
        mazoCarta.imprimitMazo();
        System.out.println();
        System.out.println(mazoCarta.siguienteCarta().toString());
    }
}
