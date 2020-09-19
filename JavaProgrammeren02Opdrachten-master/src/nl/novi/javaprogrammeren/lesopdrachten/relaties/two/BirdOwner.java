package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BirdOwner {
    private String name;
    private String sex;
    private List<Bird> birds;

    public BirdOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
        this.birds = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<Bird> getBirds() {
        return birds;
    }

    public void addBirds(Bird newBird) {
        if (!isBirdInList(newBird)) {
            this.birds.add(newBird);
            System.out.println(newBird.getNickname() + " is toegevoegd aan de lijst, " + name + " heeft nu in totaal " + birds.size() + " vogels.");
            if (this.birds.size() < 20) {
                System.out.println(name + " moet minimaal 20 vogels hebben, voeg meer vogels toe!");
            }
        } else {
            System.out.println(this.name + " had al een vogel met ringnummer " + newBird.getRingNumber() + ", deze vogel is niet toegevoegd!");
        }
    }

    public boolean isBirdInList(Bird newBird) {
        for (Bird bird : this.birds) {
            if (bird.getRingNumber().equalsIgnoreCase(newBird.getRingNumber())) {
                return true;
            }
        }
        return false;
    }

    public List<Bird> getBirdSelection(int count) {
        List<Bird> selectedBirds = new ArrayList<>();
        selectedBirds.addAll( selectRandomBirds(count / 2, birdsBySex(true)));
        selectedBirds.addAll( selectRandomBirds(count / 2, birdsBySex(false)));
        return selectedBirds;
    }

    private List<Bird> selectRandomBirds(int count, List<Bird> birds) {
        List<Bird> selectedBirds = new ArrayList<>();

        while (selectedBirds.size() < count) {
            Random random = new Random();
            int index = random.nextInt(birds.size());
            selectedBirds.add(birds.get(index));
            birds.remove(index);
        }
        return selectedBirds;
    }


    private List<Bird> birdsBySex(boolean sex) {
        List<Bird> selectedBirds = new ArrayList<>();
        for (Bird bird : this.birds) {
            if (bird.isFemale() == sex) {
                selectedBirds.add(bird);
            }
        }
        return selectedBirds;
    }


    @Override
    public String toString() {
        String message = this.name + " bezit de volgende vogels: \n";
        message += printBirds(this.birds);
        return message;
    }

    public String printBirds(List<Bird> birds) {
        String message = "";
        for (Bird bird : birds) {
            message += "Naam - " + bird.getNickname() + "\n";
            message += "Vogelsoort - " + bird.getSpecies() + "\n";
            String geslacht = bird.isFemale() ? "vrouwtje" : "mannetje";
            message += "Geslacht - " + geslacht + "\n";
            message += "Ringnummer " + bird.getRingNumber() + "\n\n";
        }
        return message;
    }
}
