package SeminarAnimals;

import java.time.LocalDate;
import java.util.List;

public class Frog extends Animal{
    public Frog(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    public Frog(String name, double weight, Owner owner, LocalDate birthDay, Color color) {
        super(name, weight, owner, birthDay, color);
    }
}
