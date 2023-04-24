
package esmultiplico;

import java.util.Scanner;

public class EsMultiplico {

  /*
    Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario,
    validando que el primer número múltiplo del segundo e imprima si el primer número
     es múltiplo del segundo, sino informe que no lo son.
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese el primer Numero: ");
        int num1=leer.nextInt();
        System.out.print("Ingrese el Segundo Numero: ");
        int num2=leer.nextInt();

        esMultiplo(num1,num2);


    }
    
    public static void esMultiplo(int n1,int n2){

        if (n1%n2==0)//Si el resto de la division es igual a 0 , entra al bloque if.
            System.out.println("Es multiplo");
        else
            System.out.println("No es multiplo");
    }
}
