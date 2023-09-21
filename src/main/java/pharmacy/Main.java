package pharmacy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pharmacy catPharmacy = new CatPharmacy();
        Component pen = new Penicilium("5 мг");
        pen.setWeight("7 мг");
        catPharmacy.addComponent(new Azitronitum("12 мг"))
                .addComponent(new Water("10 мл"))
                .addComponent(pen);


        Pharmacy catPharmacy1 = new CatPharmacy();

        catPharmacy1.addComponent(new Azitronitum("15 мг"))
                .addComponent(pen);

        Pharmacy catPharmacy2 = new CatPharmacy();

        catPharmacy2.addComponent(new Azitronitum("15 мг"))
                .addComponent(new Water("12 мл"));

        Pharmacy catPharmacy3 = new CatPharmacy();
        catPharmacy3.addComponent(new Azitronitum("15 мг"))
                .addComponent(new Water("12 мл")).addComponent(new Water("12 мл"));
        Pharmacy catPharmacy4 = new CatPharmacy();
        catPharmacy4.addComponent(new Azitronitum("15 мг"))
                .addComponent(new Water("12 мл")).addComponent(new Water("12 мл"));
        Pharmacy catPharmacy5 = new CatPharmacy();
        catPharmacy5.addComponent(new Water("12 мл"))
                .addComponent(new Water("12 мл"))
                .addComponent(new Water("12 мл"))
                .addComponent(new Water("12 мл"))
                .addComponent(new Water("12 мл"))
                .addComponent(new Water("12 мл"))
                .addComponent(new Water("12 мл"))
                .addComponent(new Water("12 мл"))
                .addComponent(new Water("12 мл"))
                .addComponent(new Water("12 мл"))
                .addComponent(new Water("12 мл"));


        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(catPharmacy);
        pharmacyList.add(catPharmacy1);
        pharmacyList.add(catPharmacy2);
        pharmacyList.add(catPharmacy3);
        pharmacyList.add(catPharmacy4);
        pharmacyList.add(catPharmacy5);


        for (Pharmacy p : pharmacyList) {
            System.out.println(p.getFullPower() + " " + "состав" + " " + p.getStringNamesComponents());
        }
        Collections.sort(pharmacyList);
        System.out.println("-------------------");
        for (Pharmacy p : pharmacyList) {
            System.out.println(p.getFullPower() + " " + "состав" + " " + p.getStringNamesComponents());
        }

//        while (((Iterator<Component>) catPharmacy).hasNext()) {
//            System.out.println(((Iterator<Component>) catPharmacy).next());
//        }
//        for (Component component : catPharmacy) {
//            System.out.println(component);
//        }
        System.out.println("-------------------");

        Set<Pharmacy> result = new HashSet<>();
        for (Pharmacy p : pharmacyList) {
            result.add(p);
        }
        System.out.println("Размер коллекции Set" + " " + result.size());
    }
}
