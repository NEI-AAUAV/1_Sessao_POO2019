/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.rc_86182;

import java.util.Scanner;
import javax.xml.transform.Source;

/**
 * Calculadora de energia.
 * @author rc
 */
public class Ex2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Scanner que irá ler todos os dados necessários.
         * 
         * Nota: Não é necessário abrir mais que um Scanner para 
         *       ler vários dados, podemos usar sempre o mesmo.
         */
        Scanner sc = new Scanner(System.in);
        
        /**
         * Declaração das variáveis:
         *  M  - Massa de água em kg
         *  TI - Temperatura Inicial em º Celsius
         *  TF - Temperatura Final em º Celsius
         *  Q  - Energia Q em joules
         */
        double M, TI, TF, Q;
        
        System.out.print("Massa de água: ");
        M = sc.nextDouble(); // Lê a massa de água
        
        System.out.print("Temperatura Inicial: ");
        TI = sc.nextDouble(); // Lê a temperatura inicial
        
        System.out.print("Temperatura Final: ");
        TF = sc.nextDouble(); // Lê a temperatura final
        
        Q = M * (TF - TI) * 4184; // Cálculo da energia em J (aplicação direta da fórmula)
        
        System.out.println("Energia em joules: " + Q);
        
        /**
         * Fecha o scanner.
         */
        sc.close();
        
    }
    
}
