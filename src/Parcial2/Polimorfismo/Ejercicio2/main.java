package Parcial2.Polimorfismo.Ejercicio2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> lista = new ArrayList<>();
        lista.add(new Circulo("Rojo",2.2));
        lista.add(new Rectangulo("Verde",2,1));
        lista.add(new Triangulo("Azul",4,5));
        for(FiguraGeometrica figura : lista){
            System.out.println("El color de la figura es "+figura.getColor());
            figura.calcularArea();

            if(figura instanceof Dibujable){
                Dibujable dibujable = (Dibujable) figura;
                dibujable.dibujar();
            }
        }
    }
}
