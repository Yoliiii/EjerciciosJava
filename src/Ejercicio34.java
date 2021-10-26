import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaración de variable

        int n;
        int contador= 0;


        System.out.println("Introduce 10 numeros: ");

        for (int i=0; i<10; i++) {
            n = sc.nextInt();

            if (n>=0)
                contador++;

        }

        //Muestra los resultados por pantalla

        System.out.println("Se han introducido " + contador + " numeros positivos");

        }
}
