package SeminarAnimals;

import Clinic.Runable;

import java.time.LocalDate;
import java.util.List;

public class Spider extends Animal implements Runable {
    public Spider(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    public Spider(String name, double weight, Owner owner, LocalDate birthDay, Color color) {
        super(name, weight, owner, birthDay, color);
    }
    @Override
    protected void swim() {
        System.out.println(super.TYPE + " не плавает.");
    }

    @Override
    public double getRunSpeed() {
        return 4.0;
    }
}
