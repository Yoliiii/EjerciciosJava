import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaración de variables

        int h;
        int m;
        int s;
        int h2;
        int m2;
        int s2;
        int horasTotales;
        int minutosTotales;
        int segundosTotales;


        //Lectura de datos

        System.out.println("Introduce hora: ");
        h = sc.nextInt();

        System.out.println("Introduce minutos: ");
        m = sc.nextInt();

        System.out.println("Introduce segundos: ");
        s = sc.nextInt();

        System.out.println("Introduce horas adicionales: ");
        h2 = sc.nextInt();

        System.out.println("Introduce horas adicionales: ");
        m2 = sc.nextInt();

        System.out.println("Introduce horas adicionales: ");
        s2 = sc.nextInt();

        horasTotales = h + h2;
        minutosTotales = m + m2;
        segundosTotales = s + s2;

        //Transformar datos
        //De segundos a minutos

    }
}
