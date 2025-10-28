package Parcial2.Polimorfismo;

public class Bicicleta extends Vehiculo implements conducible{

    public Bicicleta (String marca, int velMax){
        super(marca,velMax);
    }

    public void conducir(){
        System.out.println("Conduciendo la bicicleta +"+super.getMarca());
    }
    public void acelerar(){
        System.out.println("La bicicleta "+super.getMarca()+" acelera");
    }
}
