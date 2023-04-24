
package fincionesoperacionesmatematicas;

import java.util.Scanner;

public class FincionesOperacionesMatematicas {
 /*
    Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
    restar, multiplicar y dividir.
    La aplicación debe tener una función para cada operación matemática y
    deben devolver sus resultados para imprimirlos en el main.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el 1 numero: ");
        double num1 = leer.nextInt();
        System.out.println("Ingrese el 2 numero: ");
        double num2 = leer.nextInt();
        int opc;
        do {
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicacion");
            System.out.println("4- Division");
            System.out.println("5- Salir");
            System.out.print("Ingrese una opcion: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    //llamo la funcion y le paso los argumento num1, num2 
                    //esta funcion retorna un valor y lo muestro
                    System.out.println("La suma es: " +suma(num1,num2));
                    break;
                case 2:
                    System.out.println("La Resta es: " + resta(num1,num2));
                    break;
                case 3:
                    System.out.println("La Multiplicacion es: " +multiplicacion(num1,num2));
                    break;
                case 4:
                    System.out.println("La Division es: " + division(num1,num2));
                    break;
                case 5:
                    System.out.println("Fin del Proceso");
                    break;
                default:
                    System.out.println("El numero ingresado no corresponde vuelva a intentarlo");
            }
        } while (opc>0 && opc<5);// mientras que las opciones sean 1 asta 4 va entrar al bucle y cuando ingrese 5 sale del bucle do while


    }
    /*
      funcion suma resive dos parametros, de tipo double n, n2.
      La funcion retorna un valor de tipo double.
    */
    
    public static double suma(double n, double n2){
        double restSuma=0;

        return restSuma=n+n2;//retorna el resultado 
    }

    public static double resta(double n, double n2){
        double restResta=0;

        return restResta=n-n2;
    }

    public static double multiplicacion(double n, double n2){
        double mult=0;

        return mult=n*n2;
    }

    public static double division(double n, double n2){
        double div=0;

        return div=n/n2;
    }
}
