package SeminarAnimals;

import Clinic.Runable;
import Clinic.Swimmable;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Swimmable, Runable {
    private String breed;
    public Cat(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color, String breed) {
        super(name, weight, owner, birthDay, vaccinations, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public double getRunSpeed() {
        return 10.0;
    }

    @Override
    public double getSwimmSpeed() {
        return 1.0;
    }
}
