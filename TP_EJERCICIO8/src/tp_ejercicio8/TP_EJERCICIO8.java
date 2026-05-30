package tp_ejercicio8;
import java.util.Scanner;

public class TP_EJERCICIO8 {

  
    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();

        // Separa la frase en palabras
        String[] palabras = frase.split(" ");

        System.out.println("Palabra    Cantidad de letras");
       

        for (String palabra : palabras) {
            System.out.println(palabra + "    " + palabra.length());
        }

       
    }
}