/*
Martin Ortega 18020 
Sara Zavala 18893
Estructura de Datos
HojaDeTrabajoDos.java
Main
 */

//package hojadetrabajodos;
import java.io.*;
import java.util.*;

/**
 * @author user
 * @author moyha
 */
public class HojaDeTrabajoDos { //Main
    public static void main(String[] args) {

        //Variables
        String fileName = "datos.txt";
        String line = null;
        Pila stack = new Pila();
        Calculadora calc = new Calculadora();
        double x = 0;
        double y = 0;
        double res = 0;

        //Try para leer el documento
        try{
        FileReader fileReader = new FileReader(fileName); // Se crea el lector de documento
         
        BufferedReader bufferedReader = new BufferedReader(fileReader);//Secrea bufferedReader

        //Ciclo que corre mientras se pueda leer el documento
        while((line = bufferedReader.readLine()) != null) {
                char[] datos = line.toCharArray();// Array de Chars
                
                    
                    for(int i = 0; i<datos.length; i++){
                    // Se recorre el array y se comprueba si se tiene la cantidad suficiente de datos     
                    switch(datos[i]){
                        case '+': // Si se encuentra un operando +
                            if(stack.size() <= 1){
                                System.out.println("No hay suficientes operandos para realizar la operación. El siguiente resultado está incorrecto debido a esto.");
                            }// Si no se tiene se devolverá este mensaje
                            else{
                                //Si el documento si los tiene se harán los siguientes métodos
                                x = (double)stack.pop();
                                System.out.println("Salio al stack: " + x);
                                y = (double)stack.pop();
                                System.out.println("Salio al stack: " + y);
                                res = calc.sumar( x, y);
                                stack.push(res);
                                System.out.println("Entro al stack: " + res);
                            }
                            break;
                        case '-': // Si se encuentra un operando -
                            if(stack.size() <= 1){
                                System.out.println("No hay suficientes operandos para realizar la operación. El siguiente resultado está incorrecto debido a esto.");
                            } // Si no se tiene se devolverá este mensaje
                            else{
                                //Si el documento si los tiene se harán los siguientes métodos
                                x = (double)stack.pop();
                                System.out.println("Salio al stack: " + x);
                                y = (double)stack.pop();
                                System.out.println("Salio al stack: " + y);
                                res = calc.restar( x, y);
                                stack.push(res);
                                System.out.println("Entro al stack: " + res);
                            }
                            break;
                        case '*':// Si se encuentra un operando *
                            if(stack.size() <= 1){
                                System.out.println("No hay suficientes operandos para realizar la operación. El siguiente resultado está incorrecto debido a esto.");
                            }
                            else{
                                //Si el documento si los tiene se harán los siguientes métodos
                                x = (double)stack.pop();
                                System.out.println("Salio al stack: " + x);
                                y = (double)stack.pop();
                                System.out.println("Salio al stack: " + y);
                                res = calc.multiplicar( x, y);
                                stack.push(res);
                                System.out.println("Entro al stack: " + res);
                            }
                            break;
                        case '/': // Si se encuentra un operando /
                            if(stack.size() <= 1){
                                System.out.println("No hay suficientes operandos para realizar la operación. El siguiente resultado está incorrecto debido a esto.");
                            }
                            else{
                                //Si el documento si los tiene se harán los siguientes métodos
                                x = (double)stack.pop();
                                System.out.println("Salio al stack: " + x);
                                y = (double)stack.pop();
                                System.out.println("Salio al stack: " + y);
                                if(y==0){
                                    System.out.println("Esta tratando de dividir entro de cero.");
                                }
                                else{
                                    res = calc.dividir( x, y);
                                    stack.push(res);
                                    System.out.println("Entro al stack: " + res);
                                }
                                break;
                            }

                        //  Casos por si se encuentran numeros en el documento
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':    
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '0':
                            double pusher = Character.getNumericValue(datos[i]);
                            stack.push(pusher);
                            //Se pushean los datos al vector
                            break;
                        default:
                            break;
                    }
                }
            res = (double) stack.pop();
            System.out.println("La respuesta es: " + res); //Se da a conocer la respuesta en pantalla
            } 
        bufferedReader.close(); 
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");    
                //Si no se puede abrir o no se encuentra el archivo            
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");
                //Si no se puede abrir o no se encuentra el archivo                      
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}