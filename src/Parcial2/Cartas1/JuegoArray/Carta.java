package Parcial2.Cartas1.JuegoArray;

public class Carta {

    private final int numero;
    private final String palo;
    public Carta (int numero, String palo){
        if (numero<2 || numero>14)throw new IllegalArgumentException("EL NUMERO DEBE SER MAYOR A 2 Y MENOR A 14");
        this.numero=numero;
        this.palo=palo;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }
    @Override
    public String toString(){
        String valor;
        switch (this.numero){
            case 11:
                valor = "J";
                break;
            case 12:
                valor="Q";
            case 13:
                valor = "K";
            case 14:
                valor = "A";
                break;
            default:
                valor=String.valueOf(this.numero);
        }
        return String.format("%s de %s",valor,this.palo);
    }
}
