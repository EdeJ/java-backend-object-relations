package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import java.util.Random;

public class Bird {
    private String nickname;
    private String species;
    private String ringNumber;
    boolean female;

    public Bird(String nickname, String species, String ringNumber) {
        this.nickname = nickname;
        this.species = species;
        this.ringNumber = ringNumber;
        Random random = new Random();
        this.female = random.nextBoolean();
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getSpecies() {
        return species;
    }

    public String getRingNumber() {
        return ringNumber;
    }

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }
}
