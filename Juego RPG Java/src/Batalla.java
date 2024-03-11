import java.util.List;

public class Batalla {

    private static Heroes[] ejHero;
    private static Bestias[] ejeBestia;

    public Batalla() {
        ejHero = new Heroes[5];
        ejeBestia = new Bestias[4];
    }

    public static void batalla(List<Heroes> heroes, List<Bestias> bestias) {

        Heroes[] he = new Heroes[heroes.size()];
        he = heroes.toArray(he);

        Bestias[] be = new Bestias[bestias.size()];
        be = bestias.toArray(be);

        Ejercito[] conca = new Ejercito[he.length + be.length];

        int indiceHeroe = 0;
        int indiceBestia = 0;


        for(int i=0;i<heroes.size();i++){
            heroes.get(i).atacar(bestias.get(i));
        }

    }

}
