package Clinic;

import SeminarAnimals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private List<Animal> patients;

    public Clinic(List<Animal> patients) {
        this.patients = patients;
    }

    public void addPatient(Animal animal) {
        patients.add(animal);
    }

    public List<Animal> getAllFlyed() {
        List<Animal> flyableAnimals = new ArrayList<>();
        for (Animal animal : this.patients) {
            if (animal instanceof Flyable) {
                flyableAnimals.add(animal);
            }
        }
        return flyableAnimals;
    }
    public List<Animal> getAllRunable() {
        List<Animal> runableAnimals = new ArrayList<>();
        for (Animal animal : this.patients) {
            if (animal instanceof Runable) {
                runableAnimals.add(animal);
            }
        }
        return runableAnimals;
    }
    public List<Animal> getAllSwimable() {
        List<Animal> swimableAnimals = new ArrayList<>();
        for (Animal animal : this.patients) {
            if (animal instanceof Swimmable) {
                swimableAnimals.add(animal);
            }
        }
        return swimableAnimals;
    }
    public List<Animal> getAnimalsThreeVarMove() {
        List<Animal> animalsThreeVarMove = new ArrayList<>();
        for (Animal animal : this.patients) {
            if (animal instanceof Swimmable & animal instanceof Runable & animal instanceof Flyable) {
                animalsThreeVarMove.add(animal);
            }
        }
        return animalsThreeVarMove;
    }

}


