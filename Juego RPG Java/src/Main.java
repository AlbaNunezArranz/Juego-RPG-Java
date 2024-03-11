import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String args[]){
        List<Heroes> ejerHero = new ArrayList<>();
        List<Bestias> ejerBestias = new ArrayList<>();

        ejerHero.add(new Elfos("Legolas", 150, 30));
        ejerHero.add(new Humanos("Aragorn", 150, 50));
        ejerHero.add(new Humanos("Boromir",100, 60));
        ejerHero.add(new Humanos("Gandalf",300, 10));
        ejerHero.add(new Hobbits("Frodo", 90, 30));

        ejerBestias.add(new Orcos("Lurtz", 200, 60));
        ejerBestias.add(new Orcos("Shagrat", 220, 50));
        ejerBestias.add(new Trasgo("Uglúk", 120, 30));
        ejerBestias.add(new Trasgo("Mauhúr", 100, 30));
        ejerBestias.add(new Trasgo("Zugzug", 80, 20));



        Batalla.batalla(ejerHero, ejerBestias);


    }
}