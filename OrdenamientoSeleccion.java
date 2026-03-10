package com.mycompany.ordenamientoseleccion;

/**
 * 
 */
public class OrdenamientoSeleccion {

    public static void main(String[] args) {

        String[] palabras = {"uno", "union", "ulala", "u", "ucraniano", "umamusume"}; 
        // 1 asignación

        System.out.println("Antes de ordenarlo estaba asi:"); // 1 operación

        for (String palabra : palabras) { // n operaciones
            System.out.print(palabra + " "); // n operaciones
        }

        // ALGORITMO DE ORDENAMIENTO POR SELECCIÓN

        for (int i = 0; i < palabras.length - 1; i++) {
            // inicialización = 1
            // comparación = n
            // incremento = n

            int indiceMinimo = i; // 1 asignación

            for (int j = i + 1; j < palabras.length; j++) {
                // inicialización = 1
                // comparación = n
                // incremento = n

                if (palabras[j].length() < palabras[indiceMinimo].length()) {
                    // comparación de longitudes
                    indiceMinimo = j; // 1 asignación
                }
            }

            // intercambio de valores
            String temp = palabras[indiceMinimo]; // 1 asignación
            palabras[indiceMinimo] = palabras[i]; // 1 asignación
            palabras[i] = temp; // 1 asignación
        }

        System.out.println("\nDespués de ordenarlo quedo asi:");

        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }
    }
}

/*
ANÁLISIS DE COMPLEJIDAD

El algoritmo de selección utiliza dos ciclos anidados.

El ciclo externo recorre el arreglo n veces.
El ciclo interno busca el elemento mínimo en cada iteración.

Número aproximado de comparaciones:

T(n) = n(n - 1) / 2

Notación asintótica:

O(n²)

Esto significa que el tiempo de ejecución crece de forma cuadrática
con respecto al tamaño del arreglo.
*/
