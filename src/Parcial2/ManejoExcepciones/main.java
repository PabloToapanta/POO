package Parcial2.ManejoExcepciones;

public class main {
    public static void main(String[] args) {
        try{
            CuentaBancaria cuenta1 = new CuentaBancaria(25);
            cuenta1.depositar(25);
            cuenta1.retirar(250);
            cuenta1.depositar(-45);
        }catch (SaldoInsuficienteException e){
            System.err.println("Error: "+e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}
