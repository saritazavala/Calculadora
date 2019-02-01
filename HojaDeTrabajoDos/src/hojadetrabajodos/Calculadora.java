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
public class Calculadora implements iCalculadora {
    public double sumar(double a, double b){
        return a+b;
    }
    
    public double restar(double a, double b){
        return a-b;
    }
    
    public double multiplicar(double a, double b){
        return a*b;
    }
    
    public double dividir(double a, double b){
        return a/b;
    }
    
}
