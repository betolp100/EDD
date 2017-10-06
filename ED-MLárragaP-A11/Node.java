package pila;

public class Node <T>

{
    Node next;
    T data;
    
    public Node()
    {
        next=null;
    }
    public Node(T d)
    {
        data = d;
        next = null;
    }
    public void print()
    {
        System.out.println(data+" --> ");
    }
    public void printS()
    {
        System.out.println(data);
        System.out.println("↓");
    }
}

