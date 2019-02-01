/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojadetrabajodos;
import java.io.*;
import java.util.*;

/**
 *
 * @author moyha
 */
public class HojaDeTrabajoDos {
    public static void main(String[] args) {
        String fileName = "datos.txt";
        String line = null;
        Pila stack = new Pila();
        Calculadora calc = new Calculadora();
        double x = 0;
        double y = 0;
        double res = 0;
        try{
        FileReader fileReader = new FileReader(fileName);
        
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        while((line = bufferedReader.readLine()) != null) {
                char[] datos = line.toCharArray();
                
                    for(int i = 0; i<datos.length; i++){
                    switch(datos[i]){
                        case '+':
                            if(stack.size() <= 1){
                                System.out.println("No hay suficientes operandos para realizar la operación. El siguiente resultado está incorrecto debido a esto.");
                            }
                            else{
                                x = (double)stack.pop();
                                y = (double)stack.pop();
                                res = calc.sumar( x, y);
                                stack.push(res);
                            }
                            break;
                        case '-':
                            if(stack.size() <= 1){
                                System.out.println("No hay suficientes operandos para realizar la operación. El siguiente resultado está incorrecto debido a esto.");
                            }
                            else{
                                x = (double)stack.pop();
                                y = (double)stack.pop();
                                res = calc.restar( x, y);
                                stack.push(res);
                            }
                            break;
                        case '*':
                            if(stack.size() <= 1){
                                System.out.println("No hay suficientes operandos para realizar la operación. El siguiente resultado está incorrecto debido a esto.");
                            }
                            else{
                                x = (double)stack.pop();
                                y = (double)stack.pop();
                                res = calc.multiplicar( x, y);
                                stack.push(res);
                            }
                            break;
                        case '/':
                            if(stack.size() <= 1){
                                System.out.println("No hay suficientes operandos para realizar la operación. El siguiente resultado está incorrecto debido a esto.");
                            }
                            else{
                                x = (double)stack.pop();
                                y = (double)stack.pop();
                                if(y==0){
                                    System.out.println("Está tratando de dividir entro de cero.");
                                }
                                else{
                                    res = calc.dividir( x, y);
                                    stack.push(res);
                                }
                                break;
                            }
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
                            break;
                        default:
                            break;
                    }
                }
            res = (double) stack.pop();
            System.out.println(res);
            } 
        bufferedReader.close(); 
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
