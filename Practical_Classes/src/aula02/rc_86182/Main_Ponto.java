/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.rc_86182;

import java.util.Scanner;

/**
 * Implementação da distância entre pontos 
 * com criação e representação do ponto.
 * 
 * @author rc
 */
public class Main_Ponto {

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
        
        Ponto p1 = new Ponto(x1, y1);
        Ponto p2 = new Ponto(x2, y2);
        
        /**
         * Notas:
         *      Math.sqrt() - Raíz quadrada
         *      Math.pow(x,2) - Calcula o quadrado de um número x
         * 
         * Fórmula da distância entre pontos: d = sqrt((x2-x1)^2 + (y2 - y1)^2)
         */
        
        distancia = Math.sqrt(Math.pow(p2.getX()-p1.getX(), 2) + Math.pow(p2.getY()-p1.getY(), 2));
        
        System.out.println("Distância: " + distancia);
    }
    
}
