package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.List;

public class Competitie {
    private String name;
    List<Club> clubs;

    public Competitie(String name, List<Club> clubs) {
        this.name = name;
        addClubs(clubs);
    }

    public String getName() {
        return name;
    }

    public void addClubs(List<Club> newClubs) {
        if (newClubs.size() < 18) {
            System.out.println("Er moeten minimaal 18 clubs worden toegevoegd");
        } else if (newClubs.size() > 18) {
            System.out.println("Er kunnen maximaal 18 clubs worden toegevoegd");
        } else {
            System.out.println("clubs toegevoegd aan " + this.name);
            for (Club newClub : newClubs) {
                newClub.setCompetitie(this);
            }
            this.clubs = newClubs;
        }
    }

    private boolean clubExist(Club newClub) {
        for (Club club : this.clubs) {
            if (club.getName().equalsIgnoreCase(club.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String output = "";
        output += this.name + " heeft de volgende clubs: \n";
        for (Club club : this.clubs) {
           output += "naam: " + club.getName() + "\n";
           output +=  club.toString();
        }
        return output;
    }
}
