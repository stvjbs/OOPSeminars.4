package gb.list;

public interface GBList<Y> extends Iterable<Y> {
    //    boolean add(T t), void remove(int index), T get(int index), int size(), void update(int index, T t)
    boolean add(Y y);
    void remove(int index);
    Y get(int index);
    int size();
    void update(int index, Y y);



}
