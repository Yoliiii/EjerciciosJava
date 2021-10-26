import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declaración de variables

        int valor1;
        int valor2;

        //lectura de datos

        System.out.println("Introduce un numero: ");
        valor1 = sc.nextInt();

        System.out.println("Introduce otro numero: ");
        valor2 = sc.nextInt();

        //mostrar datos por pantalla

        int suma = valor1 + valor2;
        int resta = valor1 - valor2;
        int multiplicacion = valor1 * valor2;
        int division = valor1 / valor2;


        System.out.println("resultado: " + suma);
        System.out.println("resultado: " + resta);
        System.out.println("resultado: " + multiplicacion);
        System.out.println("resultado: " + division);
    }
}