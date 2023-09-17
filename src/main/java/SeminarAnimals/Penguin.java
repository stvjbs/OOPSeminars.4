package SeminarAnimals;

import Clinic.Runable;
import Clinic.Swimmable;

import java.time.LocalDate;
import java.util.List;

public class Penguin extends Animal implements Swimmable, Runable {
    public Penguin(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    public Penguin(String name, double weight, Owner owner, LocalDate birthDay, Color color) {
        super(name, weight, owner, birthDay, color);
    }

    @Override
    public double getRunSpeed() {
        return 0.5;
    }

    @Override
    public double getSwimmSpeed() {
        return 7.0;
    }
}
