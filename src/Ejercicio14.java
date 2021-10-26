import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declaración de variable

        int edad;

        // lectura de datos

        System.out.println("Introduce un numero : ");
        edad = sc.nextInt();

        //mostrar datos por pantalla

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }
        if (edad < 18){
            System.out.println("Menor de edad");
    }
}

}
