package semana4minireto3;

public class TiempoCompleto extends Empleado {

    private double salarioMensual;

    public TiempoCompleto(String nombre, String dni, double salarioMensual) {
        super(nombre, dni);
        this.salarioMensual = salarioMensual;
    }      
        
    @Override
    public double calcularPago() {
        return salarioMensual;
    }

}
