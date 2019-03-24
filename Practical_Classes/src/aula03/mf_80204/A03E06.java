package aula03.mf_80204;

import java.util.Scanner;

// Miguel Fradinho Alves - 80204
/*
 * Exercício 3.6 - Ler Mês e Ano, escrever dias do Mês
 * 
 * Notas Gerais:
 * 
 * 1 - A verificação do ano bissexto foi escrita recorrendo a if-elseif-else por
 * questões de ser mais fácil de ler e seguir o raciocínio (opinião pessoal),
 * mas podiamos sem problema algum juntar os dois casos em que é bissexto
 * recorrendo aos operadores booleanos e repetindo a primeira condição, mas
 * negada.
 * 
 * 2 - Tecnicamente, para este exercício, nem precisavamos de ver se ele era
 * bissexto ou não, a não ser quando o mês introduzido era 2 (fevereiro).
 * 
 * Mas fica bonito (opinião pessoal) fazermos essa verificação independentemente
 * do mês porque um ano não deixa de ser bissexto só porque estamos a ver os
 * dias de Agosto.
 * 
 * 3 - A razão para utilizarmos um switch invés de if-elseifs-else (ou com
 * disjunções) é por convenção. Em linguagens que suportem a instrução
 * switch-case, é comum recorrer à sua utilização quando a lista de opções é
 * 
 * Desafio Extra 1 (Médio):
 * 
 * Inicializar as variáveis é, geralmente, uma boa prática da programação.
 * 
 * Mas neste caso, essa inicialização é redudante, porque vamos logo de seguida
 * (possivelmente) substituir esse valor com um lido do utilizador.
 * 
 * No entanto, esta inicialização é necessária, pois caso contrário o compilador
 * queixa-se da possibilidade de estarmos a usar a variável sem a termos
 * inicializado, mesmo nós sabendo que isso nunca irá acontecer.
 * 
 * Será possível reescrever de forma a que esta inicialização não seja
 * necessária?
 * 
 * Dica: Caso tenhas feito o Desafio Extra 1 do Exercício 3.4 de uma determinada
 * forma, a solução será idêntica.
 * 
 * 
 * Desafio Extra 2 (Fácil):
 * 
 * Escrever o switch de forma a que cada case seja auto-contido (isto é, ter um
 * break no final, antes de começar outro case) é considerado uma boa prática de
 * programação, pois ajuda a evitar erros do programador (por exemplo, em
 * situações que os cases são mutuamente exclusivos).
 * 
 * Mas neste caso em específico, existe bastante repetição de código quanto à
 * atribuição dos dias.
 * 
 * Será possível, recorrendo na mesma ao switch, reduzirmos a quantidade que
 * temos que escrever?
 * 
 * Dica: Caso tenhas dificuldades, vê o Slide 11 da Aula TP 2,
 * POO_02_ControloFluxo
 * 
 * Desafio Extra 3 (Fácil):
 * 
 * Imprime também o mês por extenso (Janeiro, Fevereiro, etc).
 * 
 * Desafio Extra 4 (Fácil-Médio):
 * 
 * Caso já não o tenhas feito no Desafio Extra 3, guarda agora os nomes do mês
 * num array. Faz as alterações que achares necessárias.
 * 
 */
public class A03E06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variável de controlo
        boolean mesValido = false;
        // Variável para o mês lido.
        // Nota: precisamos de inicializar a variável porque, caso contrário, o
        // compilador queixa-se
        int mes = -1;
        while (!mesValido) {
            System.out.println("Mês?(de 1 a 12): ");
            mes = sc.nextInt();
            if (mes >= 1 && mes <= 12) {
                mesValido = true;
            }
        }
        // Variável de controlo
        boolean anoValido = false;
        // Variável para o ano lido
        // Nota: precisamos de inicializar a variável porque, caso contrário, o
        // compilador queixa-se
        int ano = -1;
        while (!anoValido) {
            System.out.println("Ano?: ");
            ano = sc.nextInt();
            if (ano > 0) {
                anoValido = true;
            }
        }
        // Já não precisamos de ler mais, por isso podemos fechar o scanner
        sc.close();

        // Variável de controlo
        boolean bissexto;
        // Agora que sabemos o ano, podemos saber se ele é bissexto ou não
        if (ano % 400 == 0) {
            bissexto = true;
        }
        else if ((ano % 4 == 0) && (ano % 100 != 0)) {
            bissexto = true;
        }
        else {
            bissexto = false;
        }

        // Variável para os dias do mês
        // Nota: precisamos de inicializar a variável porque, caso contrário, o
        // compilador queixa-se
        int dias = -1;
        // Já sabemos se ele é bissexto ou não, por isso vamos agora descobrir os dias
        switch (mes) {
            case 1:
                dias = 31;
                break;
            case 2:
                // Operador ternário facilita não termos que escrever o if-else
                dias = bissexto ? 29 : 28;
                break;
            case 3:
                dias = 31;
                break;
            case 4:
                dias = 30;
                break;
            case 5:
                dias = 31;
                break;
            case 6:
                dias = 30;
                break;
            case 7:
                dias = 31;
                break;
            case 8:
                dias = 31;
                break;
            case 9:
                dias = 30;
                break;
            case 10:
                dias = 31;
                break;
            case 11:
                dias = 30;
                break;
            case 12:
                dias = 31;
                break;
        }
        System.out.println("Dias do mês " + mes + " de " + ano + ": " + dias + " dias");

    }

}
