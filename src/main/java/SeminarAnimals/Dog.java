package SeminarAnimals;

import Clinic.Runable;
import Clinic.Swimmable;

import java.time.LocalDate;

import java.util.List;

public class Dog extends Animal implements Runable, Swimmable {
    public Dog(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    @Override
    public double getRunSpeed() {
        return 10.0;
    }

    @Override
    public double getSwimmSpeed() {
        return 2.0;
    }
}
