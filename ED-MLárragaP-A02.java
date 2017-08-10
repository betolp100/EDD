package ed.mlárragap.a02;

public class EDMLárragaPA02 {

    public static void main(String[] args) {
        //1era PARTE
        System.out.println(factorial(10));
        //2nda PARTE
        int[] vector = {10,20,30,20};
        System.out.println(sumarVector (vector, vector.length-1));
        //3era PARTE
        System.out.println(multiplicarVector (vector, vector.length-1));
    }
    //1era Parte. Se realiza el factorial de 10.
     public static int factorial (int n)
        {
            if (n==0)
                {
                 return 1;   
                } else 
                    {
                        return n*factorial (n-1);
                    }
        }
//2nda Parte. Se suma todo lo que esta adentro del vector.
    public static int sumarVector(int [] v, int n)
    {
        if(n==0)
            {
                return v[n];
            } else 
                   {
                        return v[n]+sumarVector (v, n-1);
                    }
    }
    
    //3era Parte. Se multiplica todo lo que está adentro del vector.
    public static int multiplicarVector(int [] v, int n){
        if(n==0)
            {
                return v[n];
            } else 
                    {
                        return v[n]*multiplicarVector(v, n-1);
                    }
            }
}
