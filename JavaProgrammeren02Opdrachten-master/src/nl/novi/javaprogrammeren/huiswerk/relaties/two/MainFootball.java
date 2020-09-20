package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainFootball {

    /*
     * Programmeer de volgende relaties:
     * Een competitie kan minimaal 18 en maximaal 18 clubs hebben.
     * Een club kan bij 1 competitie horen en minimaal 18 spelers en maximaal 25 spelers hebben.
     * Een speler kan bij 1 club horen.
     *
     * Extra: Je moet via het speler object kunnen zeggen in welke competitie de speler speelt.
     */

    public MainFootball() {
    }

    public static void main(String[] args) {

        // maak een lijst met spelers
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            Random random = new Random();
            String gender = (random.nextBoolean() == true) ? "man" : "vrouw";
            int age = random.nextInt(9) + 18;
            players.add(new Player("speler-" + (i + 1), age, gender));
        }
        // printPlayers(players);

        // maak een club
        Club ajax = new Club("Ajax");
        System.out.println("--- Voeg een lijst met spelers toe aan club");
        ajax.addPlayers(players);
        System.out.println(ajax.toString());

        System.out.println("--- Voeg één speler toe aan club");
        Player kees = new Player("Kees", 26, "man");
        ajax.addPlayers(kees);
        System.out.println(ajax.toString());

        System.out.println("--- Voeg speler toe die al voor komt is de club.");
        ajax.addPlayers(kees);
        System.out.println(ajax.toString());

        System.out.println("--- Voeg lijst met clubs toe aan competitie");
        List<Club> clubs = new ArrayList<>();
        for (int i = 0; i < 17; i++) {
            Random random = new Random();
            clubs.add(new Club("club-" + (i + 1)));
        }
        clubs.add(ajax);
        Competitie competitie = new Competitie("Eredivisie", clubs);

        System.out.println(competitie.toString());
        System.out.println(kees.getName() + " speelt in de competitie: " + kees.getCompetition().getName());

    }

    public static void printPlayers(List<Player> players) {
        for (Player player : players) {
            System.out.println("Speler naam: " + player.getName());
            System.out.println("Speler leeftijd: " + player.getAge());
            System.out.println("Speler geslagt: " + player.getGender());
            System.out.println("---");
        }
    }
}
