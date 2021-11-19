import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaracion de variables

        int numero;

        int [] n = new int[10];

        //Lectura de datos
        System.out.println("Introduce un numero: ");

        //Muestra los resultados por pantalla

        for(int i = 0; i <= 9; i++) {
            n[i] = sc.nextInt();

            for(int j = 9; i >= 0;j--) {
                System.out.println(n[j]);
            }
        }

    }
}
