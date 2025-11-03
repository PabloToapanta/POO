package Parcial2.MiniProyectos.BatallaMonstruos;

public class MainBatalla {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Pablo");
        j1.añadirMonstruo("Atreus",25);
        j1.añadirMonstruo("Kratos",40);
        j1.elegirMonstruoActual(2);
        System.out.println(j1.toString());
        Jugador j2 = new Jugador("Pedro");
        j2.añadirMonstruo("Sonic",28);
        j2.añadirMonstruo("PunPun",19);
        j2.elegirMonstruoActual(1);
        System.out.println(j2.toString());

        j1.getMonstruoActual().realizarAtaque(j2.getMonstruoActual());

        System.out.println(j2.toString());

        j2.rendirse();
        System.out.println(j2.toString());

    }

}
