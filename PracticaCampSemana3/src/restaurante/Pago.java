package restaurante;

import java.time.LocalDateTime;

public class Pago {

	private int id;

	private LocalDateTime fechaHora;

	private MetodoPago metodoPago;

	private double monto;

	private Cajero cajero;
        
            // Constructor
    public Pago(int id, MetodoPago metodoPago, double monto) {

        this.id = id;
        this.metodoPago = metodoPago;
        this.monto = monto;
        this.fechaHora = LocalDateTime.now();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }
    
    

	public void registrarPago() {

	}

	public boolean validarMetodo() {
		return false;
	}

}
