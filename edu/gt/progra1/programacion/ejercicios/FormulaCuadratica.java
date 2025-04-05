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
public class FormulaCuadratica {
    public static void principal() {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.println("Ingrese el valor de a: ");
        a = scanner.nextDouble();

        while (a == 0) {
            System.out.println("El valor de a debe ser diferente de 0");
            System.out.println("Ingrese el valor de a: ");
            a = scanner.nextDouble();
        }

        System.out.println("Ingrese el valor de b: ");
        b = scanner.nextDouble();

        System.out.println("Ingrese el valor de c: ");
        c = scanner.nextDouble();

        ecuacion_cuadratica(a, b, c);
    }

    public static void ecuacion_cuadratica(double a, double b, double c) {
        double discriminante, aux, aux2;

        discriminante = (Math.pow(b, 2)) - (4 * a * c);

        if (discriminante > 0) {
            aux = (-b + Math.sqrt(discriminante)) / (2 * a);
            aux2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones reales son: " + aux + " y " + aux2);
        } else if (discriminante == 0) {
            aux = -b / (2 * a);
            System.out.println("La solución real es: " + aux);
        } else {
            System.out.println("No hay soluciones reales.");
        }
    }
}
