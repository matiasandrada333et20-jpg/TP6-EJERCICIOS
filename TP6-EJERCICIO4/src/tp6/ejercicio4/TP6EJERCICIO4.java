  package tp6.ejercicio4;
  public class TP6EJERCICIO4 {
  public static void main(String[] args) {
       
        String[][] matrizNombres = new String[3][3];
        int[][] matrizNumeros = new int[3][3];

        // LLenamos las matrices alternando las posiciones
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizNombres[i][j] = ""; 
            }
        }
        
        matrizNombres[0][0] = "Ana";
        matrizNumeros[0][1] = 25;
        matrizNombres[0][2] = "Pedro";

       
        matrizNumeros[1][0] = 30;
        matrizNombres[1][1] = "María";
        matrizNumeros[1][2] = 45;

        
        matrizNombres[2][0] = "Luis";
        matrizNumeros[2][1] = 18;
        matrizNombres[2][2] = "Sofía";

     
        System.out.println("Nombres y números");
   

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                

                if (matrizNombres[i][j] != " ") {
                    System.out.println(matrizNombres[i][j]);
                }
                
                if (matrizNumeros[i][j] != 0) {
                    System.out.println("  " + matrizNumeros[i][j]);
                }
                
            }
        }
    }
}