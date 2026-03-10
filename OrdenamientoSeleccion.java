/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamientoseleccion;

/**
 *
 * @author fiolr
 */
public class OrdenamientoSeleccion {


    public static void main(String[] args) {

        String[] palabras = {"uno", "union", "ulala", "u", "ucraniano", "umamusume"};

        System.out.println("Antes de ordenarlo estaba asi:");
        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }

        // Algoritmo de ordenamiento por selección
        for (int i = 0; i < palabras.length - 1; i++) {

            int indiceMinimo = i;

            for (int j = i + 1; j < palabras.length; j++) {

                if (palabras[j].length() < palabras[indiceMinimo].length()) {
                    indiceMinimo = j;
                }

            }

            String temp = palabras[indiceMinimo];
            palabras[indiceMinimo] = palabras[i];
            palabras[i] = temp;
        }

        System.out.println("\nDespués de ordenarlo quedo asi:");
        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }
    }
}