/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulo;


public class calculo {
    
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double altura;
    private double totalAngulo;
    private double anguloA;

    public calculo() {
    }

    @Override
    public String toString() {
        return "calculo{" + "ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + ", altura=" + altura + ", totalAngulo=" + totalAngulo + ", anguloA=" + anguloA + '}';
    }

    
    
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getTotalAngulo() {
        return totalAngulo;
    }

    public void setTotalAngulo(double totalAngulo) {
        this.totalAngulo = totalAngulo;
    }

    public double getAnguloA() {
        return anguloA;
    }

    public void setAnguloA(double anguloA) {
        this.anguloA = anguloA;
    }

    
    
    public calculo(double ladoA, double ladoB, double ladoC, double altura, double totalAngulo, double anguloA) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.altura = altura;
        this.totalAngulo = totalAngulo;
        this.anguloA = anguloA;
    }
    
    
    
    
}
