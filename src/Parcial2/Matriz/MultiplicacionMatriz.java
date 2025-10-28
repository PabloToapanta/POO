package Parcial2.Matriz;

public class MultiplicacionMatriz extends OperMatriz {

    /**
     * Constructor para la multiplicación de matrices.
     * @param a Matriz A
     * @param b Matriz B
     */
    public MultiplicacionMatriz(Matriz a, Matriz b) {
        // Llama al constructor de la clase padre (OperMatriz)
        super(a, b);
    }

    /**
     * Valida que las columnas de A sean iguales a las filas de B para la multiplicación.
     * Lanza IllegalArgumentException si no cumplen la condición.
     */
    @Override
    protected void validarDimensiones() {
        if (matrizA.getColumnas() != matrizB.getFilas()) {
            throw new IllegalArgumentException(
                    "Para multiplicar, las columnas de A deben ser iguales a las filas de B." +
                            " Dimensiones A: " + matrizA.getFilas() + "x" + matrizA.getColumnas() +
                            ", Dimensiones B: " + matrizB.getFilas() + "x" + matrizB.getColumnas()
            );
        }
    }

    /**
     * Realiza la multiplicación de las matrices A y B.
     * @return Una nueva Matriz resultado de la multiplicación.
     */
    @Override
    public Matriz operar() {
        int filasA = matrizA.getFilas();
        int columnasA = matrizA.getColumnas(); // == filasB
        int columnasB = matrizB.getColumnas();

        Matriz matrizResultado = new Matriz(filasA, columnasB);

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                int sumaProducto = 0;
                for (int k = 0; k < columnasA; k++) {
                    sumaProducto += matrizA.getValorCelda(i, k) * matrizB.getValorCelda(k, j);
                }
                matrizResultado.setValorCelda(i, j, sumaProducto);
            }
        }
        return matrizResultado;
    }
}