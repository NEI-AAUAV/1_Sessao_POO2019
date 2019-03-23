/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.rc_86182;

import java.util.Scanner;

/**
 * Exercício 4.4.
 * @author rc
 */
public class Ex4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String value1 = "Ano: ", value2 = "Mês: ", 
                value3="1 = Segunda\n"
                + "2 = Terça\n"
                + "3 = Quarta\n"
                + "4 = Quinta\n"
                + "5 = Sexta\n"
                + "6 = Sábado\n"
                + "7 = Domingo\n"
                + "Dia em que começa: ";
        
        int ano = reader(value1);
        int mes = reader(value2);
        int dia = reader(value3);
        
        printCalendar(ano, mes, dia);
    
    }
    
    /**
     * Função que lê o ano, mês e dia 
     * após introdução por parte do utilizador.
     * 
     * @return readValue - Valor introduzido pelo utilizador.
     */
    public static int reader(String value){
        System.out.print(value);
        Scanner sc = new Scanner(System.in);
        int readValue = sc.nextInt();
        return readValue;
        
    }

    public static void printCalendar(int ano, int mes, int inicio) {
        
        /**
         * Declaração de variáveis:
         *  num_dias - Número de dias de um mês
         *  i        - counter para os ciclos
         *  counter  - contador para o ciclo for 
         *             (na realidade é um apontador para o dia de início.
         */
        int num_dias, i, counter;
        
        /**
         * StringBuilder do calendário.
         */
        StringBuilder calendar = new StringBuilder();
        
        /**
         * Impressão do cabeçalho do calendário.
         */
        System.out.println(" Mo Tu We Th Fr Sa Su");

        /**
         * Número de dias que tem um mês.
         * 
         * Chama a função que faz essa verificação -> daysOfMonth(mes, ano)
         */
	num_dias = daysOfMonth(mes, ano);

        counter = inicio;

        for (i = 1; i < inicio; i++)
            calendar.append("   "); //Guarda a primeira linha
        
        /**
         * Este for permite acrescentar ao dia ao calendário
         * 
         * Nota: Caso o dia tenha apenas um dígito, 
         * por questões de formatação é adicionado um espaço em 
         * branco antes do dígito:
         *      (i < 10) ? " "+i : i
         */
        for (i = 1; i <= num_dias; i++, counter++) {
            calendar.append(" ").append((i < 10) ? " " + i : i);
            if (counter == 7) {
                calendar.append("\n");
                counter = 0;
            }
        }

        for (i = counter; i <= 7; i++)
            calendar.append("   "); // Adicionar espacos na última linha

        System.out.println(calendar.toString()); // Imprimir calendario
    }

    /**
     * Função que calcula os dias de um mês.
     * 
     * @param mes - Mês que queremos saber quantos dias tem.
     * @param ano - Ano em que queremos saber o número de dias de um certo mês.
     * 
     * @return dias - Número que dias que tem um mês. 
     */
    public static int daysOfMonth(int mes, int ano){
        int dias = (new int[] {0, 31, isLeapYear(ano) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31})[mes];
        return dias;
    }
    
    /**
     * Verifica se um ano é bissexto.
     * 
     * @param ano - Ano a verificar se é bissexto.
     * 
     * @return true - Se for bissexto
     *         falso - Se não for bissexto;
     */
    public static boolean isLeapYear(int ano) {
            if (ano % 4 != 0) return false;
            if (ano % 100 != 0) return true;
            if (ano % 400 != 0) return false;
            return true;
    }
}
