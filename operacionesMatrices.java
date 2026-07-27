import java.util.Scanner;

public class operacionesMatrices {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matriz1 = new int[2][3];
        int[][] matriz2 = new int[2][3];
        int[][] resultado = new int[2][3];

        completarMatriz(matriz1, 1);
        completarMatriz(matriz2, 2);

        mostrarMatriz(matriz1, "Matriz 1");
        mostrarMatriz(matriz2, "Matriz 2");

        sumarMatriz(matriz1, matriz2, resultado);
        mostrarMatriz(resultado, "El resultado de la suma es:");

        restarMatriz(matriz1, matriz2, resultado);
        mostrarMatriz(resultado, "El resultado de la resta es:");

        productoMatriz(matriz1, matriz2, resultado);
        mostrarMatriz(resultado, "El resultado de la multiplicación es:");
    }

    // Permite que el usuario ingrese una matriz
    public static void completarMatriz(int[][] matrizA, int numMatriz) {

        System.out.println("Ingrese matriz " + numMatriz + ":");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese valor [" + i + "][" + j + "]: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }
    }

    // Permite mostrar la matriz
    public static void mostrarMatriz(int[][] matriz1, String nombre) {

        System.out.println("\n" + nombre);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Permite sumar matrices
    public static void sumarMatriz(int[][] matriz1, int[][] matriz2, int[][] resultado) {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }

    // Permite restar matrices
    public static void restarMatriz(int[][] matriz1, int[][] matriz2, int[][] resultado) {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
    }

    // Permite multiplicar matrices (elemento por elemento)
    public static void productoMatriz(int[][] matriz1, int[][] matriz2, int[][] resultado) {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
    }
}