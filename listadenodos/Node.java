package listadenodos;


public class  Node <T> {
    T data;
    Node next;
    Node prev;
    public Node(T data)
    {
        this.data=data;
        next = null;
        prev = null;
    }
}
