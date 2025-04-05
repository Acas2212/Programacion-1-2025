/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.edu.gt.progra1.programacion.ejercicios;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class EjerciciosProgra1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Selecciona una opcion:");
            System.out.println("1. Formula Cuadratica");
            System.out.println("2. Numero Palindromo");
            System.out.println("3. Numero Vampiro");
            System.out.println("4. Palabra Palindroma");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> FormulaCuadratica.principal();
                case 2 -> NumeroPalindromo.principal();
                case 3 -> NumeroVampiro.principal();
                case 4 -> PalabraPalindroma.principal();
                default -> System.out.println("Opción no válida");
            }
        }

        private static void FormulaCuadratica() {
        }

        private static void NumeroPalindromo() {
        }

        private static void NumeroVampiro() {
        }

        private static void PalabraPalindroma() {
        }
    }
