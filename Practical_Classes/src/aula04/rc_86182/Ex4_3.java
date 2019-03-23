/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.rc_86182;

import java.util.Scanner;

/**
 * Exercício 4.3.
 * @author rc
 */
public class Ex4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Scanner que nos vai permitir ler a frase inserida pelo utilizador.
         */
        Scanner sc = new Scanner(System.in);
        
        /**
         * Declaração de variáveis:
         *  frase    - Frase inserida pelo utilizador.
         *  acronimo - Acrónimo pedido.
         */
        String frase, acronimo = "";
        
        /**
         * Declaração de variáveis:
         *  words - Palavras que vão ser usadas para extrair as siglas.
         */
        String [] words;
        
        System.out.print("Frase: ");
        frase = sc.nextLine(); //Lê a frase inserida pelo utilizador
        
        frase = frase.replaceAll("\\s+", " ");
        words = frase.split(" "); //Faz split das palavras pelo espaço e guarda no array.
        
        for(String word:words) {
            /**
             * Verifica se a palavra tem um comprimento maior ou igual a 3
             * e se começa por letra maiúscula, caso isso se verifique
             * temos que a primeira letra dessa palavra fará parte do acrónimo.
             */
            if(word.length()>=3 && Character.isUpperCase(word.charAt(0))) {
                acronimo += word.charAt(0); //Concatena as letras do acrónimo
            }
        }
        
        System.out.println(acronimo);
		
    }
}
    
