/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.rc_86182;

import java.util.Scanner;
import java.lang.Math;

/**
 * Calculadora de hipotenusa.
 * @author rc
 */
public class Ex2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Scanner que irá ler todos os dados necessários.
         * 
         * Nota: Não é necessário abrir mais que um Scanner para 
         *       ler vários dados, podemos usar sempre o mesmo.
         */
        Scanner sc = new Scanner(System.in);
        
        /**
         * Declaração das variáveis:
         *  A   - Cateto A
         *  B   - Cateto B
         *  C   - Hipotenusa
         *  ang - Ângulo
         */
        double A, B, C, ang;
        
        System.out.print("Cateto A: ");
        A = sc.nextDouble(); // Lê o cateto A
        
        System.out.print("Cateto B: ");
        B = sc.nextDouble(); // Lê o cateto B
        
        /**
         * Notas:
         *      Math.sqrt() - Raíz quadrada
         *      Math.pow(x,2) - Cálcula o quadrado de um número x
         * 
         * C^2 = A^2 + B^2 => C = sqrt(A^2 + B^2)
         */
        C = Math.sqrt(Math.pow(A,2) + Math.pow(B,2)); // Aplicação direta da fórmula da hipotenusa
        
        /**
         * Nota:
         *      Math.acos() - Cálcula o arcosseno de um valor
         * 
         * cos(ang) = (A/C) => ang = acos(A/C)
         */
        ang = Math.acos(A/C); //Aplicação direta da fórmula
        
        System.out.println("Hipotenusa: " + C);
        System.out.println("Ângulo: " + ang);
        
        /**
         * Fecha o scanner.
         */
        sc.close();
    }
    
}
