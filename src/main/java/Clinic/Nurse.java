package Clinic;

import SeminarAnimals.Animal;

import java.time.LocalDate;

public class Nurse extends MedicalStaff{

    public Nurse(String surname, String name, LocalDate dateOfEmployment, LocalDate bithDate) {
        super(surname, name, dateOfEmployment, bithDate);
    }

    @Override
    public void inspect(Animal animal) {
        System.out.println("Медсестра " + this.getName() + " осматривает " + animal.getTYPE() + " " + animal.getName());
    }

    public void giveInjection (Animal animal){
        System.out.println("Медсестра " + this.getName() + " делает укол " + animal.getTYPE() + " " + animal.getName());
    }


}
