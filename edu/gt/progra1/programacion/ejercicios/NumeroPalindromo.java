/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
    import java.util.Scanner ;
public class NumeroPalindromo {

        public static boolean esPalindromo(int numero) {
            int original = numero;
            int revertido = 0;

            while (numero > 0) {
                int digito = numero % 10;
                revertido = revertido * 10 + digito;
                numero /= 10;
            }
            return original == revertido;
        }

    public static void principal() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            if (esPalindromo(numero)) {
                System.out.println("El número " + numero + " es palíndromo.");
            } else {
                System.out.println("El número " + numero + " no es palíndromo.");
            }

            scanner.close();
        }
    }    

