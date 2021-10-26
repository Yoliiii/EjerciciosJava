import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declaración de variables

        int valor;

        // lectura de datos

        System.out.println("Introduce un numero: ");
        valor = sc.nextInt();

        //mostrar datos por pantalla

        if (valor >= 0) {
            System.out.println("Es positivo");
        }
        if (valor < 0){
                    System.out.println("Es negativo");
        }
    }
}

