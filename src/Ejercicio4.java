
import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar su 
equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

public class Ejercicio4 {
    public static void main(String[] args){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados centigrados C°");
        int grados = leer.nextInt();
        System.out.println("F: " + (32 + (9 * grados / 5 )));
        
    }
    
}
