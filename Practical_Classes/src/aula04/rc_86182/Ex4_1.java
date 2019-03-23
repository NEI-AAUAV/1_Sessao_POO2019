/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.rc_86182;

import java.util.Scanner;

/**
 * Exercício 4.1.
 * @author rc
 */
public class Ex4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Scanner que lê o input necessário.
         */
        Scanner sc = new Scanner(System.in);
        
        /**
         * Declaração de variáveis:
         *  input        - Frase que o utilizador introduz
         *  emMinusculas - Frase convertida para minúsculas
         *  lastChar     - Último caracter de uma frase
         *  initialChars - Três primeiros caracteres de uma frase
         *  novaFrase    - Frase que irá ser concatenada.
         *  concatenada  - Frase concatenada
         *  replaced     - Frase com alterações do método replace
         *  checkValue   - Frase que queremos verificar se está na String
         */
        String input, emMinusculas, lastChar, initialChars, 
                novaFrase, concatenada, replaced, checkValue;
        
        
        System.out.print("Frase: ");
        input = sc.nextLine();
        
        /**
         * toLowerCase() - Método da classe String que transforma 
         *                  todas as letras de uma String em minúsculas.
         */
        emMinusculas = input.toLowerCase();
        System.out.println("Frase em minusculas: " + emMinusculas);
        
        /**
         * substring() - Método que nos permite navegar nas substrings
         *               de uma String.
         */
        lastChar = input.substring(input.length()-1); //encontra o último caracter
        System.out.println("Último caracter: " +  lastChar);
        
        initialChars = input.substring(0, 3); //encontra os três primeiros caracteres
        System.out.println("Três primeiros caracteres: " +  initialChars);
        
        
        // MÉTODOS EXTRA
        
        /**
         * concat() - Permite concatenar String.
         */
        System.out.print("Frase: ");
        novaFrase = sc.nextLine(); //Lê a nova frase
        
        concatenada = input.concat(novaFrase);
        System.out.println("Frase concatenada: " + concatenada);
        
        /**
         * replace() - Permite substituir partes de uma String
         * 
         * Para este exemplo vamos assumir que, na frase concatenada,
         * queremos que o segundo texto que é pedido ao utilizador passe
         * a ser igual ao primeiro.
         * 
         * Exemplo:
         *  input = "ola"
         *  novaFrase = "sou"
         * 
         * Utilizando o método replace deveremos obter:
         *  replaced = "sousou"
         */
        replaced = concatenada.replace(input, novaFrase);
        System.out.println("Método replace: " + replaced);
        
        /**
         * contains() - Verifica se a String contém um certo valor.
         * 
         * Vamos partir do pressuposto que queremos verificar se 
         * o texto que queremos verificar se está contido é na
         * palavra gerada pelo métoddo concat.
         */
        System.out.print("Conteúdo a verificar: ");
        checkValue = sc.nextLine();
        
        if(concatenada.contains(checkValue)){
            System.out.println("Está contido na String");
        } else {
            System.err.println("Não está contido na String");
        }
        
        /**
         * Fecha o scanner.
         */
        sc.close();
    }   
    
}
