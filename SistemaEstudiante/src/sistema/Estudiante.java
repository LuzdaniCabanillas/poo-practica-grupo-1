
package sistema;

import java.util.ArrayList;

public class Estudiante {
    private String codigo;
    private String nombre;
    private String correo;
    private String curso;
    private String carrera;
    private ArrayList<Double> calificaciones;

    public Estudiante(String codigo, String nombre, String correo, String curso, String carrera) {
        
        if(!codigo.matches("N[0-9]{8}")){
         throw new IllegalArgumentException(
                    "El código debe iniciar con N y tener 8 números" 
         );
        }
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.curso = curso;
        this.carrera = carrera;
        this.calificaciones = new ArrayList<>();
    }

    
    
}
