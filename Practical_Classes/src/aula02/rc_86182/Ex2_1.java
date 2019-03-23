/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.rc_86182;

import java.util.Scanner;

/**
 * Conversor de quilómetros para milhas.
 * @author rc
 */
public class Ex2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Scanner que vai ler os kms introduzidos pelo utilizador.
         */
        Scanner kmReader = new Scanner(System.in);
        
        /**
         * Declaração da variável kms.
         */
        int km;
        
        /**
         * Declaração da variável miles.
         */
        double miles;
        
        System.out.print("Km: ");
        km = kmReader.nextInt(); //Lê um int introduzido pelo utizador
        
        miles = km / 1.609; // milhas = quilómetro / 1.609
        
        System.out.println("O valor de " + km + " quilómetros corresponde a " + miles + " milhas");
        
        /**
         * Fecha o scanner.
         */
        kmReader.close();
    }
    
}
