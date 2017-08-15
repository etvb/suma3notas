/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author edgardo
 */
public class Suma {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        float nota1, nota2, nota3, suma;
        
        System.out.println("Ingresa 3 calificaciones");
        
        System.out.print("Nota1: ");
        nota1 = entrada.nextFloat();
        System.out.print("Nota2: ");
        nota2 = entrada.nextFloat();
        System.out.print("Nota3: ");
        nota3 = entrada.nextFloat();
        suma = nota1 + nota2 + nota3;
        
        System.out.println("La suma es: " + suma);
        
    }
}
