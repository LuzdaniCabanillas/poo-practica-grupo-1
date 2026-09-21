
package semana4minireto3;


public class Main {
    
     public static void main(String[] args) {

        Empleado empleado1 =
                new TiempoCompleto("Sergio", "12345678", 3500);

        Empleado empleado2 =
                new Freelance("Juan", "87654321", 50, 40);

        System.out.println("Pago Tiempo Completo: S/ "
                + empleado1.calcularPago());

        System.out.println("Pago Freelance: S/ "
                + empleado2.calcularPago());
    }
    
}
