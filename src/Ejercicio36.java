import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaración de variables

        int n;
        int contador = 0;

        //Lectura de datos

        System.out.println("Escribe un número: ");
        n = sc.nextInt();


        for (int i = 0; i < 11; i++) {

            contador = n * i;


            System.out.println("Tabla de multiplicación de:" + n + " * " + i + " = " + contador);

        }
    }
}
