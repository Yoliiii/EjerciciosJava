import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaracion de variables

        long n, digito, decimal;
        int exponente;

        //Lectura de datos

        System.out.println("Introduce un número binario: ");
        n = sc.nextInt();

        //Mostrar datos por pantalla

        while (n != 0) {
            digito = n % 10;
            decimal = decimal + digito * (int) Math.pow(2, exponente);
            exponente++;
            n = n / 10;
        }
        System.out.println("Decimal: "+ decimal);
    }
}

