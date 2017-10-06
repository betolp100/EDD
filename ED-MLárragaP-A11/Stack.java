package pila;

public class Stack <T> 
{
    Node <T> top;
    int size;
  
    public Stack()
    {
        top = null;
        size = 0;
    }

    public Stack(T d)    
    {
        Node <T> node = new Node (d);
        top = node;
        size = 1;
    }
    
    public void push(T d)
    {
        Node <T> node = new Node(d);
        node.next=top;
        top = node;
        size++;
    }

    public T pop()
    {
        T d;
        if(!isEmpty())
        {
            d = top.data;
            top = top.next;
            size--;
        }
        else{
            d = null;
        }
        return d;

    }

    
    public T getTop()
    {
        if(!isEmpty())
        {
            return top.data;
        }
        else{
            return null;
        }
    }

    public void showStack()
    {
        Node <T> t = top;
        while(t!=null)
        {
            t.printS();
            t=t.next;
        }
        System.out.println("NULL");
    }

    public boolean isEmpty()
    {
        return size==0;
    }
}