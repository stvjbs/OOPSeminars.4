import gb.list.GBArrayList;
import gb.list.GBList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GBArrayListTest {
    @Test
    public void addTest() {
        GBList<Integer> list = new GBArrayList();
        list.add(5);
        Assertions.assertEquals(5, list.get(0));
    }
    @Test
    public void addNegativeTest() {
        GBList<Integer> list = new GBArrayList();
        list.add(5);
        Assertions.assertNotEquals(7, list.get(0));
    }
}
