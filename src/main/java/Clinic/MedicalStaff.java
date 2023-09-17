package Clinic;

import SeminarAnimals.Animal;

import java.time.LocalDate;

public abstract class MedicalStaff {
    protected String surname;
    protected String name;
    protected LocalDate dateOfEmployment;
    protected LocalDate bithDate;

    public MedicalStaff(String surname, String name, LocalDate dateOfEmployment, LocalDate bithDate) {
        this.surname = surname;
        this.name = name;
        this.dateOfEmployment = dateOfEmployment;
        this.bithDate = bithDate;
    }

    public abstract void inspect(Animal animal);

    public String getName() {
        return name;
    }
}