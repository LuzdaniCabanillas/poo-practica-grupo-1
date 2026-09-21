package semana4minireto3;
public class Freelance extends Empleado {

    private double tarifa;

    private int horasTrabajadas;
        
    public Freelance(String nombre, String dni,
                     double tarifaHora, int horasTrabajadas) {
        super(nombre, dni);
        this.tarifa = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularPago() {
        return tarifa * horasTrabajadas;
    }        

}
