
package menucalculadora;

import java.util.Scanner;

public class MenuCalculadora {
  /*
    Realizar un programa que pida dos números enteros positivos
    por teclado y muestre por pantalla el siguiente menú:
    El usuario deberá elegir una opción y el programa deberá mostrar
    el resultado por pantalla y luego volver al menú. El programa deberá
    ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
    si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
    se debe mostrar el siguiente mensaje de confirmación:
    ¿Está seguro que desea salir del programa (S/N)? 
    Si el usuario selecciona el carácter ‘S’ se sale del programa,
    caso contrario se vuelve a mostrar el menú.
    */
    public static void main(String[] args) {
       
        int opc;
        double num1=0, num2=0;
       
        boolean bandera=true;
        String opc2="";
        Scanner leer= new Scanner(System.in);
        
              /*
             este ciclo valida q el numero sea positivo, sino se lo volvera a pedir
             */
        while (bandera){
            System.out.print("Ingrese el 1 numero: ");
            num1=leer.nextInt();
            System.out.print("Ingrese el 2 numero: ");
            num2=leer.nextInt();
             //los numeros ingresdos deben ser mayores sino entra al else
            if(num1>0 && num2>0) {// 
                break;//corta el bucle
            }else{
                System.out.println("Vuelva a intentarlo");//
            }
        }


        do{
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicacion");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            System.out.print("Elija una opc: ");
            opc=leer.nextInt();

            switch (opc){// toma la opc que le aya pasado x consola
                case 1:
                    double suma=num1+num2;
                    System.out.println("La suma de "+num1+ "+" +num2+" es: "+suma);
                    break;
                case 2:
                    double resta=num1-num2;
                    System.out.println("La Resta de "+num1+ "-" +num2+" es: "+resta);
                    break;
                case 3:
                    double mult=num1*num2;
                    System.out.println("La Multiplicacion  de "+num1+ "*" +num2+" es: "+mult);
                    break;
                case 4:
                    double division=num1/num2;
                    System.out.println("La Divicion de "+num1+ "/" +num2+" es: "+num1/num2);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                     opc2=leer.next();
                      
                      break;
                     default:
                System.out.println("Numero no valido");
                break;
                
                     
                      }
                
                if(opc2.equalsIgnoreCase("S")){
                          
                        break;
            }
                

        }while (opc>0 || opc<5);//opc!=5 && (opc2.equals("N")|| !opc2.equalsIgnoreCase("S"))

    }
    
}
