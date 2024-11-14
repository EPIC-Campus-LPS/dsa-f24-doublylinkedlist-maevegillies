public class DoublyLinkedList<E> implements List{
    private int size;
    private Node firstNode;
    private Node lastNode;

    public DoublyLinkedList() {
        size = 0;
    }

    public DoublyLinkedList(int length) {
        size = length;
    }

    @Override
    public void add(Object element) {
        Node newNode = new Node(element);
        if (size == 0) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.setNext(newNode);
            newNode.setPrev(lastNode);
            lastNode = newNode;
        }
        size ++;
    }
    @Override
    public void add(int i, Object element) throws IndexOutOfBoundsException {
        try {
            Node<E> currNode = firstNode;
            for (int j = 1; j < i; j++) {
                currNode = currNode.getNext();
            }
            Node<E> newNode = new Node(element);
            newNode.setNext(currNode.getNext());
            newNode.setPrev(currNode);
            currNode.getNext().setPrev(newNode);
            currNode.setNext(newNode);
            size++;
        } catch(Exception IndexOutOfBoundsException){
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void remove() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    @Override
    public Node remove(int i) throws IndexOutOfBoundsException {
        try {
            Node<E> currNode = firstNode;
            for (int j = 0; j < i; j++) {
                currNode = currNode.getNext();
            }

            Node<E> temp2 = new Node(currNode);
            currNode.getPrev().setNext(currNode.getNext());
            currNode.getNext().setPrev(currNode.getPrev());
            size--;
            return temp2;
        } catch (Exception IndexOutOfBoundsException) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public Node get(int i) throws IndexOutOfBoundsException {
        try {
            Node<E> currNode = firstNode;
            for (int j = 0; j < i; j++) {
                currNode = currNode.getNext();
            }
            return currNode;
        } catch (Exception IndexOutOfBoundsException) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void set(int i, Object element) throws IndexOutOfBoundsException {
        try {
            if (i == 0) {
                firstNode.setValue(element); //for funsies
            } else if (i > 0 && i < size) {
                Node<E> currNode = firstNode;
                for (int j = 0; j < i; j++) {
                    currNode = currNode.getNext();
                }
                currNode.setValue((E) element);
            }
        } catch (Exception IndexOutOfBoundsException) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        //return arr
        String s = "";
        Node<E> n = firstNode;
        for (int x = 0; x < size; x++) {
            s += n + " ";
            n = n.getNext();
        }
        return s;
    }
}
