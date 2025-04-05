/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.ejercicios;

/**
 *
 * @author wcord
 */
import java.util.Scanner;
import java.util.Arrays;
public class Vectores {
    
    /**
     * 📜 Descripción: Dado un vector de números enteros, encuentre la suma más pequeña y la suma más grande posibles al sumar (N-1) elementos del vector.🔹 Instrucciones:
        Leer un vector de N números enteros.Calcular la suma mínima excluyendo el número más grande.
        Calcular la suma máxima excluyendo el número más pequeño.
        Imprimir ambas sumas.
 Ejemplo de entrada: [1, 3, 5, 7, 9]
 Ejemplo de salida: 
          Suma mínima: 16  
          Suma máxima: 24  
     * @param args
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cantidad de números que el usuario desea ingresar
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        // Crear un vector para almacenar los números
        int[] numeros = new int[n];

        // Leer los números ingresados por el usuario
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Calcular la suma mínima y máxima
        calcularSumas(numeros);
    }

    public static void calcularSumas(int[] numeros) {
        // Ordenar el vector
        Arrays.sort(numeros);

        // Calcular la suma mínima excluyendo el número más grande
        int sumaMinima = 0;
        for (int i = 0; i < numeros.length - 1; i++) {
            sumaMinima += numeros[i];
        }

        // Calcular la suma máxima excluyendo el número más pequeño
        int sumaMaxima = 0;
        for (int i = 1; i < numeros.length; i++) {
            sumaMaxima += numeros[i];
        }

        // Imprimir ambas sumas
        System.out.println("Suma mínima: " + sumaMinima);
        System.out.println("Suma máxima: " + sumaMaxima);
    }
    
    /**
     * Reordenamiento de Números Pares e Impares
        📜 Descripción: Reordene un vector de enteros colocando primero los pares y luego los impares, manteniendo el orden relativo de aparición en cada grupo.
        🔹 Instrucciones:
        Leer un vector de N números enteros.
        Crear un nuevo vector donde los pares aparezcan primero y los impares después.
        No utilizar estructuras adicionales como listas o colecciones.
        * Ejemplo de entrada: [3, 1, 2, 4, 5, 6]
        * Ejemplo de salida: [2, 4, 6, 3, 1, 5]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cantidad de números que el usuario desea ingresar
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        // Crear un vector para almacenar los números
        int[] numeros = new int[n];

        // Leer los números ingresados por el usuario
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Reordenar el vector colocando primero los pares y luego los impares
        reordenarVector(numeros);

        // Imprimir el vector reordenado
        System.out.println("Vector reordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    public static void reordenarVector(int[] numeros) {
        int n = numeros.length;
        int[] resultado = new int[n];
        int index = 0;

        // Colocar primero los números pares en el vector resultado
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                resultado[index++] = numeros[i];
            }
        }

        // Colocar los números impares en el vector resultado
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 != 0) {
                resultado[index++] = numeros[i];
            }
        }

        // Copiar el vector resultado al vector original
        System.arraycopy(resultado, 0, numeros, 0, n);
    }
    /**
     * Encuentra los Dos Números que Suman un Valor
        📜 Descripción: Dado un vector de enteros y un número objetivo, encuentre dos elementos del vector cuya suma sea igual al número objetivo.
        🔹 Instrucciones:
        Leer un vector de N enteros y un número X.
        Identificar dos números dentro del vector cuya suma sea X.
        Imprimir ambos números o indicar si no existen.
        * Ejemplo de entrada:
        *  Vector: [2, 7, 11, 15]  
            X = 9
        * Ejemplo de salida: Par encontrado: (2, 7)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cantidad de números que el usuario desea ingresar
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        // Crear un vector para almacenar los números
        int[] numeros = new int[n];

        // Leer los números ingresados por el usuario
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Leer el número objetivo X
        System.out.print("Ingrese el número objetivo X: ");
        int x = scanner.nextInt();

        // Buscar y mostrar el par de números cuya suma sea igual a X
        encontrarPar(numeros, x);
    }

    public static void encontrarPar(int[] numeros, int x) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == x) {
                    System.out.println("Par encontrado: (" + numeros[i] + ", " + numeros[j] + ")");
                    return;
                }
            }
        }

        System.out.println("No existen dos números cuya suma sea igual a " + x);
    }
    /**
     * Rotación Circular de un Vector
        📜 Descripción: Desplace circularmente los elementos de un vector k posiciones hacia la derecha.
        🔹 Instrucciones:
        Leer un vector de N enteros y un número k.
        Rotar el vector k posiciones hacia la derecha.
        * Ejemplo de entrada:
        Vector: [1, 2, 3, 4, 5]  
        k = 2
        * Ejemplo de salida: [4, 5, 1, 2, 3]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cantidad de números que el usuario desea ingresar
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        // Crear un vector para almacenar los números
        int[] numeros = new int[n];

        // Leer los números ingresados por el usuario
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Leer el número de posiciones k
        System.out.print("Ingrese el número de posiciones k: ");
        int k = scanner.nextInt();

        // Rotar el vector k posiciones hacia la derecha
        int[] resultado = rotarDerecha(numeros, k);

        // Imprimir el vector rotado
        System.out.println("Vector rotado:");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }

    public static int[] rotarDerecha(int[] numeros, int k) {
        int n = numeros.length;
        int[] resultado = new int[n];
        
        // Asegurarse de que k sea menor que n
        k = k % n;

        // Copiar los últimos k elementos al inicio del vector resultado
        for (int i = 0; i < k; i++) {
            resultado[i] = numeros[n - k + i];
        }

        // Copiar los primeros n-k elementos al final del vector resultado
        for (int i = k; i < n; i++) {
            resultado[i] = numeros[i - k];
        }

        return resultado;
    }
    /**
     * Subsecuencia Más Larga de Números Consecutivos
        📜 Descripción: Encuentre la subsecuencia más larga de números consecutivos en un vector desordenado.
        🔹 Instrucciones:
        Leer un vector de N números enteros.
        Determinar la longitud de la mayor subsecuencia de números consecutivos (no necesariamente contiguos en el vector).
        * Ejemplo de entrada: [100, 4, 200, 1, 3, 2]
        * Ejemplo de salida: Mayor subsecuencia consecutiva: 4 (1, 2, 3, 4)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cantidad de números que el usuario desea ingresar
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        // Crear un vector para almacenar los números
        int[] numeros = new int[n];

        // Leer los números ingresados por el usuario
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Encontrar la mayor subsecuencia consecutiva
        int[] subsecuencia = encontrarLongestConsecutive(numeros);

        // Imprimir la longitud y la mayor subsecuencia consecutiva
        System.out.println("Mayor subsecuencia consecutiva: " + subsecuencia.length + " " + Arrays.toString(subsecuencia));
    }

    public static int[] encontrarLongestConsecutive(int[] numeros) {
        if (numeros.length == 0) {
            return new int[0];
        }

        Arrays.sort(numeros);

        int longestStreak = 1;
        int currentStreak = 1;
        int start = 0;
        int end = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] != numeros[i - 1]) {
                if (numeros[i] == numeros[i - 1] + 1) {
                    currentStreak += 1;
                } else {
                    if (currentStreak > longestStreak) {
                        longestStreak = currentStreak;
                        end = i - 1;
                        start = end - longestStreak + 1;
                    }
                    currentStreak = 1;
                }
            }
        }

        if (currentStreak > longestStreak) {
            longestStreak = currentStreak;
            end = numeros.length - 1;
            start = end - longestStreak + 1;
        }

        return Arrays.copyOfRange(numeros, start, end + 1);
    }
}
