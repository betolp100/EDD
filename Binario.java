package ed.mlárragap.a03;

public class Binario
{   
    int dato;
    int[] nuevVector;
    
    public int[] seleccion(int[] vector) 
    {
        int aux; 
        for (int i = 0; i < vector.length - 1; i++) 
        { 
            int m = i; 
            for (int j = i + 1; j < vector.length; j++) 
            { 
              if (vector[j] < vector [m]) 
              { 
                  m = j;
              }
            }
            aux = vector[i];
            vector[i]=vector[m];
            vector[m]=aux;
        }
        return vector;
    }
    
    public int fetch(int [] vector, int dato)
    {
        int inicio = 0;
        int fin = vector.length - 1;
        int centro;
        while (inicio <= fin)
        {
            centro = (inicio+fin) / 2;
            if ( vector[centro] == dato )
            {
            return centro;
            }else if ( vector[centro] < dato )
            {
                inicio = centro+1;
            } else 
                    {
                    fin = centro-1;
                    }
        }
        return -1;
    }
}
