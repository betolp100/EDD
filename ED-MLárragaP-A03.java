package ed.mlárragap.a03;
import java.util.Scanner;

public class EDMLárragaPA03 
{

    public static void main(String[] args) 
    {
        int pos1, pos2, tamaño, valor, n;
        System.out.println("¿Cuántos números tiene el vector?");
        Scanner entrada = new Scanner(System.in);
        tamaño=entrada.nextInt();
        int[] vector= new int[tamaño];
        int[] vector2= new int[tamaño];
        for(int i=0;i<vector.length;i++)
            {
                System.out.println("Dame el valor de la posición [ "+(i+1)+" ]:" );
                valor=entrada.nextInt();
                vector[i]=valor;
            }
        System.out.println("De entre los números dados, ¿cuál de entre todos quieres saber la posición de este en el vector?");
        n= entrada.nextInt();
        Binario bin= new Binario();
        Secuencial sec= new Secuencial();
        
        pos1=sec.fetch(vector, n);
        vector2=bin.seleccion(vector);
        pos2=bin.fetch(vector2, n);
        
        System.out.println("================================================================");
        if((pos1==-1)&&(pos2==-1))
            {
                System.out.println("El número no existe");
            } else {
        
                    System.out.println("El vector tiene "+vector.length+ " números.");
                    System.out.println("El número buscado: "+n+", se encuentra en la posición "+pos1+".");
                    System.out.print("\n\n\n");
                    System.out.println("(Está línea de código es tan sólo para verificar si ambos buscadores funcionan correctamente).\nLa busqueda por binario encuentra el número en la posición "+pos2+"\ny por secuencial está en la posicción "+pos1);
        }
    }
}
