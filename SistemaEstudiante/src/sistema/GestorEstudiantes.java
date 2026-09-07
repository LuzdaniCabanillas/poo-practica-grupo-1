package sistema;

import java.util.ArrayList;

public class GestorEstudiantes {

    private ArrayList<Estudiante> estudiantes;

    public GestorEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    public void registrar(Estudiante estudiante) {
        for (Estudiante e : estudiantes) {
            if (e.getCodigo().equals(estudiante.getCodigo())) {
                throw new IllegalArgumentException(
                        "Estudiante ya existe");
            }

        }
        estudiantes.add(estudiante);
    }

    

}
