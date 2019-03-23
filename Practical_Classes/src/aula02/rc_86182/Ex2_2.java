/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.rc_86182;

import java.util.Scanner;

/**
 * Conversor de graus Celsius para Fahrenheit.
 * @author rc
 */
public class Ex2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Scanner que irá ler a temperatura inserida em graus Celsius pelo utilizador.
         */
        Scanner celsiusReader = new Scanner(System.in);
        
        /**
         * Declaração das variáveis Celsius (C), Fahrenheit(F).
         */
        double F, C;
        
        System.out.print("Temperatura em Celsius: ");
        C = celsiusReader.nextDouble(); //Lê o valor da temperatura inserido pelo utilizador.
        
        F = 1.8 * C + 32; // F = 1.8 * C + 32 
        
        System.out.println(C + " graus Celsius correspondem a " + F + " graus Fahrenheit");
        
        /**
         * Fecha o scanner.
         */
        celsiusReader.close();
    }
    
}
