/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamientoburbuja;


/**
 * Implementación del algoritmo de ordenamiento burbuja
 * que ordena palabras según la longitud del texto.
 * 
 * @author fiolr
 */
public class OrdenamientoBurbuja {

    public static void main(String[] args) {

        String[] palabras = {"uno", "union", "ulala", "u", "ucraniano", "umamusume"};

        System.out.println("Antes de ordenarlo estaba asi:"); // 1 operación

        // recorrer arreglo para imprimir
        for (String palabra : palabras) { // n operaciones
            System.out.print(palabra + " ");
        }

        // Algoritmo de ordenamiento burbuja
        for (int i = 0; i < palabras.length - 1; i++) { 
            // inicialización = 1
            // comparación = n
            // incremento = n

            for (int j = 0; j < palabras.length - i - 1; j++) {
                // inicialización = 1
                // comparación = n
                // incremento = n

                // comparación de longitud de palabras
                if (palabras[j].length() > palabras[j + 1].length()) { // 1 comparación

                    // intercambio de posiciones
                    String temp = palabras[j];     // 1 asignación
                    palabras[j] = palabras[j + 1]; // 1 asignación
                    palabras[j + 1] = temp;        // 1 asignación
                }
            }
        }

        System.out.println("\nDespués de ordenarlo quedo asi:");

        for (String palabra : palabras) { // n operaciones
            System.out.print(palabra + " ");
        }
    }
}

