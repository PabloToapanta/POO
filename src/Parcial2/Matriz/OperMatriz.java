package Parcial2.Matriz;

public abstract class OperMatriz {
    // Protected para que las clases hijas puedan acceder directamente
    protected Matriz matrizA;
    protected Matriz matrizB;

    /**
     * Constructor base. Almacena las matrices y llama a la validación.
     * @param a Matriz A
     * @param b Matriz B
     */
    public OperMatriz(Matriz a, Matriz b) {
        this.matrizA = a;
        this.matrizB = b;
        // Llama al método abstracto que cada subclase debe implementar
        validarDimensiones();
    }

    /**
     * Método abstracto para validar si las dimensiones de matrizA y matrizB
     * son adecuadas para la operación específica (suma, multiplicación, etc.).
     * Debe lanzar una excepción si las dimensiones no son válidas.
     */
    protected abstract void validarDimensiones();

    /**
     * Método abstracto para realizar la operación específica entre matrizA y matrizB.
     * @return Una nueva Matriz con el resultado de la operación.
     */
    public abstract Matriz operar();

    // --- Getters (pueden ser útiles) ---
    public Matriz getMatrizA() {
        return matrizA;
    }

    public Matriz getMatrizB() {
        return matrizB;
    }
}
