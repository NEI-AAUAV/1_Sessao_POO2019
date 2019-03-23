/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.rc_86182;

import java.util.Scanner;
import java.lang.Math;

/**
 * Calculadora de distância.
 * @author rc
 */
public class Ex2_7 {

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
         *  x1         - Coordenada x do ponto 1
         *  x2         - Coordenada x do ponto 2
         *  y1         - Coordenada y do ponto 1
         *  y2         - Coordenada y do ponto 2
         *  distancia  - Distância entre pontos
         */
        double x1, x2, y1, y2, distancia;
        
        System.out.print("Coordenada X1: ");
        x1 = sc.nextDouble(); // Lê coordenada x1
        
        System.out.print("Coordenada Y1: ");
        y1 = sc.nextDouble(); // Lê coordenada y1
        
        System.out.print("Coordenada X2: ");
        x2 = sc.nextDouble(); // Lê coordenada x2
        
        System.out.print("Coordenada Y2: ");
        y2 = sc.nextDouble(); // Lê coordenada y2
        
        /**
         * Notas:
         *      Math.sqrt() - Raíz quadrada
         *      Math.pow(x,2) - Calcula o quadrado de um número x
         * 
         * Fórmula da distância entre pontos: d = sqrt((x2-x1)^2 + (y2 - y1)^2)
         */
        
        distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        
        System.out.println("Distância: " + distancia);
        
        /**
         * Fecha o scanner.
         */
        sc.close();
    }
    
}
