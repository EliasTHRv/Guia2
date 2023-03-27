
import java.util.Scanner;

//Escribir un programa que pida dos números enteros 
//por teclado y calcule la suma de los dos. 
//El programa deberá después mostrar el resultado de la suma
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        var numero1 = num.nextInt();
        System.out.println("Ingrese otro numero: ");
        var numero2 = num.nextInt();

        System.out.println("La suma de los dos numeros es: " + (numero1 + numero2));

    }

}
