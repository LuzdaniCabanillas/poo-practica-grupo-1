package sistema;

import java.util.Scanner;

public class SistemaEstudiante {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GestorEstudiantes gestorEst = new GestorEstudiantes();

        // DATOS DE PRUEBA
        Estudiante estudiante1 = new Estudiante(
                "N12345678",
                "Juan Pérez",
                "juan@gmail.com",
                "Programación",
                "Ingeniería de Sistemas"
        );

        Estudiante estudiante2 = new Estudiante(
                "N87654321",
                "María López",
                "maria@gmail.com",
                "Programación",
                "Ingeniería de Sistemas"
        );

        gestorEst.registrar(estudiante1);
        gestorEst.registrar(estudiante2);

        gestorEst.registrarCalificacion("N12345678", 15);
        gestorEst.registrarCalificacion("N12345678", 18);
        gestorEst.registrarCalificacion("N12345678", 17);

        gestorEst.registrarCalificacion("N87654321", 19);
        gestorEst.registrarCalificacion("N87654321", 16);
        gestorEst.registrarCalificacion("N87654321", 18);

        //MENU
        int opcion;

        do {

            System.out.println("\n==============================");
            System.out.println("   SISTEMA DE ESTUDIANTES");
            System.out.println("==============================");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar estudiante por código");
            System.out.println("4. Registrar calificación");
            System.out.println("5. Salir");
            System.out.println("==============================");
            System.out.print("Seleccione una opción: ");

            try {

                opcion = Integer.parseInt(teclado.nextLine());

                switch (opcion) {

                    case 1:
                        registrarEstudiante(teclado, gestorEst);
                        break;

                    case 2:
                        System.out.println("\n=== LISTA DE ESTUDIANTES ===");
                        gestorEst.listar();
                        break;

                    case 3:
                        buscarEstudiante(teclado, gestorEst);
                        break;

                    case 4:
                        registrarCalificacion(teclado, gestorEst);
                        break;

                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción no válida.");

                }

            } catch (NumberFormatException e) {

                System.out.println("Error: debe ingresar un número.");

                opcion = 0;
            }

        } while (opcion != 5);

        teclado.close();
    } 
}
