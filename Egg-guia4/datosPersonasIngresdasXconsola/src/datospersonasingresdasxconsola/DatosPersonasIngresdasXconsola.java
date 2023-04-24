
package datospersonasingresdasxconsola;

import java.util.Scanner;


public class DatosPersonasIngresdasXconsola {

     /*
Diseñe una función que pida el nombre y la edad de N personas e imprima
los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad.
 Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando
  personas y frenar cuando el usuario ingrese la palabra “No”.
     */
    public static void main(String[] args) {

        ingresarDatosUsuarios();

    }
    public static void ingresarDatosUsuarios() {
        Scanner leer = new Scanner(System.in);
        String nombre, op;
        int edad;

        do {
            System.out.println("Ingrese su nombre: ");
            nombre = leer.next();
            System.out.println("Ingrese su edad: ");
            edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println("Su nombre es "+nombre + " tiene " + edad + " años y es mayor de edad");
            } else {
                System.out.println("Su nombre es"+nombre + " tiene " + edad + " años es menor de edad");
            }

                System.out.println("Desea seguir mostrando personas (S/N)");
                op = leer.next();// lee la opc y luego determina si sigue la ejecucion o se termina.
            if (op.equalsIgnoreCase("N")) {
                break;//si el usuario ingreso N termina la ejecucion del do while 
            }
        } while (op.equalsIgnoreCase("S"));//si la opc ingresada es S el bucle se seguira ejecutando
    }
}