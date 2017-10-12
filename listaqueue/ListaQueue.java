package listaqueue;

public class ListaQueue {

    public static void main(String[] args) {
     Queue fila = new Queue();
        fila.enqueue(" esta");
        fila.enqueue(" es");
        fila.enqueue(" una");
        fila.enqueue(" fila");
        fila.showQueue();
        fila.dequeue();
        fila.showQueue();
        fila.clearQueue();
        fila.showQueue();    
    }
    
}
