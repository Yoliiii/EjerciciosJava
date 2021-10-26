import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declaración de variables

        double radio;
        double perimetro;
        double area;
        final double PI = 3.14159;

        // lectura de datos

        System.out.println("Introduce radio: ");
        radio = sc.nextDouble();

        //transformar datos

        area = PI * (radio * radio);
        perimetro = 2 * PI * radio;

        //mostrar datos por pantalla

        System.out.println("Area es: " + area);
        System.out.println("Perimetro es: " + perimetro);

    }
}

