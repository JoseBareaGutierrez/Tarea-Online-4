package com.mycompany.tareaonline4;

import java.util.Scanner;

public class tarea1 {

    public static void main(String[] args) {
        int numCaracteres,numContiene,cuadradoNumContiene;
        double numFlotante,raizCuadrada;
        String frase, invertirFrase = "";
        String[] palabras;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Intruduce una frase: ");
        frase = teclado.nextLine();

        //1.Muestre el número total de caracteres.
        numCaracteres = frase.length();
        System.out.println("el numero de caracteres que tiene tu frase es: " + numCaracteres);

        //2.Cuente cuántas palabras tiene la frase.
        palabras = frase.split(" ");
        System.out.println("tu frase tiene " + palabras.length + " palabras");

        //3.Invierta el orden de las palabras.
        for (int i = palabras.length - 1; i >= 0; i--) {
            invertirFrase += palabras[i] + " ";
        }
        System.out.println("Orden invertido de las palabra es: " + invertirFrase);
        //4.Reemplace todas las vocales por el carácter *.
        System.out.println(frase.replaceAll("[aeiouAEIOU]", "*"));

        /*5.Comprueba si la frase incluye un número, y si existe, realiza las siguientes
          tareas sobre el número:
            1.Convertirlo a un entero y mostrar su cuadrado.
            2.Convertirlo a un número flotante y calcular su raíz cuadrada.
            3.Convertir el número entero de vuelta a texto y agregarle el sufijo " es el número procesado".*/
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isDigit(frase.charAt(i))) {
                numContiene=Integer.parseInt(frase.charAt(i)+"");
                cuadradoNumContiene=numContiene*numContiene;
                numFlotante=(double)numContiene;
                raizCuadrada=Math.sqrt(numFlotante);
                System.out.println("El numero cuadrado es: "+cuadradoNumContiene);
                System.out.println("La raiz cuadrada es :"+raizCuadrada);
                System.out.println(numContiene+" es el numero procesado");
            }
        }
        
    }

}