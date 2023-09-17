package SeminarAnimals;

import Clinic.Flyable;
import Clinic.Runable;
import Clinic.Swimmable;

import java.time.LocalDate;
import java.util.List;

public class Parrot extends Animal implements Flyable, Runable {
    public Parrot(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    public Parrot(String name, double weight, Owner owner, LocalDate birthDay, Color color) {
        super(name, weight, owner, birthDay, color);
    }

    @Override
    protected void swim() {
        System.out.println(super.TYPE + " не плавает.");
    }


    @Override
    public double getRunSpeed() {
        return 0.1;
    }

    @Override
    public double getFlySpeed() {
        return 10.0;
    }

}
