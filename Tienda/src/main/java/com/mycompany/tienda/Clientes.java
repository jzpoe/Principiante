/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author Jz
 */
public class Clientes {
    
    String Producto;
    int VlosUnitario;
    int Cantidad;
    double VlrTotal;

    public Clientes() {
    }

    
    
    public Clientes(String Producto, int VlosUnitario, int Cantidad, double VlrTotal) {
        this.Producto = Producto;
        this.VlosUnitario = VlosUnitario;
        this.Cantidad = Cantidad;
        this.VlrTotal = VlrTotal;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getVlosUnitario() {
        return VlosUnitario;
    }

    public void setVlosUnitario(int VlosUnitario) {
        this.VlosUnitario = VlosUnitario;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getVlrTotal() {
        return VlrTotal;
    }

    public void setVlrTotal(double VlrTotal) {
        this.VlrTotal = VlrTotal;
    }

    @Override
    public String toString() {
        return "Clientes{" + "Producto=" + Producto + ", VlosUnitario=" + VlosUnitario + ", Cantidad=" + Cantidad + ", VlrTotal=" + VlrTotal + '}';
    }
    
    
}
