
import java.util.Scanner;

//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner nomb = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String cadena = nomb.nextLine();

        System.out.println("Su nombre es: " + cadena);

    }
}
