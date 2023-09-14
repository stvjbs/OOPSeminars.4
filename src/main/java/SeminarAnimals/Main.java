package SeminarAnimals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner Anna = new Owner("Anna");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));

        Animal barsik = new Cat("barsik", 10.0, Anna, LocalDate.now(), List.of(chumka), Color.BLACK, "siamskiy");
        Dog barbos = new Dog("barbos", 10.0, Anna, LocalDate.now(), List.of(chumka), Color.WHITE);
        Parrot kesha = new Parrot("kesha", 0.2, new Owner("Larisa"), LocalDate.now(),Color.BLACK);
        Penguin seva = new Penguin("seva", 30.0, new Owner("Piter"), LocalDate.now(),Color.BLACK);
        Fish nemo = new Fish("nemo", 0.5, new Owner("Masha"), LocalDate.now(),Color.WHITE);
        Frog ignat = new Frog("ignat", 0.1, new Owner("Fedor"), LocalDate.now(),Color.BLACK);
        Spider mrak = new Spider("mrak", 0.2, new Owner("Anna"), LocalDate.now(),Color.BLACK);
        seva.fly();
        seva.swim();
        kesha.swim();
        mrak.swim();
        mrak.fly();
        nemo.toGo();
        seva.toGo();
        ignat.swim();




//        System.out.println(barsik.getName());
//
//        System.out.println(barsik.getVaccinations());
//
//        barsik.setVaccinations(List.of(chumka, new Vaccination("столбняк", LocalDate.now())));
//        System.out.println(barsik.getVaccinations());
//
//        System.out.println(barsik.getVaccinations());
//

//        List<Animal> animals = new ArrayList<>();
//        animals.add(barsik);
//        animals.add(barbos);
//        for (Animal animal : animals) {
//            if (animal instanceof Cat) {
//                System.out.println(((Cat) animal).getBreed());
//            }
//            System.out.println(animal.getName());
//        }
//        //((Cat) barsik).getBreed();
//
//        barsik.lifeCycle();
    }
}