package nl.novi.javaprogrammeren.huiswerk.relaties.two;

public class Player {
    private String name;
    private int age;
    private String gender;

    private Club club;

    public Player(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }
    public Competitie getCompetition() {
        return this.club.getCompetitie();
    }

    @Override
    public String toString() {
        String output = "";
        output += "naam: " + this.name + "\n";
        output += "leeftijd: " + this.age + "\n";
        output += "geslagt: " + this.gender + "\n";
        output += "club: " + this.club.getName() + "\n";
        output += "---\n";
        return output;
    }
}
