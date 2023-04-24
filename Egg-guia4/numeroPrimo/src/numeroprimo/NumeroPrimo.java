/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class NumeroPrimo {

    
    
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        System.out.println(numeroPrimo(num));
    }
    public static boolean numeroPrimo(int num){
        int mod, contd;
        contd = 0;
        for (int i=1; i<num; i++) { //itera asta que i sea menor al numero q ayamos ingresado x consola.
            if ((num%i)==0) {//si el resto de una division da 0 entra al bloque if y el contd se incrementa
                contd++; //
                // ejemplo: el 25 no es primo xq es divisible x 1 y por 5 y por si mismo . el 7 es primo xq es divisible x 1 y por si mismo.
            }
        }
        return contd<=1; // cuando contd sea mayor a 1 devuelve false y cuando es igual a 1 la condicion devuelve true.
        
    }
}

