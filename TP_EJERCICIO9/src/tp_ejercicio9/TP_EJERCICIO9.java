package tp_ejercicio9;
import java.util.Scanner;

public class TP_EJERCICIO9 {

 
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas: ");
        int filas = lector.nextInt();

        int[][] matriz = new int[filas][3];

      
        for (int i = 0; i < filas; i++) {
            System.out.println("Ingrese el número de la columna 1 de la fila " + (i + 1) + ": ");
            matriz[i][0] = lector.nextInt();

            System.out.println("Ingrese el número de la columna 2 de la fila " + (i + 1) + ": ");
            matriz[i][1] = lector.nextInt();

          
            matriz[i][2] = matriz[i][0] + matriz[i][1];
        }

        // Muestra la matriz
       System.out.println("Columna1    Columna2    Suma");

        for (int i = 0; i < filas; i++) {
         System.out.print(matriz[i][0]);
         System.out.print(" ");
         System.out.print(matriz[i][1]);
         System.out.print(" ");
         System.out.println(matriz[i][2]);
        }

    }
}