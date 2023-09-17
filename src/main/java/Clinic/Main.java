package Clinic;

import SeminarAnimals.*;

import java.time.LocalDate;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Owner Anna = new Owner("Anna");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));
        Nurse irina = new Nurse("Volkova",
                "Irina",
                LocalDate.of(2020, 12, 10),
                LocalDate.of(1994, 12, 25));
        Doctor igor = new Doctor("Zuev",
                "Igor",
                LocalDate.of(2020, 12, 10),
                LocalDate.of(1994, 12, 25), Specialization.THERAPIST, irina);
        Cat barsik = new Cat("barsik", 10.0, Anna, LocalDate.now(), List.of(chumka), Color.BLACK, "siamskiy");
        Dog barbos = new Dog("barbos", 10.0, Anna, LocalDate.now(), List.of(chumka), Color.WHITE);
        Parrot kesha = new Parrot("kesha", 0.2, new Owner("Larisa"), LocalDate.now(), Color.BLACK);
        Penguin seva = new Penguin("seva", 30.0, new Owner("Piter"), LocalDate.now(), Color.BLACK);
        Fish nemo = new Fish("nemo", 0.5, new Owner("Masha"), LocalDate.now(), Color.WHITE);
        Frog ignat = new Frog("ignat", 0.1, new Owner("Fedor"), LocalDate.now(), Color.BLACK);
        Spider mrak = new Spider("mrak", 0.2, new Owner("Anna"), LocalDate.now(), Color.BLACK);
        irina.inspect(barbos);
        igor.giveTaskNurse(barsik);
        System.out.println(barsik.getName() + " убегает от медсестры со скоростью " + barsik.getRunSpeed());

        Clinic clinic = new Clinic(List.of(barsik, barbos, kesha, seva, nemo, ignat, mrak));
        System.out.printf("%nЛетающие животные: %s", clinic.getAllFlyed());
        System.out.printf("%nБегающие животные: %s", clinic.getAllRunable());
        System.out.printf("%nПлавающие животные: %s", clinic.getAllSwimable());


        printAnimalsThreeVarMove(clinic);

    }

    public static void printAnimalsThreeVarMove(Clinic clinic) {
        if (clinic.getAnimalsThreeVarMove().size() == 0) {
            System.out.printf("%nНет животных, умеющих и летать, и плавать, и бегать");
        } else {
            System.out.printf("%nПлавающие, бегающие, летающие животные: %s", clinic.getAnimalsThreeVarMove());
        }
    }
}
