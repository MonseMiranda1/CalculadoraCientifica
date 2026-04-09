import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraCientifica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> historial = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n=== CALCULADORA CIENTÍFICA 🧮 ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Módulo (residuo)");
            System.out.println("8. Porcentaje");
            System.out.println("9. Raíz cúbica");
            System.out.println("10. Área de círculo");
            System.out.println("11. Ver historial");
            System.out.println("12. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            double num1, num2, resultado;

            switch (opcion) {

                case 1:
                    num1 = leerNumero(scanner, "Ingrese primer número: ");
                    num2 = leerNumero(scanner, "Ingrese segundo número: ");
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    historial.add(num1 + " + " + num2 + " = " + resultado);
                    break;

                case 2:
                    num1 = leerNumero(scanner, "Ingrese primer número: ");
                    num2 = leerNumero(scanner, "Ingrese segundo número: ");
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    historial.add(num1 + " - " + num2 + " = " + resultado);
                    break;

                case 3:
                    num1 = leerNumero(scanner, "Ingrese primer número: ");
                    num2 = leerNumero(scanner, "Ingrese segundo número: ");
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    historial.add(num1 + " * " + num2 + " = " + resultado);
                    break;

                case 4:
                    num1 = leerNumero(scanner, "Ingrese primer número: ");
                    num2 = leerNumero(scanner, "Ingrese segundo número: ");

                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                        historial.add(num1 + " / " + num2 + " = " + resultado);
                    } else {
                        System.out.println("❌ Error: No se puede dividir por 0");
                    }
                    break;

                case 5:
                    num1 = leerNumero(scanner, "Ingrese base: ");
                    num2 = leerNumero(scanner, "Ingrese exponente: ");
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    historial.add(num1 + "^" + num2 + " = " + resultado);
                    break;

                case 6:
                    num1 = leerNumero(scanner, "Ingrese número: ");

                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                        System.out.println("Resultado: " + resultado);
                        historial.add("√" + num1 + " = " + resultado);
                    } else {
                        System.out.println("❌ Error: número negativo");
                    }
                    break;

                case 7:
                    System.out.print("Ingrese número 1: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingrese número 2: ");
                    int b = scanner.nextInt();

                    if (b != 0) {
                        int mod = a % b;
                        System.out.println("Resultado: " + mod);
                        historial.add(a + " % " + b + " = " + mod);
                    } else {
                        System.out.println("❌ Error: división por 0");
                    }
                    break;

                case 8:
                    num1 = leerNumero(scanner, "Ingrese número: ");
                    num2 = leerNumero(scanner, "Ingrese porcentaje: ");
                    resultado = num1 * num2 / 100;
                    System.out.println("Resultado: " + resultado);
                    historial.add(num2 + "% de " + num1 + " = " + resultado);
                    break;

                case 9:
                    num1 = leerNumero(scanner, "Ingrese número: ");
                    resultado = Math.cbrt(num1);
                    System.out.println("Resultado: " + resultado);
                    historial.add("∛" + num1 + " = " + resultado);
                    break;

                case 10:
                    num1 = leerNumero(scanner, "Ingrese radio: ");
                    resultado = Math.PI * Math.pow(num1, 2);
                    System.out.println("Área: " + resultado);
                    historial.add("Área círculo (r=" + num1 + ") = " + resultado);
                    break;

                case 11:
                    System.out.println("\n📜 HISTORIAL:");
                    if (historial.isEmpty()) {
                        System.out.println("Sin operaciones.");
                    } else {
                        for (String op : historial) {
                            System.out.println(op);
                        }
                    }
                    break;

                case 12:
                    System.out.println("👋 Saliendo...");
                    break;

                default:
                    System.out.println("❌ Opción inválida");
            }

        } while (opcion != 12);

        scanner.close();
    }

    // ✅ VALIDACIÓN ROBUSTA
    public static double leerNumero(Scanner scanner, String mensaje) {
        double numero;

        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                break;
            } else {
                System.out.println("❌ Ingrese un número válido");
                scanner.next();
            }
        }

        return numero;
    }

    // 🔹 FUNCIONES (se mantienen)

    public static int sumar(int a, int b){
        return a + b;
    }

    public static int restar(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static int dividir(int a, int b){
        return a / b;
    }

    public static double potencia(double a, double b){
        return Math.pow(a, b);
    }

    public static double raiz(double a){
        return Math.sqrt(a);
    }

    public static int modulo(int a, int b){
        return a % b;
    }
}
