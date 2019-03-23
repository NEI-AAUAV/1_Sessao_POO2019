/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.rc_86182;

import java.util.Scanner;

/**
 * Conversor de tempo.
 * @author rc
 */
public class Ex2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Scanner que irá permitir ler o tempo em segundos.
         */
        Scanner sc = new Scanner(System.in);
        /**
         * Declaração das variáveis:
         *  H - horas
         *  M - minutos
         *  S - segundos
         *  TS - tempo em segundos
         */
        int H, M, S, TS;
        
        System.out.print("Tempo em segundos: ");
        TS = sc.nextInt(); // Lê o tempo em segundos
        
        H = (int)Math.floor(TS / (60*60)); // Cáculo das horas
        M = (int)Math.floor((TS % (60*60)) / 60); // Cálculo dos minutos
        S = (int)Math.floor(TS % (60*60) % 60); // Cálculo dos segundos
        
        System.out.println("Tempo: "+ H+":"+M+":"+S);
        
        /**
         * Fecha o scanner.
         */
        sc.close();
    }
    
}
