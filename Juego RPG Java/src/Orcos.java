public class Orcos extends Bestias {
    Heroes heroe;

    public Orcos(String nombre, int puntosVida, int nivelResistencia) {
        super(nombre, puntosVida, nivelResistencia);
    }

    public int ataque() {
        return this.atacarBestias(this.heroe) + this.heroe.nivelResistencia * 0;
    }
}
