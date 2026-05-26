package tp6.ejercicio1;
public class TP6EJERCICIO1 {
    
    public static void main(String[] args) {
          int [][] Matriz = new int [2][2];
        //Fila 0
        Matriz[0][0] = 4;
        Matriz[0][1] = 5;
        //Fila 1
        Matriz[1][0] = 3;
        Matriz[1][1] = 2;      
        
        for(int filas = 0; filas < 2; filas++ ){
           
            for(int columnas = 0; columnas < 2; columnas++){
               
            //System.out.println("Fila = " + filas);
            //System.out.println("Columna = " + columnas);
            System.out.print(" " + Matriz[filas][columnas]);
        }
            System.out.println(" ");
      }
   }
}