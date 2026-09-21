package restaurante;
import java.util.ArrayList;
import java.util.Date;

public class Cuenta {

	private int id;

	private Date fechaGeneracion;

	private double subTotal;

	private double IGV;

	private double total;

	private EstadoCuenta estado;

	private Pago pago;
        
         // Colección de pagos
       private ArrayList<Pago> pagos = new ArrayList<>();

	public void generarCuenta() {

	}

	public double calcularIGV() {
		return 0;
	}

	public double calcularTotal() {
		return 0;
	}

	public void registrarPago() {
            
             try {

            if (pago == null) {
                throw new IllegalArgumentException(
                    "El pago no puede ser nulo"
                );
            }

            if (pago.getMonto() <= 0) {
                throw new IllegalArgumentException(
                    "El monto debe ser mayor a cero"
                );
            }

            pagos.add(pago);

            this.pago = pago;

            System.out.println("Pago registrado correctamente");

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }

	}
        
            // Mostrar pagos registrados
        public void mostrarPagos() {

        for (Pago pago : pagos) {

            System.out.println(
                "Pago: S/ " + pago.getMonto()
            );

        }
        }

	public void cambiarEstado() {

	}

	public void cerrarCuenta() {

	}

}
