
package validarletrafuncionsubstringyequals;

import java.util.Scanner;

public class ValidarLetrafuncionSubstringYequals {
    /*
         Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
         Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
         en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
   
*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
         System.out.println("Ingrese una Frase");
        String frase=leer.next();
       
        // el metodo substring() obtiene la posicion que le pase por argumento(0,1) y lo guarda en mi variable letra
        String letra=frase.substring(0,1);
        System.out.println(letra);//    Muestra la letra que tiene mi variable
       
        //si lo q contiene letra es igual a lo que tiene el metodo equals("A")entonce es true y debe imprimir el mensaje correcto
        //el metodo equalsIgnoreCase ignora si esta en Mayuscula o minuscula la letra
        if(letra.equalsIgnoreCase("A")){
            System.out.println("Correcto");
        }else{//caso contrario debe imprimir incorrecto
            System.out.println("Incorrecto");
        }
   
/*
        
       // otra forma de hcerlo mas corto es:
        System.out.println("Ingrese una Frase");
        String frase3=leer.next().

        if(frase3.substring(0, 1).equalsIgnoreCase("A")){
            System.out.println("Correcto");
        }else{//caso contrario debe imprimir incorrecto
            System.out.println("Incorrecto");
        }
       
           
*/
        
    }
    
}
