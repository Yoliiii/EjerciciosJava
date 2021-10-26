import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        //Declaración de variables

        double valor1;
        double valor2;
        String op;
        double resultado;

        //Lectura de datos

        System.out.println("Introduce un número: ");
        valor1 = miScanner.nextDouble();

        System.out.println("Introduce otro número");
        valor2 = miScanner.nextDouble();

        System.out.println("Introduce operador: ");
        op = miScanner.next();


        //Mostrar datos por pantalla

        switch (op) {
            case "+" :
                resultado = valor1 + valor2;
                break;
            case "-" :
                resultado = valor1 - valor2;
                break;
            case "*" :
                resultado = valor1 * valor2;
                break;
            case "/" :
                resultado = valor1 / valor2;
                break;

            default:
                resultado = 0;

              }

                System.out.println("Resultado: " + resultado);





        }
    }
