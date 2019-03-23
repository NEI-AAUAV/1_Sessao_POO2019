/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.rc_86182;

import java.util.Scanner;

/**
 * Exercício 4.2.
 * @author rc
 */
public class Ex4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Scanner que permite ler a frase introduzida pelo user.
         */
        Scanner sc = new Scanner (System.in);
        
        /**
         * Declaração de variáveis:
         *  text          - Frase inserida pelo utilizador
         *  withoutSpaces - Frase inserida pelo utilizador sem espaços duplicados
         */
        String text, withoutSpaces;
        
        /**
         * Declaração de variáveis:
         *  numberOfDigits - Número de dígitos da frase
         *  numberOfSpaces - Número de espaços da frase
         */
        int numberOfDigits, numberOfSpaces;
        
        /**
         * Declaração de variáveis:
         *  isLowerCase  - Indica se estão todas em letra minuscula.
         *  isPalindrome - Indica se é um palíndromo ou não.
         */
        boolean isLowerCase, isPalindrome;
        
        System.out.print("Frase: ");
        text = sc.nextLine(); //Lê a frase instroduzida pelo utilizador
        
        numberOfDigits = countDigits(text); //Chamada da função que conta dígitos
        System.out.println("Número de dígitos: " + numberOfDigits);
        
        numberOfSpaces = countSpaces(text); //Chamada da função que conta espaços
        System.out.println("Número de espaços: " + numberOfSpaces);
        
        isLowerCase = allInLowerCase(text);
        if (isLowerCase) //Igual a termos isLowerCase == true
            System.out.println("Só tem letras minúsculas");
        else
            System.out.println("Não tem apenas letras minúsculas");
        
        withoutSpaces = removeDuplicatedSpaces(text);
        System.out.println("Frase sem espaços duplicados: " + withoutSpaces);
        
        isPalindrome = isPalindromo(text);
        if(isPalindrome) //Igual a termos isPalindrome == true
            System.out.println("É um palíndromo");
        else
            System.out.println("Não é um palíndromo");
    }
    
    /**
     * Função que conta o número de dígitos.
     * 
     * @param text - Frase introduzida pelo utilizador.
     * 
     * @return digits - Número de dígitos na frase.
     */
    public static int countDigits(String text){
        /**
         * Declaração de variáveis:
         *  digits - Número de dígitos
         *  i      - Valor de incremento do for.
         */
        int digits = 0, i;
        for(i=0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i))) {
                digits++;
            }
        }
        return digits;
    }
    
    /**
     * Função que conta o número de espaços numa String.
     * 
     * @param text - Frase introduzida pelo utilizador
     * 
     * @return spaces - Número de espaços numa frase
     */
    public static int countSpaces(String text){
        /**
         * Declaração de variáveis:
         *  spaces - Número de espaços
         *  i      - Valor de incremento do for.
         */
        int spaces = 0, i;
        
        for(i=0; i < text.length(); i++) {
            String chare = Character.toString(text.charAt(i));
            if(chare.equals(" ")) {
                spaces++;
            }
        }
        return spaces;
    }
    
    /**
     * Função que verifica se todas as letras estão em minúsculas.
     * 
     * @param text - Texto a verificar se tem todas as letras em minúsculas.
     * 
     * @return true  - Se todas as letras forem minúsculas
     *         false - Se as letras não forem todas minúsculas
     */
    public static boolean allInLowerCase(String text){
        /**
         * Passagem da variável text para tudo em minúsculas.
         */
        String comparador = text.toLowerCase();
        
        //Se o comparador (que tem tudo em minúsculas) for igual ao text
        //significa que está tudo em minúsculas.
        return comparador.equals(text);
    }
    
    /**
     * Remove as ocorrências de espaços duplicados por um único.
     * 
     * @param text - Frase introduzida pelo utilizador.
     * 
     * @return frase sem espaços duplicados
     */
    public static String removeDuplicatedSpaces(String text) {
        return text.replaceAll("[ ]{2,}", " ");
    }
    
    /**
     * Função que verifica se a função é um palíndromo.
     * 
     * Descrição genérica do funcionamento:
     * Verificamos se todos os primeiros carecateres 
     * (até ao meio da string) são iguais aos últimos,
     * isto é, os caracteres do meio da string para a
     * frente. Caso o comprimento da string seja ímpar,
     * o caracter que fica imediatmente no meio não
     * é verificado uma vez que pode ser qualquer um.
     * 
     * @param text - Frase introduzida pelo utilizador.
     * 
     * @return true - Se é palímdromo
     *         false - Se não é palíndromo
     */
    public static boolean isPalindromo(String text) {
        /**
         * Comprimento da String.
         */
        int len = text.length();
        
        for (int i = 0; i < len/2; i++)
            if (text.charAt(i) != text.charAt(len-i-1))
                return false;
        return true;
        
    }
    
}
