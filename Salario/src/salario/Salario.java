/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salario;

import java.util.Scanner;

/**
 *
 * @author Jz
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       final  float salarioPorHora = 35; 
       float salario,horaSemanal;
       
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Ingrese sus horas semanales trabajadas: ");
        horaSemanal= entrada.nextFloat();
        
        salario=horaSemanal*salarioPorHora;
        
        System.out.println("Su salario es de: "+ salario);
        
       
        
    }
    
}
