import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declaración de variable

        float valor;

        // lectura de datos

        System.out.println("Introduce un numero: ");
        valor = sc.nextFloat();

        //mostrar datos por pantalla

        if (valor % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");

        }
    }
}
