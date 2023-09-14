package SeminarAnimals;

import java.time.LocalDate;
import java.util.List;

public class Parrot extends Animal{
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
}
