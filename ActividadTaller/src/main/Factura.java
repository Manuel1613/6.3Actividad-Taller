import java.util.Date;
import java.util.List;

public class Factura {
    private int numero;
    private Date fecha;
    private double total;
    private List<Reparacion> reparaciones;

    public Factura(int numero, Date fecha, double total, List<Reparacion> reparaciones) {
        this.numero = numero;
        this.fecha = fecha;
        this.total = total;
        this.reparaciones = reparaciones;
    }

    public double calcularTotal() {
        return 0;
    }
}
