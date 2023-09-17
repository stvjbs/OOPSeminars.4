package SeminarAnimals;

import Clinic.Runable;
import Clinic.Swimmable;

import java.time.LocalDate;
import java.util.List;

public class Frog extends Animal implements Swimmable, Runable {
    public Frog(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    public Frog(String name, double weight, Owner owner, LocalDate birthDay, Color color) {
        super(name, weight, owner, birthDay, color);
    }

    @Override
    public double getRunSpeed() {
        return 3.0;
    }

    @Override
    public double getSwimmSpeed() {
        return 5.0;
    }
}
