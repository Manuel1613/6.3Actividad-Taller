public class Mecanico implements Especialista {
    private String nombre;

    public Mecanico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reparar(Reparacion reparacion) {
    }
}
