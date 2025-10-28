package Parcial2.Polimorfismo.Ejercicio2;

interface Dibujable{
    void dibujar();
}
public abstract class FiguraGeometrica {
    protected String color;
    public FiguraGeometrica(String color){
        this.color=color;
    }
    abstract void calcularArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

