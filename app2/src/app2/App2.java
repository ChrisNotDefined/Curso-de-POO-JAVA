/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app2;

import java.util.InputMismatchException;
import java.util.Scanner;




/**
 *
 * @author felipehernandez
 */
public class App2 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            
            Scanner scanner =  new Scanner(System.in);
        
            System.out.println("Ingrese su nombre: ");
            String nombre =  scanner.nextLine();

             System.out.println("Ingrese su edad: ");
             //String edad =  scanner.nextLine();
             int edad  =  scanner.nextInt();

              System.out.println("Ingrese su altura: ");       
             double altura = scanner.nextDouble();
             
                  System.out.println("Ingrese su peso: ");       
             double peso = scanner.nextDouble();

             double imc = peso / altura;
             
             String datos = "Tu nombre es: "+nombre+", Tu edad es: "+
                     edad+", tu altura es: "+altura+", tu IMC es: "+imc;
         
             System.out.println(datos); 
            
        } catch(InputMismatchException ex){
            System.out.println("Dato no valido");
        } 
        catch (Exception e) {
            System.out.println("hubo un error: "+e.getMessage());
        }
        
        
    }
    
}
