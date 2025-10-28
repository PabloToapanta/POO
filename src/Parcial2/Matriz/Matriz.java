package Parcial2.Matriz;

import java.util.*;

public class Matriz {
    private final int filas;
    private final int columnas;
    private final  ArrayList<ArrayList<Integer>> matriz;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new ArrayList<ArrayList<Integer>>();

    }

    public int getColumnas() {
        return columnas;
    }

    public int getFilas() {
        return filas;
    }

    public ArrayList<ArrayList<Integer>> getMatriz() {
        return matriz;
    }

    public int getValorCelda(int filaCelda, int columnaCelda) {
        if(filaCelda > this.filas || filaCelda<0){
            throw new IndexOutOfBoundsException("La fila a buscar es mayor que la fila existente");
        }

        if(columnaCelda > this.columnas || columnaCelda<0){
            throw new IndexOutOfBoundsException("La fila a buscar es mayor que la fila existente");
        }
        return this.matriz.get(filaCelda).get(columnaCelda);
    }

    public void setValorCelda(int filaCelda, int columnaCelda, int valor) {
        if(filaCelda > this.filas || filaCelda<0){
            throw new IndexOutOfBoundsException("La fila a buscar es mayor que la fila existente");
        }

        if(columnaCelda > this.columnas || columnaCelda<0){
            throw new IndexOutOfBoundsException("La fila a buscar es mayor que la fila existente");
        }
        this.matriz.get(filaCelda).set(columnaCelda,valor);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<this.filas; i++){
            //Arrays.toString(matriz[i]).append(System.LineSeparator()); //Esto significa imprimir la forma canonica(toString) de cada fila de la matriz y añadirle al final el separador de la line tradicional del sistema
            sb.append(matriz.get(i).toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}