import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declaracion de variable

        int valor;
        int valor1;
        int valor2;

        //lectura de datos

        System.out.println("Introduce un numero: ");
        valor1 = sc.nextInt();

        System.out.println("Introduce otro numero: ");
        valor2 = sc.nextInt();

        //mostrar resultados por pantalla

        if (valor1 >= valor2) {
            valor = valor1 - valor2;
            System.out.println(valor);
        }

            if (valor2 > valor1) {
                valor = valor2 - valor1;
                System.out.println(valor);
            }

        }
    }
