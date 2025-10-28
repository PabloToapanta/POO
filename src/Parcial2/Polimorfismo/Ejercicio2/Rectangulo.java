package Parcial2.Polimorfismo.Ejercicio2;

public class Rectangulo extends FiguraGeometrica implements Dibujable {
    private double base;
    private double altura;

    public Rectangulo(String color ,double base, double altura){
        super(color);
        if(base<=0)throw new IllegalArgumentException("LA BASE NO PUEDE SER MENOR O IGUAL A CERO");
        this.base=base;
        if(altura<=0)throw new IllegalArgumentException("LA ALTURA NO PUEDE SER MENOR O IGUAL A CERO");
        this.altura=altura;
    }

    @Override
    void calcularArea() {
        System.out.printf("El area del rectángulo es %.2f%n",base*altura);
    }
    @Override
    public void dibujar() {
        System.out.printf("El Rectangulo es una figura geométrica que tiene 4 lados%nSus dimensiones son:%nBase: %.2f%nAltura: %.2f",this.base,this.altura);
    }
}
