package tp6.ejercicio3;
import java.util.Scanner;
public class TP6EJERCICIO3 {

        public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        // Crear la matriz
        int[][] matriz = new int[filas][columnas];

        // Ingresar elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Imprimir la matriz
        System.out.println("\nMatriz ingresada:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

       
    }
}
    }
    
}
