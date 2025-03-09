

/**
 *
 * @author Abner
 */
public class Reservacion {
    private String nombre; 
    private int noAsiento;

    public Reservacion(String nombre, int noAsiento) {
        this.nombre = nombre;
        this.noAsiento = noAsiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNoAsiento() {
        return noAsiento;
    }

    @Override
    public String toString() {
        return "Reservacion{" + "nombre=" + nombre + ", noAsiento=" + noAsiento + '}';
    }   
    
}
