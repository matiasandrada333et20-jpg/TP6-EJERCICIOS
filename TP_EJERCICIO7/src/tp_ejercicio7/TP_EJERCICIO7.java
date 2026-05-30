package tp_ejercicio7;
import java.util.Scanner;

public class TP_EJERCICIO7 {

 
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Ingreso de dimensiones de la matriz
        System.out.print("Ingrese el número de filas: ");
        int filas = lector.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = lector.nextInt();

        int[][] matriz = new int[filas][columnas];

      
        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = lector.nextInt();
            }
        }

        int suma = 0;
        int contador = 0;

        // Recorre la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

              
                if ((i > 0 || j > 0) && ((i + j) % 2 != 0)) {
                    suma += matriz[i][j];
                    contador++;
                }
            }
        }

        // Calcula el promedio
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No existen elementos en posiciones positivas impares.");
        }
        
    }
}
    
