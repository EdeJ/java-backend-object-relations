package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private String name;

    private Competitie competitie;
    List<Player> players;

    public Club(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public Competitie getCompetitie() {
        return competitie;
    }

    public void setCompetitie(Competitie competitie) {
        this.competitie = competitie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayers(Player newPlayer) {
        if (!playerExist(newPlayer)) {
            if(this.players.size() +1 <= 25) {
                newPlayer.setClub(this);
                this.players.add(newPlayer);
                System.out.println(newPlayer.getName() + " toegevoegd aan " + this.name);
            } else {
                System.out.println("Maximaal aantal spelers is 25, speler is niet toegevoegd!");
            }
        } else {
            System.out.println("Speler komt al voor in de lijst, " + newPlayer.getName() + " niet toegevoegd!");
        }
    }

    public void addPlayers(List<Player> newPlayers) {
        if(newPlayers.size() < 18 || newPlayers.size() > 25) {
            System.out.println(this.name + " moet minimaal 18 spelers en maximaal 25 spelers hebben, spelers niet toegevoegd!");
        } else {
            for (Player newPlayer : newPlayers) {
                addPlayers(newPlayer);
            }
        }
    }

    private boolean playerExist(Player newPlayer) {
        for (Player player : this.players) {
            if (player.getName().equalsIgnoreCase(newPlayer.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String output = "";
        output += this.name + " heeft de volgende spelers: \n";
        for (Player player : this.players) {
            output += player.toString();
        }
        if(this.competitie != null) {
            output += this.name + " speelt in: " + this.competitie.getName()+ "\n";
        }
        return output;
    }
}
