
package parimpar;

import java.util.Scanner;// Importo la libreria Scanner


public class ParImpar {// Clase ParImpar
    /*
       Crear un programa que dado un número determine si es par o impar.
    */
    
/*
    Les dejo un link donde esplica el metodo main.
    https://javautodidacta.es/metodo-main-en-java/
    */
    public static void main(String[] args) {// Metodo de la clase, donde se ejecuta el programa
        
        
          Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num=leer.nextInt();//Obtengo mi valor por consola y lo guardo en la variable num de tipo int.
        
             // El operador % me da el resto de una division, por ejem:
            //la variable num vale 4%2 el resto es 0 y lo compara con ==0;
            
        if(num % 2==0){//Si la condicion se cumple. Imprime este mensaje 
            System.out.println("El Numero "+num+" es Par");
         }else{//Sino se cumple la condicion. Imprime este mensaje
            System.out.println("El Numero "+num+" Impar");
        }
    }
    
}
