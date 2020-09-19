package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import java.util.ArrayList;
import java.util.List;

public class MainBird {

    /*
    Geef de klasse Bird de volgende instance variables: nickname, species, ringNumber
    De species en ringNumber variables mogen na instantiatie niet meer aangepast worden.

    Geef de klasse BirdOwner de volgende instance variables: name, sex.
    Er zijn geen restricties op getters en setters.

    Programmeer de volgende relatie.
    Een BirdOwner kan een oneindig aantal vogels hebben. Elke vogel mag echter maar 1 keer in de lijst voorkomen.
    Er mag geen List via de constructor gevuld worden. Dit moet via een methode.

    Maak een toString()-methode die het volgende afdrukt: Naam van eigenaar en van elke vogel de nickname en
    serienummer.

    Uitdagend:
    1. Zorg ervoor dat de BirdOwner minimaal 20 Bird-objecten heeft.
    2. De BirdOwner mag van de gemeente nog maar 10 Vogels houden. Hij wil random 5 vrouwtjes en vijf mannetjes kiezen.
    Schrijf een methode die dit doet en de vijf random gekozen mannetjes en de vijf random gekozen vrouwtjes uitprint.

     */

    public static void main(String[] args) {

        System.out.println("* create bird1");
        Bird bird1 = new Bird("twitter", "owl", "135648");

        System.out.println("\n * create bird owner");
        BirdOwner bob = new BirdOwner("Bob", "male");

        System.out.println("\n * add bird to owner");
        bob.addBirds(bird1);


        System.out.println("\n * add new bird");
        bob.addBirds(new Bird("Sunny", "Hummingbird", "659347"));

        System.out.println("\n * print data of owner and his birds");
        System.out.println(bob.toString());

        System.out.println("\n * try to add bird with same name");
        bob.addBirds(new Bird("Angel", "Woodpecker", "659347"));

        System.out.println("\n * add 20 birds ");
        for (int i = 0; i < 30; i++) {
            String birdName = "bird" + (i + 1);
            String ringNumber = "14527" + i;
            bob.addBirds(new Bird(birdName, "rare specie", ringNumber));
        }

        System.out.println("\n * print data of owner and his birds");
        System.out.println(bob.toString());

        System.out.println("\n * select 10 random birds");
        List<Bird> selectedBirds = new ArrayList<>();

        // get random 5 female and 5 male birds
        selectedBirds = bob.getBirdSelection(10);
        System.out.println(bob.printBirds(selectedBirds));

    }


}
