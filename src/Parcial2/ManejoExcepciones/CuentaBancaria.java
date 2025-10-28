package Parcial2.ManejoExcepciones;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo){
        this.saldo=saldo;
    }
    public void depositar (double monto){
        if(monto<=0)throw new IllegalArgumentException("El monto no puede ser menor o igual a cero");
    }
    public void retirar(double monto) throws SaldoInsuficienteException{
        if(monto<=0) throw new IllegalArgumentException("El monto no puede ser menor o igual a cero");
        if(monto>saldo)throw new SaldoInsuficienteException("El monto a retirar no puede superar el saldo");
        this.saldo=this.saldo-monto;
    }

}
