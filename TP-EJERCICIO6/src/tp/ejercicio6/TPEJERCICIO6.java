package tp.ejercicio6;
import java.util.Scanner;
public class TPEJERCICIO6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cantidad = 3;

       
        String[] empleados = new String[cantidad];

        System.out.println("Registro de empleados");

        for (int i = 0; i < cantidad; i++) {

            System.out.println("Empleado número " + (i + 1));

            System.out.print("Ingrese el nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Ingrese la edad: ");
            int edad = teclado.nextInt();

            System.out.print("Ingrese el sueldo: ");
            double sueldo = teclado.nextDouble();
            teclado.nextLine(); 

            empleados[i] = nombre + " - " + edad + " - " + sueldo;
        }

        System.out.println("Matriz de empleados");
        System.out.println("Nombre - Edad - Sueldo");

        for (int i = 0; i < cantidad; i++) {
            System.out.println(empleados[i]);
        }
    }
}