package ed.mlárragap.a03;

public class Secuencial{
    
   public static int fetch(int[] vector, int dato)
   {
        for (int i=0; i < vector.length; ++i)
            {
                if (vector[i] == dato)
                {
                    return i;
                }
            }
    return -1;
  }
}
