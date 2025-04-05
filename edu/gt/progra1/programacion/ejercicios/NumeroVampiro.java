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
import java.util.Arrays ;
public class NumeroVampiro {
    public static void principal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el rango inferior: ");
        int lowerRange = scanner.nextInt();

        System.out.println("Ingrese el rango superior: ");
        int upperRange = scanner.nextInt();

        for (int number = lowerRange; number <= upperRange; number++) {
            if (isVampireNumber(number)) {
                System.out.println("El primer número vampiro en el rango dado es: " + number);
                return;
            }
        }

        System.out.println("No se encontró ningún número vampiro en el rango dado.");
    }

    public static boolean isVampireNumber(int number) {
        String numberStr = Integer.toString(number);
        int numDigits = numberStr.length();

        if (numDigits % 2 != 0) {
            return false; // Un número vampiro debe tener un número par de dígitos
        }

        int halfDigits = numDigits / 2;
        for (int i = (int) Math.pow(10, halfDigits - 1); i < Math.pow(10, halfDigits); i++) {
            if (number % i == 0) {
                int j = number / i;
                if (i % 10 == 0 && j % 10 == 0) {
                    continue; // Los colmillos no pueden terminar ambos en cero
                }

                String fang1 = Integer.toString(i);
                String fang2 = Integer.toString(j);

                char[] originalDigits = numberStr.toCharArray();
                char[] fangDigits = (fang1 + fang2).toCharArray();

                Arrays.sort(originalDigits);
                Arrays.sort(fangDigits);

                if (Arrays.equals(originalDigits, fangDigits)) {
                    return true;
                }
            }
        }

        return false;
    }    
}


