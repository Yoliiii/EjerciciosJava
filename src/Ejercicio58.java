import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaracion de variables

        String texto;
        int contador = 0;

        //Lectura de datos

        System.out.println("Introduce texto: ");
        texto = sc.next();

        //Mostrar datos por pantalla

        char[] vocales = {'a', 'e','i','o','u'};
        for( int i = 0; i < texto.length(); i++);
            for (char vocal : vocales) {
                if (texto.charAt(i) == vocal) {
                    contador++;
                    break;

            }
        }
        System.out.println(contador);
    }
}
