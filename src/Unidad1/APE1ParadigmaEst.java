package Unidad1;
import java.util.*;
public class APE1ParadigmaEst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESO DE NUMEROS");
        double a= ingresarNumeroA(sc);
        double b = ingresarNumeroB(sc);
        String operando = ingresarOperando(sc);
        System.out.print("El resultado es: ");
        switch (operando){
            case "+":
                System.out.println(sumar(a,b));
                break;
            case "-":
                System.out.println(restar(a,b));
                break;
            case "/":
                System.out.println(dividir(a,b));
                break;
            case "*":
                System.out.println(multiplicar(a,b));
        }
    }
    public static double sumar(double a, double b){
        return a+b;
    }
    public static double restar(double a, double b){
        return a-b;
    }
    public static double dividir(double a, double b){
        try{
            return a/b;
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }
    public static double multiplicar(double a, double b){
        return a*b;
    }
    public static double ingresarNumeroA(Scanner sc){
        System.out.print("INGRESAR NUMERO A: ");double a = sc.nextDouble();
        return a;
    }
    public static double ingresarNumeroB(Scanner sc){
        System.out.print("INGRESAR NUMERO B: ");double b = sc.nextDouble();
        return b;
    }
    public static String ingresarOperando(Scanner sc){
        String resultado = "NA";
        while(true){
            System.out.println("INGRESAR OPERANDO");
            System.out.println("* para Multiplicación");
            System.out.println("/ para División");
            System.out.println("+ para Suma");
            System.out.println("- para Resta");
            String operando = sc.next();
            if (operando.equals("*")||operando.equals("/")||operando.equals("+")||operando.equals("-")){
                resultado = operando;
                break;
            }else {
                System.out.println("Operando invalido");
            }
        }
        return resultado;
    }
}
