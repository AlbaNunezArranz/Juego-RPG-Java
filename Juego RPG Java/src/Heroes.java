import java.util.List;

public class Heroes extends Ejercito {
    int dado1;
    int dado2;

    public Heroes(String nombre, int puntosVida, int nivelResistencia) {
        super(nombre, puntosVida, nivelResistencia);

    }

    public int mayorResultado(){
        dado1=(int) (Math.random()*(100+1));
        dado2=(int) (Math.random()*(100+1));
        System.out.println("primer dado: "+dado1);
        System.out.println("segundo dado: "+dado2);

        if(dado1 <dado2){
            return dado2;
        }else
            return dado1;
    }
    public int atacar(Bestias bestias) {
        int ataque = mayorResultado();
        int resultado = bestias.getPuntosVida() - ataque;
        boolean vid = getPuntosVida() >= 1;
        String men = "Las tiradas no superan la armadura de la bestia, pasa el turno";
        do {

            if (ataque > bestias.getNivelResistencia()) {
                System.out.println(bestias.getPuntosVida() + " - " + ataque + " = " + resultado + "\n");
                System.out.println("Datos actualizados de " + bestias.getNombre() + " (Vida=" + resultado + " Armadura=" + bestias.getNivelResistencia() + ")");
                return resultado;
            } else
                System.out.println(men);
            return 0;
        }while (bestias.getPuntosVida() != 0);

    }


    public boolean vida( List<Heroes> heroes){
        boolean vidas = getPuntosVida()<=0;
        if(vidas==false);
        System.out.println(getNombre()+" ha sido eliminado");
        return vidas;
    }

    public String toString(){
        return "Lucha entre "+getNombre()+" (Vida="+getPuntosVida()+" Armadura="+getNivelResistencia()+")";
    }

}