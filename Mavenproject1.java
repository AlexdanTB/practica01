/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        // Calcular area de triangulo
        
        double baset;
        double alturat;
        double respuesta;
        
        double radioc;
        double areac;
        double pi = 3.1415;
        
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingresar la base del triangulo");
        
        baset = ingreso.nextDouble();
        
        System.out.println("Ingresar la altura del triangulo");
        
        alturat = ingreso.nextDouble();
        
        respuesta = (baset*alturat)/2;
        System.out.println("El area del triangulo es igual a "+respuesta+ "cm2");
        System.out.println("--------------------0000000------------------------");
        
        // Calcular area del circulo
        System.out.println("Ingresar el radio del circulo");
        radioc = ingreso.nextDouble();
        
        areac = pi*(radioc*radioc);
        
        System.out.println("El area del circulo es igual a "+areac+"cm2");
        
    }
}
