package tp6.ejercicio5;
public class TP6EJERCICIO5 {

    public static void main(String[] args) {
 
        String[][] matriz = new String [3][3];
    
    matriz[0][0] = "Uriel";
    matriz[0][1] = "11";
    matriz[0][2] = "willi";
   
    matriz[1][0] = "9";
    matriz[1][1] = "primito";
    matriz[1][2] = "10";
  
    matriz[2][0] = "primo";
    matriz[2][1] = "1";
    matriz[2][2] = "padrino";
    System.out.println("Matriz :");
   
    for(int filas = 0; filas < 3; filas++){
    
    for(int columnas = 0; columnas < 3; columnas++){
  
    System.out.print(" " + matriz[filas][columnas] );    
    }    
   
    System.out.println(" ");
    }    
  }  
}