public class Elfos extends Heroes {
    Orcos orco;
    Bestias bestia;


    public Elfos(String nombre, int puntosVida, int nivelResistencia) {
        super(nombre, puntosVida, nivelResistencia);
    }

    public void atacarElfo(){
        int ataElfo = mayorResultado();
        int incremento = 10;
        do{
            int suma = ataElfo+incremento;

        }while(atacar(orco)==1);
    }
}
