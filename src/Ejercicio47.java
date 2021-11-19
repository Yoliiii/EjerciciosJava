import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaracion de variable
        int n;


        //Lectura de datos

        System.out.println("Introduce un número: ");
        n = sc.nextInt();

        //Muestra los resultados por pantalla

        for (int i = 1; i <= n; i++) {
            for (int contador = 1; contador <= i; contador++);
            System.out.print(contador);
        }
    }
}
