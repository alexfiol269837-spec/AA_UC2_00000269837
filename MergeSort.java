/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mergesort;

/**
 *
 * @author fiolr
 */
public class MergeSort {

    private static int[] aux;

    public static void mergeSort(int[] arreglo) {
        aux = new int[arreglo.length];               // 1 
        dividir(arreglo, 0, arreglo.length - 1);     // 1
    }

    private static void dividir(int[] arreglo, int inicio, int fin) {
        if (inicio >= fin) {                         // 1
            return;                                  // 1 
        }

        int medio = (inicio + fin) / 2;              // 3

        dividir(arreglo, inicio, medio);             // T(n/2)
        dividir(arreglo, medio + 1, fin);            // T(n/2)

        combinar(arreglo, inicio, medio, fin);       // O(n)
    }

    private static void combinar(int[] arreglo, int inicio, int medio, int fin) {
        

        for (int i = inicio; i <= fin; i++) {        // 1, n+1 , n 
            aux[i] = arreglo[i];                     // 2n 
        }

        int i = inicio;                              // 1 
        int j = medio + 1;                           // 2 
        int k = inicio;                              // 1 

    
        while (i <= medio && j <= fin) {             // n + 1 
            if (aux[i] <= aux[j]) {                  // 2n 
                arreglo[k] = aux[i];                 // 2n 
                i++;                                 // n
            } else {
                arreglo[k] = aux[j];                 // 2n 
                j++;                                 // n 
            }
            k++;                                     // n 
        }

    
        while (i <= medio) {                         // k + 1 
            arreglo[k] = aux[i];                     // 2k 
            i++;                                     // k
            k++;                                     // k
        }
    }

    public static void imprimir(int[] arreglo) {
        for (int num : arreglo) {                    // n + 1 
            System.out.print(num + " ");             // n 
        }
        System.out.println();                        // 1 
    }

    public static void main(String[] args) {
        int[] datos = {10, 4, 7, 2, 8, 1, 3};        // 1

        System.out.println("Antes de ordenar:");    // 1 
        imprimir(datos);                             // 1 

        mergeSort(datos);                            // 1 

        System.out.println("Después de ordenar:");   // 1
        imprimir(datos);                             // 1
    }
}
}
