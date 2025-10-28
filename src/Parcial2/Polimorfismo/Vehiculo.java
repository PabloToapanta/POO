package Parcial2.Polimorfismo;

interface conducible {
     void conducir();
}
public abstract class Vehiculo {
    private String marca;
    private int velMax;

    public Vehiculo(String marca, int velMax) {
        this.marca = marca;
        this.velMax = velMax;
    }

     abstract void acelerar();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    @Override
    public String toString() {
        return String.format("Vehiculo%nMarca %s%n VelocidadMáxima: %s km/h%n",this.marca,this.velMax);
    }
}
