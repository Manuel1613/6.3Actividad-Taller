import java.util.List;

public abstract class Vehiculo {
    private String matricula;
    private String modelo;
    private List<Reparacion> reparaciones;

    public Vehiculo(String matricula, String modelo, List<Reparacion> reparaciones) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.reparaciones = reparaciones;
    }
}
