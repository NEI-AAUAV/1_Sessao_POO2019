package aula03.mf_80204;

import java.util.Scanner;

// Miguel Fradinho Alves - 80204
/*
 * Exercício 3.3 - Teste do número primo
 * 
 * Notas Gerais:
 * 
 * Nada a acrescentar.
 * 
 * Desafio Extra 1 (Fácil):
 * 
 * O número 1 231 231 232 é divisível por 2, logo não é primo.
 * 
 * Já o número 1 231 231 237 é primo!
 * 
 * No entanto, eles demoram sensivelmente o mesmo tempo a descobrir se são
 * primos ou não.
 * 
 * Como é que podemos evitar isto?
 * 
 * Dica: apenas precisas de escrever 1 palavra
 * 
 */
public class A03E03 {

    public static void main(String[] args) {
        // Abrimos o Scanner para leitura
        Scanner sc = new Scanner(System.in);
        // Número que vamos ler
        int num;
        // Variável de controlo para saber se é primo ou não
        boolean primo = true;
        // Continuamos a ler enquanto o número não for positivo
        do {
            System.out.println("Número: ");
            num = sc.nextInt();
        } while (num < 0);
        // fechamos o Scanner porque já não vamos ler mais
        sc.close();

        // Vemos se ele é primo
        for (int i = 2; i < num; i++) {
            // se ele tiver um divisor para além de ele próprio, então não é primo
            if ((num % i) == 0) {
                primo = false;
            }
        }
        System.out.println(primo ? "é primo!" : "Não é primo :(");

    }

}
