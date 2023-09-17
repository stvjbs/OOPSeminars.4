package SeminarAnimals;

import Clinic.Swimmable;

import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal implements Swimmable {
    public Fish(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    public Fish(String name, double weight, Owner owner, LocalDate birthDay, Color color) {
        super(name, weight, owner, birthDay, color);
    }


    @Override
    public double getSwimmSpeed() {
        return 11.0;
    }
}
