package Parcial2.Polimorfismo;

public class Coche extends Vehiculo implements conducible{
    public Coche(String marca, int velMax){
        super(marca,velMax);
    }

    public void conducir(){
        System.out.println("Conduciendo el coche +"+super.getMarca());
    }
    public void acelerar(){
        System.out.println("El coche "+super.getMarca()+" acelera");
    }
}
