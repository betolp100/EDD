package pila;

public class PILA {
    public static void main(String[] args) {
        Stack  pila = new Stack ();
        pila.push(23);
        pila.push(2);
        pila.push(143);
        pila.push(43);
        pila.showStack();
        pila.pop();
        pila.showStack();
        pila.push(52);
        pila.push(12);
        pila.push(13);
        pila.push(73);
        pila.showStack();
    }   
}