package com.ejemplo.calculadora;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione la operación: (+, -, *, /) o 'salir' para terminar:");
            String operacion = scanner.nextLine();

            if (operacion.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.print("Ingrese el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double numero2 = scanner.nextDouble();
            
            // Limpia el buffer de entrada
            scanner.nextLine();

            double resultado = 0;
            boolean operacionValida = true;

            switch (operacion) {
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Operación no válida.");
                    operacionValida = false;
                    break;
            }

            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }
        }
        scanner.close();
        System.out.println("Calculadora finalizada.");
	}

}
