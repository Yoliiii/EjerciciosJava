 import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaración de variables

        int n;
        int j;

        System.out.println("Introduce un número: ");
        n = sc.nextInt();


        for (int i = 1; i < n; i++ ) {
            for (int j = i; j >= 1; i++) {
                System.out.println(j);
            }
            for (int j = 2; j <= i; i++) {
                System.out.println(j);
            }

        }
    }
}