import java.util.List;

public class Bestias extends Ejercito {

    int dado;

    public Bestias(String nombre, int puntosVida, int nivelResistencia) {
        super(nombre, puntosVida, nivelResistencia);

    }

    public int getNivelResistencia(){
        return nivelResistencia;
    }

    public int tirarDadosBestias(){
        return dado =(int) (Math.random()*(90+1));
    }

    public int atacarBestias(Heroes heroe) {
        int at = tirarDadosBestias();
        int result = heroe.getPuntosVida() - at;
        String mensaje = "La tirada no ha superado la armadura del heroe, pasa el turno";
        do{
            if (at > heroe.getNivelResistencia()) {
                System.out.println("Turno de las bestias, el resultado del dado es :"+at);
                System.out.println("Datos actualizados de: " + heroe.getNombre() + " (Vida=" + result + " Armadura=" + heroe.getNivelResistencia() + ")");
                return result;
            } else
                System.out.println(mensaje);
            return 0;
        }while(getPuntosVida()!=0);

    }

    public boolean vida( List<Bestias> bestias){
        boolean vidas = getPuntosVida()<=0;
        if(vidas==true);
        System.out.println(getNombre()+" ha sido eliminado");
        return vidas;
    }

    public String toString(){
        return " y "+getNombre()+" (Vida="+getPuntosVida()+" Armadura="+getNivelResistencia()+")";
    }
}
