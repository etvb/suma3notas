
package principal;

import java.util.Scanner;


public class Suma {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        float nota1, nota2, nota3, nota4, nota5, suma;
        
        System.out.println("Ingresa 3 calificaciones");
        
        System.out.print("Nota1: ");
        nota1 = entrada.nextFloat();
        System.out.print("Nota2: ");
        nota2 = entrada.nextFloat();
        System.out.print("Nota3: ");
        nota3 = entrada.nextFloat();
        nota4 = (float) Math.random() * 10;
        nota5 =(float) Math.random() * 10;
        System.out.println(nota4);
        System.out.println(nota5);

        suma = nota1 + nota2 + nota3 + nota4;
        
        System.out.println("La suma es: " + suma);
        
    }
}
