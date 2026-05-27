package tp.ejercicio6;
import java.util.Scanner;
public class TPEJERCICIO6 {
    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

       
        int cantidad = 3;
        // Creamos matrices separadas
        String[] nombres = new String[cantidad];
        int[] edades = new int[cantidad];
        double[] sueldos = new double[cantidad];

       
        System.out.println("Registro de empleados");
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n Empleado número " + (i + 1) + ":");
            
            System.out.print("Ingrese el nombre: ");
            nombres[i] = teclado.nextLine();
            
            System.out.print("Ingrese la edad: ");
            edades[i] = teclado.nextInt();
            
            System.out.print("Ingrese el sueldo: ");
            sueldos[i] = teclado.nextDouble();
        }

        System.out.println("\n matriz de empleados");
        System.out.println("Nombre,Edad y Sueldo");
 

        for (int i = 0; i < cantidad; i++) {
            System.out.println(nombres[i] + " " + edades[i] + " " + sueldos[i]);
        }
     
    }
}
