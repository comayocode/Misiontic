public class Facultad {
    // --- ATRIBUTOS ---
    private String codigo;
    private String nombre;

    // --- CONSTRUCTORES ---

    public Facultad(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // --- CONSULTORES ---
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }

    // --- MODIFICADORES ---
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
