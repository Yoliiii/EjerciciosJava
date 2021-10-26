import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaración de variables

        int n;
        int x = 100;

        System.out.println("Introduce un número: ");
        n = sc.nextInt();


        //Muestra los resultados por pantalla

        for (int i= n; i <= x; i++ ) {

            if(x % i == 0)

            System.out.println(i);

        }

    }
}
