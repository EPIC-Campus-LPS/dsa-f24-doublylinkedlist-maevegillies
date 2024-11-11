public class Main {
    public static void main(String[] args) {
//        Node<Integer> first = new Node<>(20);
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(20);
        list.add(30);
        list.add(45);
        list.remove(1);

        System.out.println(list);






//        Node<String> next = new Node<>("rubber goose");
//        first.setNext(next);
//        next.setPrev(first);
//
//        Node<String> after = new Node<>("guava juice", next);
//        next.setNext(after);
//        System.out.println(after.getPrev().getValue()); // "rubber goose"
//
//        Node<String> last = new Node<>("giant snake");
//        System.out.println(next.equals(last));
    }
}
