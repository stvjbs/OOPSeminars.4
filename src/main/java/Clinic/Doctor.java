package Clinic;

import SeminarAnimals.Animal;

import java.time.LocalDate;

public class Doctor extends MedicalStaff{
    private Specialization specialization;
    private Nurse nurse;
    public Doctor(String surname, String name, LocalDate dateOfEmployment, LocalDate bithDate, Specialization specialization, Nurse nurse) {
        super(surname, name, dateOfEmployment, bithDate);
        this.specialization = specialization;
        this.nurse = nurse;
    }

    @Override
    public void inspect(Animal animal) {
        System.out.println("Врач-" + this.specialization + " " + this.getName() + " осматривает " + animal.getTYPE() + " " + animal.getName());
    }
    public void giveTaskNurse (Animal animal){
        System.out.println("Врач-" + this.specialization + " " + this.getName() + " дает задание медсестре " + nurse.getName() + " сделать укол " + animal.getName());
        nurse.giveInjection(animal);
    }


}
