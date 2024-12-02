
package com.mycompany.tareaonline4;

import java.util.Random;

public class Tarea3 {

    public static void main(String[] args) {
                // Tamaño de la matriz
        int filas = 3;
        int columnas = 3;

        // Generar matriz aleatoria
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        // Llenar la matriz con números aleatorios entre 1 y 10
        System.out.println("Matriz original:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10) + 1; // Aleatorios entre 1 y 10
                System.out.println(matriz[i][j]);
            }
            System.out.println();
        }

        // Crear la matriz de suma acumulativa
        int[][] matrizAcumulativa = new int[filas][columnas];

        System.out.println("\nMatriz acumulativa:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (j == 0) {
                    // Primera columna: solo sumar el elemento de la misma posición de la fila anterior
                    matrizAcumulativa[i][j] = (i == 0 ? 0 : matrizAcumulativa[i - 1][columnas - 1]) + matriz[i][j];
                } else {
                    // Suma acumulativa dentro de la misma fila
                    matrizAcumulativa[i][j] = matrizAcumulativa[i][j - 1] + matriz[i][j];
                }
                System.out.println(matrizAcumulativa[i][j]);
            }
            System.out.println();
        }
    }
}

