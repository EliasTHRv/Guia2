
import java.util.Scanner;

/*
 Escribir un programa que lea un número entero por teclado y muestre 
por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
public class Ejercicio5 {
    public static void main(String[] args){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num1 = leer.nextInt();
        
        System.out.println(num1 *2);
        System.out.println(num1 *3);
        System.out.println(Math.sqrt(num1));
        
        
    }
}
