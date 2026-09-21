
package restaurante;

import java.util.HashMap;


public class Home {
    private Plato plato;
    
    // Colección de platos
    private HashMap<Integer, Plato> carta = new HashMap<>();
    
     public void agregarPlato(Plato plato) {

        try {

            if (plato == null) {
                throw new IllegalArgumentException(
                    "El plato no puede ser nulo"
                );
            }

            if (carta.containsKey(plato.getId())) {
                throw new IllegalArgumentException(
                    "El plato ya existe"
                );
            }

            carta.put(plato.getId(), plato);

            System.out.println("Plato agregado correctamente");

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
    
    
    public void mostrarCarta() {
        
         for (Plato plato : carta.values()) {

            System.out.println(
                plato.getId() + " - " +
                plato.getNombre() + " - S/ " +
                plato.obtenerPrecio()
            );

        }

	}
    public void buscarPlatoPorId(int id) {
 try {

            plato = carta.get(id);

            if (plato == null) {
                throw new IllegalArgumentException(
                    "El plato no existe"
                );
            }

            System.out.println(
                "Plato encontrado: " + plato.getNombre()
            );

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
    
    public void buscarPlatoPorNombre(String nombre){
        
        try {

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new IllegalArgumentException(
                    "El nombre no puede estar vacío"
                );
            }

            for (Plato plato : carta.values()) {

                if (plato.getNombre().equalsIgnoreCase(nombre.trim())) {

                    System.out.println(
                        "Plato encontrado: " + plato.getNombre()
                    );

                    return;
                }
            }

            throw new IllegalArgumentException(
                "El plato no existe"
            );

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
        
}
    

