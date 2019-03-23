/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.rc_86182;

import java.util.Scanner;

/**
 * Calculadora de juros
 * @author rc
 */
public class Ex2_4 {

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
         * Declaração de variáveis:
         *  M - Montante investido
         *  T - Taxa de juros mensal
         *  i - counter
         */
        double M, T, i=0;
        
        System.out.print("Montante investido: ");
        M = sc.nextDouble(); // Lê o montante investido
        
        System.out.print("Taxa de juros: ");
        T = sc.nextDouble(); // Lê a taxa de juros mensal
        
        while (i<3){
            M = M * (T/100) + M; // Cálculo da taxa de juros ao fim de 3 meses.
            i++;
        }
        
        System.out.print("Valor ao fim de 3 meses: "+ M);
        
        /**
         * Fecha o scanner.
         */
        sc.close();
    }
    
}
