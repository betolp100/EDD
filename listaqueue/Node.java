package listaqueue;

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
        System.out.print(data);
        System.out.print(" -> ");
    }
} 