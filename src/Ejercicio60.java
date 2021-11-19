import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaracion de variables

        int resto;
        int nDividido;

        //Lectura de datos

        System.out.println("Introduce un número decimal y un digito: ");
        int n = sc.nextInt();

        //Mostrar datos por pantalla

        for (int i = n; i > 0; i /= 2) {
            resto = i % 2;
            nDividido = i / 2;
            System.out.println(resto);
        }
    }
}

