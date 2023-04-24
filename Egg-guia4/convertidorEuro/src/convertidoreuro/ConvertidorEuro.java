
package convertidoreuro;

import java.util.Scanner;

public class ConvertidorEuro {

   
      /*
Crea una aplicación que a través de una función nos convierta una cantidad de
 euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 yenes o libras. La función tendrá como parámetros, la cantidad de euros
 y la moneda a convertir que será una cadena, este no devolverá ningún valor
  y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

     */
    public static void main(String[] args)
    {
        Scanner leer=new Scanner(System.in);

        System.out.println("Introdusca el Monto ");
        double euro=leer.nextDouble();
        System.out.println("Introdusca A que moneda lo quiere convertir? (L/D/Y) ");
        String opc=leer.next().toUpperCase();

        //Le paso los argumento a mi funcion, euro y opc
        convertidorMoneda(euro,opc);
    }
/*
Mi funcion convertidorMoneda tiene dos parametro, uno es de tipo double y se llama cantdEuro
y el segundo parametro es de tipo String y se llama opc
 */
    public static void convertidorMoneda(double cantdEuro, String opc){
        double convLibra=0, convDolar=0, convYenes=0;

        switch (opc) {
            case "L":
                convLibra=cantdEuro*0.86;
                System.out.println("Su convercion es €"+cantdEuro+" a £"+convLibra);
                /*
                Recordar colocar el break en cada caso, de no hcerlo ejecutara
                todo lo que aya x debajo asta encontrar un break
                Las sentencias break; hacen que una vez verificado que se cumple una opción dentro
                 del switch, se salga del mismo y se continúe la ejecución en la siguiente
                 instrucción después del switch
                 */
                break;
            case "D":
                convDolar=cantdEuro*1.28611;
                System.out.println("Su convercion es €"+cantdEuro+" a $"+convDolar);
                break;
            case "Y":
               convYenes=cantdEuro*129.852;
                System.out.println("Su convercion es €"+cantdEuro+" a  ¥"+convYenes);
                break;
            default:
                System.out.println("La moneda que ingreso no existe");
                break;

        }

    }
}
    

