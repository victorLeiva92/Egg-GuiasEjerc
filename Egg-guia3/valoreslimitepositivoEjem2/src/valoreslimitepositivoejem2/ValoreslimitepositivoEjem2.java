/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valoreslimitepositivoejem2;

import java.util.Scanner;


public class ValoreslimitepositivoEjem2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
         int suma=0, num3;
         boolean bandera=false;// Mi bandera es false
         int numLimite=0;
         //el signo ! niega mi valor, en este caso mi bandera es false y pasa a ser true 
         /*cuando entre a la condicion del if(numLimite>0){bandera=true;}
         mi bandera es true al negarlo pasa a ser false y se corta el ciclo
          */
         while (!bandera){
             /*
             este ciclo valida q el numero sea positivo, sino se lo volvera a pedir
             */
             System.out.println("Ingrese un valor limite positivo");
             numLimite = leer.nextInt();
             
             if(numLimite>0) {
                 bandera = true;//si el numero ingresado es positivo mi bandera cambia a true; 
                  
             }else{
                 System.out.println("Vuelva a intentarlo");// si el numero es negatibo imprimira este mensaje
             }
         }

        do{

            System.out.print("Ingrese un numero: ");
            num3=leer.nextInt();
             suma+=num3;//va sumando el numero ingresado x consola
             //Mientras suma sea menor al limite se seguira ejecutando el bucle
        }while (suma<numLimite);//El bucle se detendra cuando suma supere el limite
        
        System.out.println("Supero su limite "+numLimite+" La suma es: "+suma);

    }
    
}
