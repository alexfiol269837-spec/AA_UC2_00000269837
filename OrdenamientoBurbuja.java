/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamientoburbuja;


/**
 * 
 * @author fiolr
 */
public class OrdenamientoBurbuja {

    public static void main(String[] args) {

        String[] palabras = {"uno", "union", "ulala", "u", "ucraniano", "umamusume"};

        System.out.println("Antes de ordenarlo estaba asi:")

  
        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }

   
        for (int i = 0; i < palabras.length - 1; i++) { 
      

            for (int j = 0; j < palabras.length - i - 1; j++) {
    
                if (palabras[j].length() > palabras[j + 1].length()) { 

                 
                    String temp = palabras[j];
                    palabras[j] = palabras[j + 1];
                    palabras[j + 1] = temp;        
                }
            }
        }

        System.out.println("\nDespués de ordenarlo quedo asi:");

        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }
    }
}

Esto significa que el tiempo de ejecución del algoritmo crece proporcionalmente al cuadrado del tamaño del arreglo.
*/ 
