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
/*
ANÁLISIS DE COMPLEJIDAD: MERGESORT
El algoritmo utiliza un enfoque recursivo de "divide y vencerás".
Fase de División: El arreglo se divide a la mitad de forma sucesiva
hasta llegar a sub-arreglos de un solo elemento. Esto genera una
estructura de árbol con una profundidad de log₂(n) niveles.
Fase de Combinación (Mezcla): En cada nivel del árbol, el algoritmo
recorre y compara todos los elementos para fusionarlos en orden.
Esta operación tiene un costo lineal de n en cada nivel.
Número total de operaciones:
El trabajo total es el producto de los niveles de división por el trabajo
de mezcla en cada nivel:
$T(n) = n \cdot \log_2(n)$
Notación asintótica:
$O(n \log n)$
Conclusión:
A diferencia del método de selección ($O(n^2)$), el tiempo de ejecución de
MergeSort crece de forma log-lineal. Esto lo hace mucho más eficiente
para manejar grandes volúmenes de datos, ya que no se vuelve
excesivamente lento a medida que el arreglo aumenta de tamaño.
*/

