/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajodos;

/**
 *
 * @author moyha
 */
public interface iPila<E> {
    public void push(E item);
    public E pop();
    public E peek();
    public boolean empty();
    public int size();
}
