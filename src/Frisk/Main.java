package Frisk;

public class Main {
    public static void main(String[] args) {

        Verden world1 = new Verden();
        System.out.println("Meningen med verden er " + world1.meningenMedVerden);

        Verden world2 = new Verden();
        world2.meningenMedVerden = 32;
        System.out.println("Meningen med verden er " + world2.meningenMedVerden);

        FacebookBesked besked1 = new FacebookBesked();
        besked1.tekst = "Se din mad!";
        System.out.println(besked1.tekst);
    }
}
