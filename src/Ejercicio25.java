import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaración de variables

        int valor;

        //Lectura de datos

        System.out.println("Introduce un número: ");
        valor = sc.nextInt();

        //Mostrar datos por pantalla

        switch (valor) {
            case 0:
            case 1:
            case 2:
                System.out.println("Muy Deficiente");
                break;
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");

            default:

        }
    }
}
