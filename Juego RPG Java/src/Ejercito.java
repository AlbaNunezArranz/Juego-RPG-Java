public class Ejercito {
    String nombre;
    int puntosVida;
    int nivelResistencia;


    public Ejercito(String nombre, int puntosVida, int nivelResistencia) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivelResistencia = nivelResistencia;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(int nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }
}
