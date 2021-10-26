import java.util.Scanner;

public class Ejercicio7 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            //declaración de variables

            int precioReal;
            int precioRebajado;
            int descuento;

            // lectura de datos

            System.out.println("Introduce precio real: ");
            precioReal = sc.nextInt();

            System.out.println("Introduce precio rebajado: ");
            precioRebajado = sc.nextInt();


            //mostrar datos por pantalla

            descuento = precioReal - precioRebajado;

            System.out.println("Descuento: " + descuento);

        }
    }
