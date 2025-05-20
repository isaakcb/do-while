
import java.util.Scanner;

public class oso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        char respuesta;
        
        do {
            System.out.println("Contador: " + contador);
            System.out.print("¿Desea continuar? (s/n): ");
            respuesta = scanner.next().charAt(0);
            
            contador++;
        } while (respuesta == 's' || respuesta == 'S');
        
        System.out.println("Programa terminado.");
        scanner.close();
    }
}