package Models;

public class Pasajero {
    private String clase;
    private String apellido;
    private String nombre;
    private int edad;
    private String lugarEmbarque;
    private String vivo;

    public Pasajero(String clase, String apellido, String nombre, int edad, String lugarEmbarque, String vivo) {
        this.clase = clase;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.lugarEmbarque = lugarEmbarque;
        this.vivo = vivo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugarEmbarque() {
        return lugarEmbarque;
    }

    public void setLugarEmbarque(String lugarEmbarque) {
        this.lugarEmbarque = lugarEmbarque;
    }

    public String getVivo() {
        return vivo;
    }

    public void setVivo(String vivo) {
        this.vivo = vivo;
    }
}
