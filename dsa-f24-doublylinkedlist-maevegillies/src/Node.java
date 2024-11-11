public class Node<E> {
    private E obj;
    private Node<E> nextNode;
    private Node<E> first; //previous node

    public Node(){
        obj = null;
        first = null;
        nextNode = null;
    }

    public Node(E value){
        obj = value;
        first = null;
        nextNode = null;
    }

    public Node(E value, Node<E> prev){
        obj = value;
        first = prev;
        nextNode = null;
    }

    public E getValue() {
        return obj;
    }

    public void setValue(E obj2) {
        obj = obj2;
    }

    public void setNext(Node<E> nextNode) {
        //constructor
        this.nextNode = nextNode;

        //assign value to next node
        //set the next node to whatever was inputted
    }
    public Node<E> getNext() {
        return nextNode;
    }

    public void setPrev(Node<E> first) {
        //constructor
        this.first = first;
        //set the previous node to whatever the first node was
    }
    public Node<E> getPrev() {
        return first;
    }


    public String toString() {
        return obj + "";
        }

}

