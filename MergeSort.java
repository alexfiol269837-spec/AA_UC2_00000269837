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
        aux = new int[arreglo.length];
        dividir(arreglo, 0, arreglo.length - 1);
    }

    private static void dividir(int[] arreglo, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }

        int medio = (inicio + fin) / 2;

        dividir(arreglo, inicio, medio);
        dividir(arreglo, medio + 1, fin);

        combinar(arreglo, inicio, medio, fin);
    }

    private static void combinar(int[] arreglo, int inicio, int medio, int fin) {

        
        for (int i = inicio; i <= fin; i++) {
            aux[i] = arreglo[i];
        }

        int i = inicio;
        int j = medio + 1;
        int k = inicio;

        while (i <= medio && j <= fin) {
            if (aux[i] <= aux[j]) {
                arreglo[k] = aux[i];
                i++;
            } else {
                arreglo[k] = aux[j];
                j++;
            }
            k++;
        }

        
        while (i <= medio) {
            arreglo[k] = aux[i];
            i++;
            k++;
        }

        
    }

    public static void imprimir(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] datos = {10, 4, 7, 2, 8, 1, 3};

        System.out.println("Antes de ordenar:");
        imprimir(datos);

        mergeSort(datos);

        System.out.println("Después de ordenar:");
        imprimir(datos);
    }
}