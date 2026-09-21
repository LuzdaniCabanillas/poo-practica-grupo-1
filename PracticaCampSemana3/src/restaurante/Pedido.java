package restaurante;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {

	private int id;

	private LocalDateTime fechaHora;

	private EstadoPedido estado;

	private double subTotal;

	private Mesa mesa;

	private Cuenta cuenta;



	// Colección de detalles del pedido
    private ArrayList<DetallePedido> detallePedido = new ArrayList<>();

    // Agregar un plato al pedido
    public void agregarPlato(DetallePedido detalle) {

        try {

            if (detalle == null) {
                throw new IllegalArgumentException(
                    "El detalle no puede ser nulo"
                );
            }

            detallePedido.add(detalle);

            System.out.println("Plato agregado correctamente");

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }

    // Calcular subtotal
    public double calcularSubTotal() {

        subTotal = 0;

        for (DetallePedido detalle : detallePedido) {

            subTotal += detalle.getSubTotal();

        }

        return subTotal;
    }

    public void enviarACocina() {

    }

    public void entregarPedido() {

    }

    public void cerrarPedido() {

    }


}
