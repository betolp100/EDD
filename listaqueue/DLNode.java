package listaqueue;

public class DLNode <T> {
    DLNode next;
    DLNode back;
    T data;
    
    public DLNode(T d)
    {
        data=d;
        next = null;
    }
    
    public void print()
    {
        System.out.println(data+"->");
    }
}
