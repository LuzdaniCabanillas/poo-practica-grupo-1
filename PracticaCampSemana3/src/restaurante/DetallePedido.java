package restaurante;
public class DetallePedido {

	private int id;

	private int cantidad;

	private double precioUnitario;

	private double subTotal;

	private Plato plato;

        
    public DetallePedido(int id, int cantidad, double precioUnitario) {

        this.id = id;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;

        calcularSubTotal();
    }

    public void calcularSubTotal() {
        subTotal = cantidad * precioUnitario;
    }

    public double getSubTotal() {
        return subTotal;
    }

}
