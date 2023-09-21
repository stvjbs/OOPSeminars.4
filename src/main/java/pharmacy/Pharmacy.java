package pharmacy;
import java.util.*;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private List<Component> components;

    private int index;

    public Pharmacy() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Pharmacy addComponent(Component component) {
        if (component == null) throw new NullPointerException("Компонент не может быть NULL");
        components.add(component);
        return this;
    }

    public int getFullPower() {
        int count = 0;
        for (Component component : components) {
            count += component.getPower();
        }
//      int count = components.stream().mapToInt(Component::getPower).sum();
        return count;
    }



    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + index +
                '}';
    }

//    @Override
//    public Iterator<Component> iterator() {
//        return new PharmacyIterator();
//    }
    public String getStringNamesComponents(){
        String string = "";
        for (Component component : components) {
            string = string + component.getName();
        }
        return string;
    }

    @Override
    public int compareTo(Pharmacy o) {
//        int fullPower = getFullPower();
        if (this.getFullPower() > o.getFullPower()) {
            return 1;
        }
        if (this.getFullPower() < o.getFullPower()) {
            return -1;
        }
        if (this.getFullPower() == o.getFullPower()) {
            int i = this.getStringNamesComponents().compareTo(o.getStringNamesComponents());
            if (i > 0){
                return 1;
            }
            if (i < 0){
                return -1;
            }

        }
        return 0;
    }


    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }
    @Override
    public boolean equals(Object o) {
        Pharmacy t = (Pharmacy) o;

        return t.getFullPower() == this.getFullPower();
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Pharmacy pharmacy = (Pharmacy) o;
//        return pharmacy.getFullPower() == this.getFullPower();
//    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getFullPower());
    }
}