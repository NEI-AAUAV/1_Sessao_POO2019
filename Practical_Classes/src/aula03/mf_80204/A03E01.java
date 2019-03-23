package aula03.mf_80204;

import java.util.Scanner;

// Miguel Fradinho Alves - 80204
/*
 * Exercício 3.1 - Média de Notas
 * 
 * Notas Gerais:
 * 
 * 1 - Podia-se ter feito a repetição das leituras das notas caso não fossem
 * válidas (de [0,20]), mas como o exercício 3.3 já pede isso, optou-se por não
 * fazer aqui.
 * 
 */
public class A03E01 {
    public static void main(String[] args) {
        // valor a ler da nota teórica
        double notaT;
        // valor a ler da nota prática
        double notaP;
        // Abrimos o Scanner para ler e lemos as 2 notas
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota Teórica(40%)");
        notaT = sc.nextDouble();

        System.out.println("Nota Prática(60%)");
        notaP = sc.nextDouble();

        // Fechamos o scanner porque já não precisamos de ler
        sc.close();
        // Se não forem válidas
        if ((notaT < 0 || notaT > 20) || (notaP < 0 || notaP > 20)) {
            System.out.println("Erro:A notas devem ter valores de 0 e 20! E.g 13.45");
        }
        // Se forem válidas
        else {
            // Reprovado por nota mínima se teve menos do que 7.0 em qualquer das
            // componentes
            if (notaT < 7 || notaP < 7)
                System.out.println("66");
            // passado, imprimir média
            else
                System.out.println(Math.round(0.4 * notaT + 0.6 * notaP));
        }

    }

}
