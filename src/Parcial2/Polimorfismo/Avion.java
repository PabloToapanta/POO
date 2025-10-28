package Parcial2.Polimorfismo;

public class Avion extends Vehiculo{
    public Avion (String marca, int velMax){
        super(marca,velMax);
    }

    public void acelerar(){
        System.out.println("El avion "+super.getMarca()+" acelera");
    }

    public void despegar(){
        System.out.println("El avion "+super.getMarca()+" está despegando");
    }
}
