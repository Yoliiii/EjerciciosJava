import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declaracion de variable

        int valor;

        //lectura de datos

        System.out.println("Introduce un numero: ");
        valor = sc.nextInt();

        //mostrar resultados por pantalla

        if (valor >= 0) {
            System.out.println("Valor absoluto: " + valor);
        }

        if (valor < 0) {
            System.out.println("Valor absoluto " + valor * (-1));

        }

    }
}
