/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificaciones;

import java.util.Scanner;

/**
 *
 * @author Jz
 */
public class Calificaciones {

    public static void main(String[] args) {

        float matematicas = 0;
        float espanol = 0;
        float ingles = 0;
        int materia;
        float promedio = 0;
        float promediomatematica=0;
        float espanola = 0;
        float promedioespanol = 0;
        float promedioingles= 0;
        double nota=0;
        float cante;
        float acum = 0;
        float acum1 = 0;
        double nota3 = 0;
        float n=0;
        Scanner teclado = new Scanner(System.in);

        materia = 0;
        System.out.print("Ingrese lacantidad de estudiantes: ");
        cante = teclado.nextInt();
        System.out.println("Seleccione la materia que desea promediar");
        System.out.println("*******************************************");
        System.out.print("1: MATEMATICAS || 2: ESPAÑOL || 3: INGLES : ");
        materia = teclado.nextInt();

        switch (materia) {
            case 1:
                matematicas =0;
                for (int i = 0; i <= cante; i++) {
                    System.out.print("nota de matematicas: ");
                    nota = teclado.nextDouble();
                    matematicas += nota;
                    promediomatematica= matematicas/ cante;

                }

                break;

            case 2:
                espanol = 0;

                while (acum <= cante) {
                    System.out.print(" ingrese la nota: " );
                    n = teclado.nextFloat();
                    nota += n;
                    acum++;
                    }
                promedioespanol = acum / cante;
                
                break;

                
            case 3:
                ingles = 0;
                do {  
                    nota += n;
                     acum++;
                    System.out.print(" Ingrese la nota: " );
                    nota = teclado.nextInt();
                } 
                while (acum <= cante);
                
                promedioingles = acum / cante;
                
                
                 break;
                 
                default:
                    System.out.print("opcion incorrecta");
                    break;
                    
                            }

                System.out.println("El promedio para matematicas es de: " + promediomatematica);
                System.out.println(" El promedio para español es de: " + promedioespanol);
                System.out.println(" El promedio para ingles es de: " + promedioingles );


    }
    
}
