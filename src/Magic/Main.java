package Magic;

public class Main {
    public static void main(String[] args) {
        Card basilicaBellHaunt = new Card();
        Card narsetParterOfVeils = new Card();
        Card castDown = new Card();

        basilicaBellHaunt.setName("Basilica Bell-Haunt");
        narsetParterOfVeils.setName("Narset, Parter of Veils");
        castDown.setName("Cast Down");
        basilicaBellHaunt.setColour("black and white");
        narsetParterOfVeils.setColour("blue");
        castDown.setColour("black");
        basilicaBellHaunt.setType("creature");
        narsetParterOfVeils.setType("planeswalker");
        castDown.setType("instant");
        basilicaBellHaunt.setManaCost(4);
        narsetParterOfVeils.setManaCost(3);
        castDown.setManaCost(2);
        basilicaBellHaunt.setAmount(3);
        narsetParterOfVeils.setAmount(3);
        castDown.setAmount(1);

        System.out.println("The card " + basilicaBellHaunt.getName() + " is a " + basilicaBellHaunt.getColour() + " " +
                basilicaBellHaunt.getType() + " type with the converted mana cost of " + basilicaBellHaunt.getManaCost()
                + ". This deck has " + basilicaBellHaunt.getAmount() + " copies.");

        System.out.println("The card " + narsetParterOfVeils.getName() + " is a " + narsetParterOfVeils.getColour() + " " +
                narsetParterOfVeils.getType() + " type with the converted mana cost of " + narsetParterOfVeils.getManaCost()
                + ". This deck has " + narsetParterOfVeils.getAmount() + " copies.");

        System.out.println("The card " + castDown.getName() + " is a " + castDown.getColour() + " " +
                castDown.getType() + " type with the converted mana cost of " + castDown.getManaCost()
                + ". This deck has " + castDown.getAmount() + " copies.");

    }
}
