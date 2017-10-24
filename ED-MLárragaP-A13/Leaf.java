package nolineales;

public class Leaf {
    int data;
    Leaf left;
    Leaf right;    
    
    Leaf()
    {
        left=right=null;
        data=0;
    }

    Leaf(int d)
    {
        left=right=null;
        data=d;
    }

    void print()
    {
        System.out.println(" "+data+" ");
    }

    int getData()
    {
        return data;
    }

    void sdetData(int d)
    {
        data=d;
    }
}