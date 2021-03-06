package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class MainCar {
    /*
    Maak de volgende drie klassen:
    CarOwner, Car, CarDealer.

    Verzin zelf wat simpele instance variables bij CarOwner en CarDealer.
    Car heeft: kenteken, merk, subtype, aantalKmGereden

    Een CarOwner kan 0 of meerdere auto's hebben.
    Een CarDealer kan 0 of meerdere auto's hebben.
    Een Car kan 0 of 1 owner hebben (alleen CarOwner-klasse). Wanneer de auto bij de dealer staat is de carowner
    leeg (null).

    Voeg aan de CarDealer een methode toe die een auto vanuit zijn garage kan overschrijven naar de CarOwner. Zowel
    de list van CarOwner moet dan uitgebreid worden als de eigenaar van de Car moet aangepast worden. We hebben het hier
    dus over een bidirectionele relatie!

    Zorg ervoor dat alleen unieke auto's op basis van een kenteken aan de List van CarDealer en CarOwner toegevoegd
    kunnen worden.

    Extra: Voeg een variabele leeftijd toe aan CarOwner. Check daarna altijd of de CarOwner wel 18 of ouder is.

     */
    public static void main(String[] args) {

        Car lada = new Car("45-OP-34", "lada", "station", 650);
        Car peugeot = new Car("78-AB-01", "peugeot", "family", 101045);
        Car mercedes = new Car("87-KI-89", "merceds", "sport", 256487);

        CarDealer dealerVanBeek = new CarDealer("van Beek");
        dealerVanBeek.addCar(lada);
        dealerVanBeek.addCar(peugeot);
        dealerVanBeek.addCar(peugeot);
        dealerVanBeek.addCar(mercedes);

        dealerVanBeek.printCars();

        CarOwner bob = new CarOwner("Bob");
        dealerVanBeek.transferCar(peugeot, bob);

        bob.printCars();
        System.out.println(peugeot.getCarOwner());

    }
}
