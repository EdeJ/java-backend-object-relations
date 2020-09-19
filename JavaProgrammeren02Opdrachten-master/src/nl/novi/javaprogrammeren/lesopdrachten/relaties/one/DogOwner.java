package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwner {

    private String name;
    private String sex;

    private Dog dog;

    public DogOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
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

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void updateDogName(String dogName) {
        if (dog != null) {
            dog.setName(dogName);
        }
    }

    @Override
    public String toString() {
        String message = name + " heeft een " + dog.getSpecies() + " met de naam " + dog.getName();
        message += dog.getSex().equalsIgnoreCase("rue") ? " hij is " : " zij is ";
        message += dog.getAge() + " jaar.";
        return message;
    }

    public void ageDog() {
        if (dog != null) {
            this.dog.age();
        }

    }
}
