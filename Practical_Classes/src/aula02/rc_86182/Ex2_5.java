/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.rc_86182;

import java.util.Scanner;

/**
 * Calculadora da velocidade média.
 * @author rc
 */
public class Ex2_5 {

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
         *  v1  - Velocidade 1
         *  v2  - Velocidade 2
         *  vmf - Velocidade média final
         */
        double v1, v2, vmf;
        
        System.out.print("V1: ");
        v1 = sc.nextDouble(); // Lê a velocidade 1
        
        System.out.print("V2: ");
        v2 = sc.nextDouble(); // Lê a velocidade 2
        
        /**
         * Nota: A velocidade média final não pode ser dada por:
         *      
         *                  (V1 + V2) / 2
         *
         * Esta fórmula é apenas válida para os intervalos em que
         * elas são iguais.
         */
        vmf = 2*v1*v2 / (v1+v2);
        
        
        System.out.println("Velocidade média final: "+ vmf);
        
        /**
         * Fecha o scanner.
         */
        sc.close();

    }
    
}
