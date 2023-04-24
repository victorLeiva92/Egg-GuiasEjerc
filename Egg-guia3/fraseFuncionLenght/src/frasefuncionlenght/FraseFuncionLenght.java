
package frasefuncionlenght;

import java.util.Scanner;

public class FraseFuncionLenght {
  /*
        Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el usuario ingresa una frase o
        palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
         en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
         */
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese una frase de 8 caracter: ");
        String frase=leer.nextLine();//Ingreso x consola la frase o palabra y la guardo en mi variable frase de tipo String.
  
        //si la longitud de mi frase es igual a 8 . Imprimir correcto, caso contrario Incorrecto
        if(frase.length()==8){
            System.out.println("Correcto");
            System.out.println("La frase: "+frase+" tiene una longitud de : "+frase.length());
            
        }else{
            System.out.println("Incorrecto");
            System.out.println("La frase: "+frase+" tiene una longitud de : "+frase.length());
        }

    }
    
}
