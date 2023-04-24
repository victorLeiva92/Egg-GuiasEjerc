
package cambiarvocalesconmetodoconcat;

import java.util.Scanner;

public class CambiarVocalesConMetodoConcat {

    /*
    Escribir un programa que procese una secuencia de caracteres
    ingresada por teclado y terminada en punto, y luego codifique
    la palabra o frase ingresada de la siguiente manera: cada vocal
    se reemplaza por el carácter que se indica en la tabla y el resto
    de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
    a e i o u
    @ # $ % *
    Realice un subprograma que reciba una secuencia de caracteres
    y retorne la codificación correspondiente. Utilice la estructura
    “según” para la transformación.
    Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
    La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();

        System.out.println("Su Frase es : " + frase);
        System.out.println("Su nueva Frase es: "+codificarFrase(frase));

    }
    public static String codificarFrase(String frase) {
        String cambiarVocal;
        int contd=0;
       String cambiar = "";
        for (int i = 0; i < frase.length(); i++) {
             /*
            Obtengo la letra con el metodo substring()en la posicion (i,i+1).
            El primer argumento que le paso es (i) q se va ir iterando con el
             bucle for y el segundo argumento es (i+1) q se ira incrementando,
            Esto me permite recorrer la posiciones en el substring(i,i+1).
            hce se veria (0,1),(1,2),(2,3)(3,4) etc
             */
            String letra=frase.substring(i, i+1).toLowerCase();

            switch (letra) {
                case "a": //si la letra coencidi con el caso entrara aqui.
                    //concatenara el "@"en la variable cambiar.
                    cambiar= cambiar.concat("@");
                    break;
                case "e":
                    //concatenara el "#"en la variable cambiar.
                    cambiar = cambiar.concat("#");
                    break;
                case "i":
                    cambiar= cambiar.concat("$");
                    break;
                case "o":
                    cambiar= cambiar.concat("%");
                    break;
                case "u":
                    cambiar= cambiar.concat("*");
                    break;
                default:
                    /*
                ********************************************************************
                Entrara aqui cuando ninguno de los caso anteriores se cumplan
                El metodo substring() retorna lo que este guardado en la posicion de
                frase.substring(i,i+1);
                * EJEMPLO:
                si el usuario ingresara x consola "ayer" este valor va ser guardado en la
                variable frase. y frase.substring(i,i+1)va ir recorriendo las posiciones,
                en este caso va entrar 2 veces en defaul:
                El retorno  va ser la "y" , la "r" .

                **********************************************************************
                importante:
                La variable cambiar va ir concatenando los valores que se resiva en
                los case: y cuando no sea vocal entrara a defaul: y se almacenara
                lo que retorne el metodo substring(i,i+1)
                    Importante:
                    * . el punto es para invocar metodo.
                    * para ser invocado se nesita nombreVariable de tipo String
                    * Ejemplo: nombreVariable.substring(beginIndex,endIndez);
                    * beginIndex comienza desde 0, mientras que endIndex comienza desde 1
                    * por eso para rrecorer la posiciones de la frase se necesita (i,i+1)

                     */
                    cambiar= cambiar.concat(frase.substring(i, i+1));
            }
        }
        return cambiar;

    }
}