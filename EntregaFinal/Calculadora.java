/*
Martin Ortega 18020 
Sara Zavala 18893
Estructura de Datos
Calculadora.java
Clase Calculadora con sus metodos ya creados
 */
//package hojadetrabajodos;

/**
 * @author user
 * @author moyha
 */

//Se implementa la interface iCalculadora en esta clase
public class Calculadora implements iCalculadora {
    public double sumar(double a, double b){
        return a+b; //Sumar ambos double
    }
    
    public double restar(double a, double b){
        return a-b; //Restar ambos double
    }
    
    public double multiplicar(double a, double b){
        return a*b; //Multiplicar ambos double
    }
    
    public double dividir(double a, double b){
        return a/b; //Dividir ambos double
    }

}
