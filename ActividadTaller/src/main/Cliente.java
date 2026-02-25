import java.util.List;

public class Cliente {
    private String nombre;
    private List<Vehiculo> vehiculos;

    public Cliente(String nombre, List<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.vehiculos = vehiculos;
    }
}
