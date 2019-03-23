package aula03.mf_80204;

import java.util.Scanner;

// Miguel Fradinho Alves - 80204
/*
 * Exercício 3.7 - Alto e Baixo
 * 
 * Notas Gerais:
 * 
 * Nada a acrescentar.
 * 
 * 
 * Desafio Extra 1 (Fácil-Médio):
 * 
 * Altera o programa para mostrar, quando é pedido um número ao utilizador, o
 * número de tentativas atuais.
 * 
 * Dica: Começa por alterar a inicialização da variável totalTentativas
 * 
 * Faz as alterações que achares necessárias, desde que continues a usar os
 * ciclos do-while! (nada de trocar para ciclos while)
 * 
 * Desafio Extra 2 (Médio):
 * 
 * Para não estarmos a demorar muito até acertamos, adiciona um limite de
 * tentativas. Após atingido esse limite, quer o utilizador tenha acertado ou
 * não, o jogo acaba.
 * 
 * Dica: cria uma variável de controlo para saberes quando o utilizador acertou
 * 
 * 
 * Desafio Extra 2 (Médio-Díficil):
 * 
 * A forma como estamos a decidir se o utilizador quer continuar é não, é muito
 * rudimentar, o utilizador pode-se enganar (e.g escrever "sim" invés de "Sim").
 * 
 * Altera o programa de forma a só sair quando o utilizador escrever "N" ou
 * "Não".
 * 
 * Faz as alterações que achares necessárias
 * 
 * Dica: Começa por rescrever os ciclos do-while em ciclos while. 
 * 
 * Semelhante ao Desafio Extra 1 do Exercício 3.4.
 * 
 */
public class A03E07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variável para a resposta do utilizador se pretender continuar a jogar ou não
        // Nota: Precisa de estar definida aqui para a podermos utilizar na condição
        // while do ciclo do-while
        String continuarAJogar;
        // Número que o utilizador tem que tentar adivinhar
        int numeroEscolhido;

        // Tentativas totais
        int totalTentativas;
        do {
            // Nota: O Math.random() devolve um double entre [0,1[, mas nós queremos um
            // inteiro entre [1,100]
            // Se fizermos:
            // (int) Math.random()
            // como devolve valores entre [0,1[, o resultado seria sempre 0, porque a parte
            // inteira é sempre 0
            // Por isso, primeiro multiplicamos por 100 para obtermos valores entre [0,100[
            // Adicionamos +1 para termos valores entre [1,101[
            // E obtemos a parte inteira, tendo assim efetivamente valores entre [1,100]
            numeroEscolhido = (int) ((100.0 * Math.random()) + 1);

            // Acabamos de começar um jogo novo, por isso o número de tentativas feitas é 0
            totalTentativas = 0;

            // Variável para cada tentativa do utilizador
            int tentativa;

            do {
                // Pedimos ao utilizador um número
                System.out.print("Introduza um número: ");
                tentativa = sc.nextInt();
                // como pedimos, aumentamos o número de tentativas
                totalTentativas++;
                // Se a tentativa foi mais baixa
                if (tentativa < numeroEscolhido) {
                    System.out.println("Demasiado baixo! Tenta outra vez!");
                }
                // Se foi mais alta
                else if (tentativa > numeroEscolhido) {
                    System.out.println("Demasiado alto! Tenta outra vez!");
                }
                // vamos estar a pedir ao utilizador um número enquanto ele não acertar
            } while (tentativa != numeroEscolhido);

            // Saímos do ciclo, por isso a tentativa está certa
            System.out.println("Certo! Número de tentativas: " + totalTentativas);
            // Perguntamos se o utilizador quer continuar
            System.out.println("Pretende continuar? Prima (S)im");
            continuarAJogar = sc.next();
        } while (continuarAJogar.equals("Sim") || continuarAJogar.equals("S"));

        // estamos a terminar o programa, por isso já não vamos precisar mais do Scanner
        sc.close();

    }
}
