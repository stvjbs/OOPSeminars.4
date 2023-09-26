package gb.linked;

public interface Linked<T> {
    void addLast(T t);
    int size();
    T getElementByIndex(int index);
}
