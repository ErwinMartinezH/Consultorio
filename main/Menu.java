import java.util.Scanner;
import Funciones.*;


public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("Bienvenido al sistema de gestión escolar");
            System.out.println("1. Alta especialidad");
            System.out.println("2. Alta estudiante");
            System.out.println("3. Alta catedrático");
            System.out.println("4. Alta materia");
            System.out.println("5. Alta grupo");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    altaEspecialidad();
                    break;
                case 2:
                    altaEstudiante();
                    break;
                case 3:
                    altaCatedratico();
                    break;
                case 4:
                    altaMateria();
                    break;
                case 5:
                    altaGrupo();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (option != 0);
    }

    private static void altaEspecialidad() {
        // Función para dar de alta una especialidad
    }

    private static void altaEstudiante() {
        // Función para dar de alta un estudiante
    }

    private static void altaCatedratico() {
        // Función para dar de alta un catedrático
    }

    private static void altaMateria() {
        // Función para dar de alta una materia
    }

    private static void altaGrupo() {
        // Función para dar de alta un grupo
    }
}
