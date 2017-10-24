package nolineales;

public class BinaryTree {
        Leaf root;
        int leaves;
    
    BinaryTree()
    {
        root=null;
        leaves=0;
    }

    BinaryTree(int d)
    {
        Leaf leaf = new Leaf(d);
        root = leaf;
        leaves=1;
    }

    boolean isEmpty()
    {
        return leaves==0;
    }
    
    void insert(int d, Leaf root)
    {
        if (!isEmpty())
        {
            if (d < root.getData())
            {
                if(root.left!=null)
                {
                    root.left = new Leaf(d);
                    leaves++;
                }
                else
                {
                    insert(d,root.left);
                }
            }
            else
            {
                if(root.right!=null)
                {
                    root.right = new Leaf(d);
                    leaves++;
                }
                else
                {
                    insert(d,root.right);
                }
            }
        }
        else
        {
            root=new Leaf(d);
            leaves=1;
        }
    }

    void showLeaf(Leaf root)
    {
        root.print();
    }

    int  Height(Leaf root)
    {
        if(isEmpty())
        {
            return 0;
        }
        else
        {
            int a,b;
            if (root.left!=null && root.right!=null)
            {
                return 1;
            }
            else
            {
                a=Height(root.left);
                b=Height(root.right);
                if (a>b) 
                {
                    return a+1;
                }
                else 
                {
                    return b+1;
                }
            } 
        }
    }
}