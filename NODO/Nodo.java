package nodo;

public class Nodo {

    public static void main(String[] args) {
        ObjPelicula peli1= new ObjPelicula("Star Wars","bob","Ciencia Ficción","A",60);
        ObjPelicula peli2= new ObjPelicula("El Rey León","kyle","Infantil/Animada","C",50);
        ObjPelicula peli3= new ObjPelicula("El Origen","mike","A","Cienca Ficción",40);
        ObjPelicula peli4= new ObjPelicula("El Dorado","trevor","Comedia/Animada","B",70);
        
        ObjNodo n1=new ObjNodo(peli1);
        ObjNodo n2=new ObjNodo(peli2);
        ObjNodo n3=new ObjNodo(peli3);
        ObjNodo n4=new ObjNodo(peli4);
        
        n1.setSiguiente(n2);
        n2.setSiguiente(n3);
        n3.setSiguiente(n4);
        
        ObjNodo aux = n1;
        for(int i=0;i<4;i++)
        {
            ObjPelicula aux2 = (ObjPelicula)aux.getContiene();
            System.out.println(aux2.getNombre()+", "+aux2.getDirector()+", "+aux2.getGenero()+", "+aux2.getClasificacion()+", "+aux2.getCosto());
            aux=aux.getSiguiente();
        }
    }
}
