package Parcial2.Polimorfismo.Ejercicio2;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(String color ,double base, double altura){
        super(color);
        if(base<=0)throw new IllegalArgumentException("LA BASE NO PUEDE SER MENOR O IGUAL A CERO");
        this.base=base;
        if(altura<=0)throw new IllegalArgumentException("LA ALTURA NO PUEDE SER MENOR O IGUAL A CERO");
        this.altura=altura;
    }

    @Override
    void calcularArea() {
        System.out.printf("El area del triángulo es %.2f%n",(base*altura)/2);
    }
}
