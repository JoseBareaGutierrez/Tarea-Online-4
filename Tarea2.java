package com.mycompany.tareaonline4;

import java.util.Scanner;

public class Tarea2 {

    public static double calcularPromedio(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return (double) suma / array.length;
    }
    public static int encontrarMaximo(int[] array) {
        int maximo = array[0];
        for (int num : array) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }
    public static boolean buscarYReemplazar(int[] array, int numeroBuscado, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroBuscado) {
                System.out.print("Ingresa el nuevo número para reemplazar " + numeroBuscado + ": ");
                int nuevoNumero = scanner.nextInt();
                array[i] = nuevoNumero;
                return true; 
            }
        }
        return false; // Indica que el número no se encontró
    }
    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int tamanio;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un conjunto de numeros");
        tamanio = teclado.nextInt();

        int[] numeros = new int[tamanio];
        System.out.println("Ingresa los números:");
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio es: " + promedio);
        int maximo = encontrarMaximo(numeros);
        System.out.println("El valor máximo es: " + maximo);
        
        System.out.print("Ingresa un número para buscar en el array: ");
        int numeroBuscado = teclado.nextInt();
        
        if (buscarYReemplazar(numeros, numeroBuscado, teclado)) {
            System.out.println("Se reemplazó el número. El array actualizado es:");
        } else {
            System.out.println("El número no se encontró en el array. El array sigue igual:");
        }
        imprimirArray(numeros);
        teclado.close();
    }

}
