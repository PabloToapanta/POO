package Parcial2.Matriz;

public class SumaMatriz extends OperMatriz {

    /**
     * Constructor para la suma de matrices.
     * @param a Matriz A
     * @param b Matriz B
     */
    public SumaMatriz(Matriz a, Matriz b) {
        // Llama al constructor de la clase padre (OperMatriz)
        super(a, b);
    }

    /**
     * Valida que las matrices tengan las mismas dimensiones para la suma.
     * Lanza IllegalArgumentException si no son iguales.
     */
    @Override
    protected void validarDimensiones() {
        if (!(matrizA.getFilas() == matrizB.getFilas() && matrizA.getColumnas() == matrizB.getColumnas())) {
            throw new IllegalArgumentException(
                    "Para sumar, las matrices deben tener las mismas dimensiones." +
                            " Dimensiones A: " + matrizA.getFilas() + "x" + matrizA.getColumnas() +
                            ", Dimensiones B: " + matrizB.getFilas() + "x" + matrizB.getColumnas()
            );
        }
    }

    /**
     * Realiza la suma de las matrices A y B.
     * @return Una nueva Matriz resultado de la suma.
     */
    @Override
    public Matriz operar() {
        int filas = matrizA.getFilas();
        int columnas = matrizA.getColumnas();
        Matriz matrizResultado = new Matriz(filas, columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int suma = matrizA.getValorCelda(i, j) + matrizB.getValorCelda(i, j);
                matrizResultado.setValorCelda(i, j, suma);
            }
        }
        return matrizResultado;
    }
}
