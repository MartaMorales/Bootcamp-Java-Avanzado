package recursividad;

import java.util.stream.IntStream;

public class EjerciciosRecursividad {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println(factorial(numero));

        System.out.println(recursividad(numero));

        System.out.println(funcional(numero));

    }

    public static int factorial(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }

    public static int recursividad(int numero) {
        if (numero == 1) {
            return 1;
        }

        return numero * recursividad(numero - 1);
    }

    public static int funcional(int numero) {
        return IntStream.rangeClosed(1, numero).reduce(1, (a, b) -> a * b);
    }

}
