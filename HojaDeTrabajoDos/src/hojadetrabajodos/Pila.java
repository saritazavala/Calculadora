/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajodos;
import java.util.*;

/**
 *
 * @author moyha
 */
public class Pila<E> implements iPila<E>{
    
    Vector<E> vector = new Vector<E>();
    
    public void push(E item){
        this.vector.add(item);
    }
    
    public E pop(){
        int algo = vector.size();
        return this.vector.remove(algo-1);
    } 
    
    public E peek(){
        int algo = vector.size();
        return this.vector.get(algo-1);
    }
    
    public boolean empty(){
        if(this.vector.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int size(){
        return this.vector.size();
    }
    
}
