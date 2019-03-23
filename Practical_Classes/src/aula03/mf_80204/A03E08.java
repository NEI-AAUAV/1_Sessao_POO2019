package aula03.mf_80204;

import java.util.Random;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import com.sun.xml.internal.fastinfoset.Notation;

// Miguel Fradinho Alves - 80204
/*
 * Exercício 3.8 - Pauta de Notas
 * 
 * Notas Gerais:
 * 
 * 1 - O Random.nextDouble() devolve valores entre [0,1[, mas nós precisamos de
 * valores entre [0,20] Se multiplicarmos por 20, os valore que vamos ter vão
 * ser entre [0,20[, ainda não resolve o nosso problema. Por isso, temos que
 * multiplicar por algo maior que 20.0, de forma a que o 20.0 esteja na gama de
 * valores gerada, e alterar o valor para 20.0 caso seja maior do que 20.0.
 * 
 */
public class A03E08 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[][] notas = new double[16][2];
        // Gerar as notas aleatórias
        //
        // notas[i][0]  - Nota Teórica
        // notas[i][0]  - Nota Prática
        for (int i = 0; i < notas.length; i++) {
            // Neste caso, optamos por multiplicar por 21, mas seria mais correto
            // multiplicar por algo como 20 + 0.0000001, pois como estamos a reduzir todos
            // os maiores que 20.0 para 20.0, estamos a ter um "bias" para o 20.0
            // (isto é, há maior probabilidade de sair 20 do que qualquer outro número,
            // porque estamos a assumir 20.0, 20.1, 20.01, 20.023, etc, todos como 20)
            double randT = rand.nextDouble() * 21;
            if (randT > 20.0) {
                randT = 20.0;
            }
            // mesma coisa para a nota prática
            double randP = rand.nextDouble() * 21;
            if (randP > 20.0) {
                randP = 20.0;
            }
            // e guardamos no array
            notas[i][0] = randT;
            notas[i][1] = randP;
        }
        // imprimir o cabeçalho
        System.out.println("NotaT\tNotaP\tPauta");
        // Agora, vamos a cada uma das notas e imprimimos
        for (int i = 0; i < notas.length; i++) {
            // Variável temporária onde vamos guardar a nota a imprimir
            // Nota: tem que ser do tipo long porque Math.round() devolve um long 
            long notaPauta;
            double notaT = notas[i][0];
            double notaP = notas[i][1];
            
            // Caso o aluno tenha reprovado por nota mínima, a nota da pauta é 66
            if (notaT < 7 || notaP < 7) {
                notaPauta = 66L;
            }
            // caso contrário, calculamos a nota da pauta com as 2 componentes
            else {
                notaPauta = (int) Math.round(0.4 * notaT + 0.6 * notaP);
            }
            // por fim, imprimimos, com 2 casas decimais
            System.out.printf("%.1f\t%.1f\t%d\n", notaT, notaP, notaPauta);
        }
    }

}
