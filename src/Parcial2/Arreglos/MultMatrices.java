package Parcial2.Arreglos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultMatrices {
    public static void main(String[] args) {
        int[][] matrizEjemplo = {
                {8, 1, 6},  // Fila 0
                {3, 5, 7},  // Fila 1
                {4, 9, 2}   // Fila 2
        };


        boolean resp = esMagica(matrizEjemplo);
        System.out.println(resp);
    }

    public static int[][] multiplicarMatrices(int[][] a, int[][] b) {
        int filasA = a.length;
        int columnasA = a[0].length;
        int columnasB = b[0].length;

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return resultado;
    }

    public static ArrayList<Punto> encontrarPuntosSilla(int[][] matriz) {
        ArrayList<Punto> puntosSilla = new ArrayList<>(); // Lista para guardar los puntos encontrados

        // Verificamos si la matriz está vacía o es irregular (simplificación básica)
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return puntosSilla; // Devuelve lista vacía si no hay matriz válida
        }

        int filas = matriz.length;
        int columnas = matriz[0].length; // Asumimos matriz rectangular por simplicidad

        // 1. Recorrer cada elemento de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int elementoActual = matriz[i][j];
                boolean esMinimoEnFila = true;
                boolean esMaximoEnColumna = true;

                // 2. Verificar si es el mínimo en su fila (fila i)
                for (int k = 0; k < columnas; k++) {
                    if (matriz[i][k] < elementoActual) {
                        esMinimoEnFila = false;
                        break; // No puede ser punto silla, salimos del chequeo de fila
                    }
                }

                // 3. Si ES el mínimo en su fila, verificar si es el máximo en su columna (columna j)
                if (esMinimoEnFila) {
                    for (int k = 0; k < filas; k++) {
                        if (matriz[k][j] > elementoActual) {
                            esMaximoEnColumna = false;
                            break; // No puede ser punto silla, salimos del chequeo de columna
                        }
                    }
                }

                // 4. Si cumple ambas condiciones, es un punto de silla
                if (esMinimoEnFila && esMaximoEnColumna) {
                    puntosSilla.add(new Punto(i, j)); // Añadir coordenadas a la lista
                }
            }
        }

        return puntosSilla; // Devolver la lista (puede estar vacía)
    }

    public static int [][] traspuesta (int [][] matriz){
        int filas = matriz.length;
        int columnas=matriz[0].length;
        int resultado [][]= new int [columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[j][i]=matriz[i][j];
            }
        }

        return resultado;
    }

    public static boolean esMagica(int [][] matriz){
        if(matriz.length!=matriz[0].length)throw new IllegalArgumentException("No es cuadrada");

        int dimension = matriz.length;
        int [] filas = new int[dimension];
        int [] columnas = new int[dimension];
        int [] diagonales = new int [2];



        //llenar []filas y [] columnas
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                filas[i]=filas[i]+matriz[i][j];
                columnas[i]=columnas[i]+matriz[j][i];
            }
        }

        //llenar []diagonales
        for (int i = 0; i < dimension; i++) {
            diagonales[0]=diagonales[0]+matriz[i][i];
            diagonales[1]=diagonales[1]+matriz[i][dimension-i-1];
        }

        for (int i = 0; i < dimension-1; i++) {
            if(!(filas[i]==filas[i+1])){
                return false;
            }
            if(!(columnas[i]==columnas[i+1])){
                return false;
            }
        }

        if(!(diagonales[0]==diagonales[1])){
            return false;
        }
        return true;


    }
    }


