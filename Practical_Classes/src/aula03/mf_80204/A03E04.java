package aula03.mf_80204;

import java.util.Scanner;

// Miguel Fradinho Alves - 80204
/*
 * Exercício 3.4 - Ler números até repetir o primeiro (exclusive)
 * 
 * Notas Gerais:
 * 
 * 1 - não foi utilizado o operador += por uma questão de leitura mais
 * explicita, pelo menos nesta fase. Em futuros exercícios, poderá aparecer.
 * 
 * Desafio Extra 1 (Médio-Díficil):
 * 
 * Após termos lido o primeiro número, quando estamos a ler os restantes, existe
 * alguma repetição do código, pois não estamos a ler todos os números novos
 * dentro do ciclo (a primeira vezque lemos um número novo, é feita fora do
 * ciclo).
 * 
 * Como podemos ler todos os novos números dentro do ciclo?
 * 
 * Dica: A lógica mantém-se, apenas precisas de a mudar de sítio para um
 * bocadinho "ao lado". Involve mudar uma condição e acrescentar uma condição.
 * 
 * 
 * Desafio Extra 2 (Díficil):
 * 
 * Atualmente não estamos a guardar a lista dos números lidos.
 * Altera o programa para imprimir a lista dos números lidos.
 * Faz as alterações que achares necessárias.
 * 
 */
public class A03E04 {
    public static void main(String[] args) {
        // Scanner que vamos utilizar para a leitura
        Scanner sc = new Scanner(System.in);
        // Soma para calcular a média
        double soma = 0.0;
        // total de números lidos
        int totais = 0;
        // Minimo
        double minimo;
        // Máximo
        double maximo;

        // O primeiro número lido
        double inicial;

        // Número a ser lido do teclado
        double num;
        System.out.print("Primeiro número: ");
        num = sc.nextDouble();
        // Como acabamos de ler o primeiro número, temos que fazer algumas coisas:

        // Em primeiro lugar, guardamos esse valor, para podermos comparar mais tarde
        // com os próximos valores a ler
        inicial = num;

        // Segundo, como acabamos de ler um valor, temos que atualizar a variável dos
        // números lidos
        totais++;
        // e também adicionar o valor lido à soma de todos os números
        soma = soma + num;

        // Terceiro, como até agora ainda não lemos mais nenhum número (pois este é o
        // primeiro), este vai ser o nosso mínimo e máximo
        minimo = num;
        maximo = num;

        // agora, temos que continuar a ler até lermos um número igual ao inicial

        // voltamos a ler
        System.out.print("Novo número: ");
        num = sc.nextDouble();
        // enquanto lermos valores diferentes
        while (num != inicial) {
            // acabamos de ler um número novo, por isso contamos
            totais++;
            // adicionamos à soma
            soma = soma + num;

            // se ele for mais baixo do que o nosso mínimo, então ele passa a ser o nosso
            // mínimo
            if (num < minimo) {
                minimo = num;
            }
            // se ele for mais alto do que o nosso máximo, então ele passa a ser o nosso
            // máximo
            if (num > maximo) {
                maximo = num;
            }
            // e voltamos a ler um número novo
            System.out.print("Novo número: ");
            num = sc.nextDouble();
        }
        // saimos do ciclo, por isso não vamos precisar de ler mais
        sc.close();
        System.out.println("Minimo: " + minimo);
        System.out.println("Média: " + soma / totais);
        System.out.println("Máximo: " + maximo);
        System.out.println("Total números lidos: " + totais);
    }
}