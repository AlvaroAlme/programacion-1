import java.util.Scanner;

/**
 * @author Álvaro Almécija
 * Clase Principal que presenta el menú del programa por consola y gestiona un concesionario
 * @see Concesionario
 */
public class Principal {

    private Concesionario concesionario;
    
    /**
     * Método que muestra al usuario el menú por pantalla y ejecuta la opción elegida por el usuario.
     */
    public void menu() {

        Scanner scanner = new Scanner(System.in); 

        System.out.println("1. Nuevo Vehiculo");
        System.out.println("2. Listar Vehiculo");
        System.out.println("3. Buscar Vehiculo");
        System.out.println("4. Modificar Kms Vehiculo");
        System.out.println("5. Salir");
 
        int opcion = scanner.nextInt();

        switch(opcion){
            case 1 -> {

            }
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 -> {
                System.out.println("Saliendo de la aplicación...");
                scanner.close();
                return;
            }
            default -> {
                System.out.println("Opción incorrecta, por favor, selecciona una de las opciones disponibles.");
            }
        }

    }

    
}
