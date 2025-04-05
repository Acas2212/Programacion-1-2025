/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.ejercicios;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class PalabraPalindroma {

    public static void principal() {
        Scanner scanner = new Scanner(System.in);
        String palabra;

        System.out.println("Ingrese una palabra");
        palabra = scanner.nextLine();

        if (evaluar(palabra)) {
            System.out.println(palabra + " es un palíndromo");
        } else {
            System.out.println(palabra + " no es un palíndromo");
        }
    }

    public static boolean evaluar(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return false;
        }

        int left = 0;
        int right = palabra.length() - 1;

        while (left < right) {
            if (palabra.charAt(left) != palabra.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
