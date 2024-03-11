public class Trasgo extends Bestias {
    Heroes heroe;

    public Trasgo(String nombre, int puntosVida, int nivelResistencia) {
        super(nombre, puntosVida, nivelResistencia);
    }

    public int ataque() {
        return this.atacarBestias(this.heroe);
    }
}
