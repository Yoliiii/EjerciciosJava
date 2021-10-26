import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor;


        System.out.println("Introduce del 1 al 7 para saber los dias de la semana: ");
        valor = sc.nextInt();

        if (valor == 1) {
            System.out.println("Lunes");
            }else{

                if (valor == 2) {
                    System.out.println("Martes");
                }else{

                    if (valor == 3) {
                        System.out.println("Miercoles");
                    }else{

                        if (valor == 4) {
                            System.out.println("Jueves");
                        }else{

                            if (valor == 5) {
                                System.out.println("Viernes");
                            }else {

                                if (valor == 6) {
                                    System.out.println("Sábado");
                                } else {

                                    if (valor == 7) {
                                        System.out.println("Domingo");

                                    }

                                }
                            }
                        }
                    }
                }
            }
        }

    }




    //La estructura if -else permite al programa ejecutar más opciones de instrucciones