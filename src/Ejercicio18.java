import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declaración de variables

        int valor1;
        int valor2;

        // lectura de datos

        System.out.println("Introduce un numero: ");
        valor1 = sc.nextInt();

        System.out.println("Introduce otro numero: ");
        valor2 = sc.nextInt();

        //mostrar datos por pantalla

        if (valor1 < valor2) {
            System.out.println(valor1 + " " + valor2);

        }
        if (valor1 > valor2){
            System.out.println(valor2 + " " + valor1);
        }
    }

}

