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

    }
    
}
