import java.util.List;

/**
 * The type Dj.
 */
public class Dj {

    private String nombre;
    private int edad;
    private double altura;
    private List<String> eventos;

    /**
     * Instantiates a new Dj.
     */
    public Dj(){

    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets eventos.
     *
     * @return the eventos
     */
    public List<String> getEventos() {
        return eventos;
    }

    /**
     * Sets eventos.
     *
     * @param eventos the eventos
     */
    public void setEventos(List<String> eventos) {
        this.eventos = eventos;
    }

    /**
     * Gets altura.
     *
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Sets altura.
     *
     * @param altura the altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Gets edad.
     *
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Sets edad.
     *
     * @param edad the edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Dj{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", eventos=" + eventos +
                '}';
    }

}
