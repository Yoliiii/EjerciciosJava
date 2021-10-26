import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declaración de variables

        int valor1;
        int valor2;
        int valor3;
        int mayor = 0;

        // lectura de datos

        System.out.println("Introduce numero 1: ");
        valor1 = sc.nextInt();

        System.out.println("Introduce numero 2: ");
        valor2 = sc.nextInt();

        System.out.println("Introduce numero 3: ");
        valor3 = sc.nextInt();


        //mostrar datos por pantalla

        if (valor1 >= valor2) {
            mayor = valor1;
        }

        if (valor1 <= valor2) {
            mayor = valor2;
        }

        if (mayor <= valor3) {
            System.out.println("El numero mayor es: " + valor3);
        }

        if (valor3 <= mayor) {
            System.out.println("El numero mayor es: " + mayor);
                    }
                }
            }

