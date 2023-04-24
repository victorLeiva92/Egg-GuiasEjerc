
package cuadradoasterisco;

import java.util.Scanner;

public class CuadradoAsterisco {
   
       /*
    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    * * * *
    *     *
    *     *
    * * * *
    
    IMPORT: hce se veria si usaramos el metodo println. Abajo le dejo como se ve con el metodo print pero para mostrarlo unido usamos el print sin el salto de linea y se veria de esta forma 

    */
    
    
    public static void main(String[] args) {
        // IMPORTANTE abajo deje una esplicacion de como funciona el recorrido de los dos for
        
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n=leer.nextInt();
        
        for(int i=0; i<n; i++){
            //i=1;
           
             
            for(int j=0; j<n; j++){
                //j=0, j=1, j=2 j=3
                
                
              /*
                El if tiene 4 condiciones 
                (true)||(false)||(false)||(false) i=0           
                (false)||(true)||(flase)||(true)  j=0 y j=n-1   
                (false)||(true)||(flase)||(true)  j=0 y j=n-1
                (false)||(false)||(true)||(false) i=n-1
                */   
               if(i==0 || j==0 || i==n-1 || j==n-1){
                   /*// * 0 0 *
                   i=0 true        
                   j=0  j=n-1 true 
                   j=0  j=n-1 true 
                   i=n-1 true
                  
                   */
                    System.out.print("* ");
             
               }else {
                   /*
                   j=1 j=2 false
                   j=1 j=2 false
                   me va pintar un espacio"  "
                   */
                   System.out.print("  ");
                   
              
               }

            }
            System.out.println("");
        }

    }
    /*
    ****************************************************************************+
    en este ejemplo n vale 4.
    
    *El bucle for i su valor es 0
     el bucle for j se va iterar asta llegar al valor de longitud n,  ejemplo: j=0, j=1, j=2, j=3.
    
    i=0;true j=0   con print se veria hce. * * * *
    i=0;true j=1                             
    i=0;true j=2                             
    i=0;true j=3
     
     El if tiene 4 condiciones y la va ir evaluando de a una.
        true  
     if(i=0 || j=0 || i=n-1 || j=n-1){
     System.out.print("* " );
    }else{
     System.out.println("0");
    }
    
    *************************************************************************************************
    
    *El bucle for i, su valor es 1
    *El bucle for j se va iterar asta llegar al valor de longitud n .
    
    i=1; j=0 true   con print se veria hce. * 0 0 *
    i=1; j=1 false                          
    i=1; j=2 false                          
    i=1; j=3 true
    
     El if tiene 4 condiciones y la va ir evaluando de a una.
    
       false   true    false    true
     if(i=0 || j=0 || i=n-1 || j=n-1){
     System.out.print("* " );
    }else{
     System.out.println("0");
    }
   
    ******************************************************************************************
    
   *El bucle for i su valor es 2
   *El bucle for j se va iterar asta llegar al valor de longitud n
    
    i=2; j=0 true  con print se veria hce. * 0 0 *
    i=2; j=1 false                           
    i=2; j=2 false                          
    i=2; j=3 true
    
     El if tiene 4 condiciones y la va ir evaluando de a una.
        false  true   false    true
     if(i=0 || j=0 || i=n-1 || j=n-1){
     System.out.print("* " );
    }else{
     System.out.println("0");
    
    *****************************************************************************************************
    
    *El bucle for i su valor es 3
    *El bucle for j se va iterar asta llegar al valor de longitud n
    
    i=3; true j=0   con print se veria hce. * * * *
    i=3; true j=1                             
    i=3; true j=2                             
    i=3; true j=3
    
                      true
     if(i=0 || j=0 || i=n-1 || j=n-1){
     System.out.print("* " );
    }else{
     System.out.println("0");
    
    ejemplo:
    hce se veria si la variable n valdria 4.
    aclaro que uso el 0 para que se pueda visualizar mejor.
    * * * *
    * 0 0 *
    * 0 0 *
    * * * *
    
    */
    
    
}
