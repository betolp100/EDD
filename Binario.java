
package ed.mlárragap.a03;

public class Binario
{
 
    public static int fetch( int [] arreglo, int dato)
    {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int centro;
        while (inicio <= fin)
        {
            centro = (inicio+fin) / 2;
            if ( arreglo[centro] == dato )
            {
            return centro;
            }else if ( arreglo[centro] < dato )
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
