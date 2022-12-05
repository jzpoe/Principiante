/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalarioVendedores;

import java.util.Scanner;

/**
 *
 * @author Jz
 */
public class Vendedores {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final float SalarioTotal = 1000;
        final float Comision = 150;
        double ValorVenta,venta,valorTotal;

        System.out.print("ingrese el valor de la venta ");
        ValorVenta = entrada.nextDouble();
        
        venta= ValorVenta*150;
        valorTotal=venta*5/100;
        
        System.out.print("el valor total a pagar es; "+valorTotal );

    }
}
