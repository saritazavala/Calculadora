/*
Martin Ortega 18020	
Sara Zavala 18893
Estructura de Datos
iPila.java
Interface del Stack
 */
//package hojadetrabajodos;

/**
 * @author user
 * @author moyha
 */
public interface iPila<E> {
    public void push(E item); // Ingresar datos al Stack
    public E pop(); // Quitar datos del Stack
    public E peek();// Saber cual es el siguiente dato de la pila
    public boolean empty(); // Stack vacio
    public int size();// Tamaño del Stack
}