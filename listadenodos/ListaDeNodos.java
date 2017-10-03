package listadenodos;

public class ListaDeNodos {
    
    public static void main(String[] args) {
        CircleList list = new CircleList(1);
        
        list.insert(2);
        list.insert(3);
        
        list.showList();
        list.showListbyAddress();
        list.deleteNode(2);
        
        list.showList();
        list.showListbyAddress();
        list.deleteList();
        
        list.showList();
        list.showListbyAddress();
    }
    
}
