package SeminarAnimals;

import java.time.LocalDate;
import java.util.List;

public class Penguin extends Animal{
    public Penguin(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    public Penguin(String name, double weight, Owner owner, LocalDate birthDay, Color color) {
        super(name, weight, owner, birthDay, color);
    }
}
