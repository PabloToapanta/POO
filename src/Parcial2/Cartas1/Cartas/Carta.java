package Parcial2.Cartas1.Cartas;

public class Carta {
    //atributos
    private final String numero;
    private final String palo;
    //constructor
    public Carta(String numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
//geters
    public String getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return String.format("%s de %s",this.numero,this.palo);
    }
}
