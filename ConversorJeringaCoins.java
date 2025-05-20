import java.util.Scanner;

public class ConversorJeringaCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        final double TASA_CAMBIO = 55.95; 
        
        do {
            System.out.println("\n--- MENU DE CONVERSION ---");
            System.out.println("1. Convertir Jeringa Coins a pesos");
            System.out.println("2. Convertir pesos a Jeringa Coins");
            System.out.print("Seleccione una opcion (1/2): ");
            
            int opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de Jeringa Coins: ");
                    double jeringaCoins = scanner.nextDouble();
                    double pesos = jeringaCoins * TASA_CAMBIO;
                    System.out.printf("%.2f Jeringa Coins = %.2f pesos%n", jeringaCoins, pesos);
                    break;
                    
                case 2:
                    System.out.print("Ingrese la cantidad de pesos: ");
                    double pesosInput = scanner.nextDouble();
                    double jeringaCoinsResult = pesosInput / TASA_CAMBIO;
                    System.out.printf("%.2f pesos = %.4f Jeringa Coins%n", pesosInput, jeringaCoinsResult);
                    break;
                    
                default:
                    System.out.println("Opcion no valida. Por favor seleccione 1 o 2.");
            }
            
            System.out.print("\n¿Desea realizar otra conversion? (s/n): ");
            respuesta = scanner.next().charAt(0);
            
        } while(respuesta == 's' || respuesta == 'S');
        
        System.out.println("Programa terminado. ¡Hasta luego!");
        scanner.close();
    }
}