package gb.linked;

public class Main {
    public static void main(String[] args) {
        Linked<Integer> ll = new LinkedContainer<>();
        ll.addLast(5);
        ll.addLast(12);
        ll.addLast(9);
        System.out.println(ll.size());
        System.out.println(ll.getElementByIndex(1));
    }
}
