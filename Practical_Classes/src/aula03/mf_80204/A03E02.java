package aula03.mf_80204;

import java.util.Scanner;

// Miguel Fradinho Alves - 80204
/*
 * Exercício 3.2 - Contagem Decrescente
 * 
 * Notas Gerais:
 * 
 * 1 - Validação da contagem decrescente possivelmente desnecessária, mas fica
 * bonitito.
 * 
 * 
 * Desafio Extra 1 (Médio):
 * A contagem decrescrente neste momento é muito rápida (os processadores são mais rápidos que nós).
 * E se fizessemos uma contagem decrescente em que esperava 1 segundo de cada vez?
 * 
 */
public class A03E02 {

    public static void main(String[] args) {
        // Abrimos o Scanner para ler
        Scanner sc = new Scanner(System.in);
        // variável de contagem
        int count = 0;
        // Enquanto o utilizador não introduzir um número válido para a contagem
        // (maior que 0), continuamos a pedir
        do {
            System.out.println("Contar a partir de ?");
            count = sc.nextInt();
        } while (count < 1);
        // fechamos o scanner porque já não vamos precisar de ler mais
        sc.close();

        // Imprimimos a contagem até chegar 0
        do {
            // Recorremos ao operador ternário para decidir o que vamos imprimir
            // Se for 0, imprimimos "FIM!"
            // caso contrário, apenas imprimimos a contagem
            System.out.println(count == 0 ? "FIM!" : count);

            // Usando if-else, seria
            //  if (count == 0)
            //      System.out.println("FIM!");
            //  else
            //      System.out.println(count);
           
            // e decrementamos a variável
            count--;
        } while (count >= 0);

        // Versão 2, com ciclo while
        /*
        while (count >= 0) {
            System.out.println(count == 0 ? "FIM!" : count);
            count--;
        }
        */
        // Versão 3, uma versão com ciclo for
        /*
        for (int i = count; i >= 0; i--) {
            System.out.println(i == 0 ? "FIM!" : i);
        }
        */

    }

}
