
package valoreslimitepositivo;

import java.util.Scanner;

public class ValoresLimitePositivo {
     /*
     Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números
     al usuario hasta que la suma de los números introducidos supere el límite inicial.
      */

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
          int suma=0,num;
         boolean bandera=true;
         int numLimite=0;
         while (bandera){
             /*
             este ciclo valida q el numero sea positivo, sino se lo volvera a pedir
             */
             System.out.println("Ingrese un valor limite positivo");
             numLimite = leer.nextInt();
             if(numLimite>0) { //Si el numero ingresado es mayor ingresa y
                 break;        //  detiene la ejecución del bucle y sale de él.
             }else{
                 System.out.println("Vuelva a intentarlo");
             }
         }

        do{

            System.out.print("Ingrese un numero: ");
            num=leer.nextInt();
             suma+=num;
        }while (suma>0 && suma<numLimite);

          System.out.println("Supero su limite "+numLimite+" La suma es: "+suma);
    }
    }
    

