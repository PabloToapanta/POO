package Parcial2.Polimorfismo.Ejercicio2;

public class Circulo extends FiguraGeometrica implements Dibujable{
    private double radio;
    public Circulo(String color, double radio){
        super(color);
        if(radio<=0)throw new IllegalArgumentException("EL RADIO NO PUEDE SER MENOR O IGUAL A CERO");
        this.radio=radio;
    }

    @Override
    void calcularArea() {
        System.out.printf("El area del circulo es %.2f%n",Math.PI*this.radio);
    }

    @Override
    public void dibujar() {
        System.out.printf("El circulo es una figura geométrica que no tiene lados%nSus dimensiones son:%nRadio: %.2f",this.radio);
    }
}
