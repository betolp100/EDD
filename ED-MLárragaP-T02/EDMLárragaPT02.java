package ed.mlárragap.t02;
import java.util.ArrayList;
import java.util.Scanner;

public class EDMLárragaPT02 {

    public static void main(String[] args) {
       menu();
    }
    
    public static void menu()
        {
            inicio();
            convertidor();
            System.out.println("\n**Programa Finalizado**");
            reiniciar();
        }
    
    public static void inicio()
        {
            System.out.println("======= BIENVENIDO =======");
            System.out.println("\n");
            System.out.println("Programa que verifica si una\n palabra o frsae dada por el\n usuario es un palíndromo.\n");
        }
    
    public static void convertidor()
        {
            Scanner scanner = new Scanner(System.in);
            String arreglo;
            String[] palabras;
            char[] letras={};
            boolean checar = true;
            Stack pila = new Stack();
            ArrayList <Character> frase = new ArrayList<>();
            
            System.out.println("Favor de ingresar una palabra o frase a evaluar.");
            arreglo = scanner.nextLine();
            palabras = arreglo.split("\\s+");
            for(int i=0; i<palabras.length;i++)
                {
                palabras[i] = palabras[i].replaceAll("[^\\p{Alnum}]+", ""); 
                letras = palabras[i].toCharArray();
                for(int j=0; j<letras.length;j++)
                    {
                    pila.push(letras[j]);
                    frase.add(letras[j]);
                    }
                }
        
        int k = 0;
        while (checar == true && k < frase.size())
            {
                char letra = (Character) pila.pop(); 
                
                if (letra!=frase.get(k))
                    {
                        checar = false;
                    }
                    k++;
            }   
            if(checar == true)
            {
                System.out.println("Si es un palindromo");
            }
            else{
                System.out.println("No es un palindromo");
            }
        }
    
    public static void reiniciar()
        {
            char opcion;
            System.out.println("¿Desea reinciar?\n[ 0 ]: No\n[ 1 ]:Si");
            Scanner scanner= new Scanner(System.in);
            opcion=scanner.next().charAt(0);
            
            if (opcion=='1')
                {
                    menu();
                }
            else if(opcion=='0'){
                System.out.println("Gracias, nos vemos.");
                System.exit(0);
                }
            else{
                System.out.println("Favor de seleccionar una respuesta válida.");
                reiniciar();
                }
        }
}