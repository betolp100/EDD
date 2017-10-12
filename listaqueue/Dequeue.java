package listaqueue;

public class Dequeue <T>{
    
    private DLNode front;
    private DLNode rear;
    private int size;
    
    public Dequeue()
    {
        front = null;
        rear = null;
        size = 0;
    }
    
    public Dequeue(T d)
    {
        front = rear =new DLNode(d);
        size=1;
    }
    
    public void enqueueFront(T d)
    {
        DLNode node = new DLNode(d);
        if(isEmpty())
        {
            front=rear=node;
        }else{
            node.next = front;
            front.back = node;
            front = node;
        }
        size++;
    }
    
    public void enqueueRear(T d)
    {
        if(isEmpty())
        {
            enqueueFront(d);
        }else{
            DLNode node = new DLNode(d);
            rear.back = node;
            node.back = rear;
            rear = node;
            size++;
        }
    }
    
    public T dequeueFront()
    {
        if(!isEmpty())
        {
            DLNode fd = front;
            if(size ==1)
            {
                clearDeque();
            }else{
                front = front.next;
                front.back = null;
                size--;
            }
            return (T) fd.data;
            }else{
            return null;
        }
    }
    
    public T dequeueRear()
    {
        if(!isEmpty())
        {
            DLNode rd = rear;
            if(size == 1)
            {
                clearDeque();
            }else{
                rear = rear.back;
                rear.next = null;
                size--;
            }
            return (T) rd.data;
        }else{
            return null;
        }
    }
    
    public T getFront()
    {
        return (T) front.data;
    }
    
    public T getRear()
    {
        return (T) rear.data;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    public void clearDeque()
    {
        front = rear = null;
        size =0;
    }
    
    public void showDeque()
    {
        DLNode p = front;
        while(p!=null)
        {
            p.print();
            p = p.next;
        }
    }
}