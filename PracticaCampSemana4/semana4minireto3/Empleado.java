package semana4minireto3;
public abstract class Empleado {
    
    protected String nombre;
    protected String dni;

    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    

    public double calcularPago() {
        
        return 0.0;

	}

}
