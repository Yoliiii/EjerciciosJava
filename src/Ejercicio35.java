import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaración de variables

        int n;
        int contador = 0;

        //Lectura de datos

        System.out.println("Introduce un número: ");

        for (int i = 0; i < 10; i +=1) {
            n = sc.nextInt();

            if (n >= 0)
                contador++;

        }

            //Muestra el resultado por pantalla

            System.out.println("Se han introducido " + contador + " números positivos");

    }
}
