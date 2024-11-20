import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoublyLinkedListTest {
    @org.junit.jupiter.api.Test
    void add() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        assertEquals(list.toString(),"10 ");
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15);
        assertEquals(list.toString(), "10 15 20 30 ");

    }

    @org.junit.jupiter.api.Test
    void remove() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.remove();
        assertEquals(list.toString(), "");
    }

    @org.junit.jupiter.api.Test
    void testRemove() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);
        assertEquals(list.toString(), "10 30 ");

    }

    @org.junit.jupiter.api.Test
    void get() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.add(30);
        list.get(1);
        assertEquals(list.toString(), "10 ");
    }

    @org.junit.jupiter.api.Test
    void set() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.add(20);
        list.set(1, 30);
        assertEquals(list.toString(), "10 30 ");

    }

    @org.junit.jupiter.api.Test
    void size() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.size();
        assertEquals(list.toString(), "2 ");
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertEquals(list.toString(), "true ");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        assertEquals(list.toString(), "10 ");
    }
}
