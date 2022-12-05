package com.mycompany.poo;

public class POO {

    public static void main(String[] args) {

        Alumno alu1 = new Alumno(33, "sandra", "daza");
        Alumno alu2 = new Alumno(35, "Jose", "Rodriguez");

        System.out.println("la id del alumno dos es: " + alu2.getId());
        System.out.println("el nombre del alumno es: "+ alu2.getNombre());
        System.out.println("el apellido del alumno es : " + alu2.getApellido());
    }
}
