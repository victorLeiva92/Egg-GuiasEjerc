
package comparafrasefunciónequals;

import java.util.Scanner;

public class ComparaFraseFunciónEquals {

 /*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto,
 sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
  */
    public static void main(String[] args) {
        
        Scanner leer=new  Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase=leer.next();//Ingreso mi Frase x consola y la guardo en mi variable frase de tipo String.
    
     
//compara lo q contiene mi variable frase, con el metodo equeals q resive como argumento("eureka"). si es true se imprime el mensaje
        if(frase.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");//sino imprime este mensaje
        }
      
    }
    
}
