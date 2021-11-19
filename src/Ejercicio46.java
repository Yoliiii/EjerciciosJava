import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaración de variable

        int nota;
        int i = 0;
        int notaMedia = 0;
        int contador = 0;

        System.out.println("Introduce un nota: ");
        nota = sc.nextInt();

        //Muestra el resultado por pantalla

        do {
            if (nota == 10) {
                contador++;
            }

            if (nota >= 0 && nota <= 10) {
                i = 1 + nota;
                nota++;
                notaMedia++;
            }

        } while (nota != -1);
        System.out.println("Nota media es: " + i / notaMedia + "Has sacado" + contador + "dieces");
    }
}
