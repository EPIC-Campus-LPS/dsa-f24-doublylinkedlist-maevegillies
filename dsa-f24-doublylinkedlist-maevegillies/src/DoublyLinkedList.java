public class DoublyLinkedList<E> implements List{
    private int size;
    private Node firstNode;
    private Node lastNode;
    private String fullList;

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






        // If index is invalid, throws IndexOutOfBoundsException
    }

    @Override
    public void remove() {
        firstNode = null;
        lastNode = null;
        size = 0;

    }

    @Override
    public Node remove(int i) throws IndexOutOfBoundsException {
        Node<E> temp = new Node(firstNode);
        if (i == 0) {
            firstNode = firstNode.getNext();
            firstNode.setPrev(null);
            return temp;

        } else if (i == size - 1) {
            Node<E> temp3 = new Node(lastNode);
            lastNode = lastNode.getPrev();
            lastNode.setNext(null);
            return temp3;
        }
        else if(i > 0 || i < size) {
            Node <E> currNode = firstNode;
            for (int j = 0; j < i; j++) {
                currNode = currNode.getNext();
            }

            Node<E> temp2 = new Node(currNode);
            currNode.getPrev().setNext(currNode.getNext());
            currNode.getNext().setPrev(currNode.getPrev());
            return temp2;
        } else {
            throw new IndexOutOfBoundsException("bad");
        }
    }

    @Override
    public Node get(int i) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public void set(int i, Object element) throws IndexOutOfBoundsException {
        /**
         * Sets the element at i to a new value
         * If index is invalid, throws IndexOutOfBoundsException
         * @param i index of the element to set
         * @param element new value of the element
         */
        if (i == 0) {
            firstNode.setValue(element);
        }
        else if (i > 0 && i < size) {
            Node<E> currNode = firstNode;
            for (int j = 0; j < i; j++) {
                currNode = currNode.getNext();
            }
            currNode.setValue((E) element);


            //if i = 0, then set the firstnode to the element

            //if i is > 0 but < the size of the list
            //create a new currNode that takes in the next value of the first Node
            //iterate through the list


            //make a new node
            //attach node to the beginning of the list
            //traverse node through the linked list until i = 0


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
