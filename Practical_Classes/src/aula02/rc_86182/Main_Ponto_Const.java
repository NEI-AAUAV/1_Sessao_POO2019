/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.rc_86182;

/**
 * Implementação da distância entre pontos 
 * com criação e representação do ponto.
 * 
 * @author rc
 */
public class Main_Ponto_Const {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Declaração das variáveis:
         *  d  - Distância
         */
        double d;
        
        
        Ponto_Gen p1 = new Ponto_Gen();
        Ponto_Gen p2 = new Ponto_Gen();
        
        /**
         * Notas:
         *      Math.sqrt() - Raíz quadrada
         *      Math.pow(x,2) - Calcula o quadrado de um número x
         * 
         * Fórmula da distância entre pontos: d = sqrt((x2-x1)^2 + (y2 - y1)^2)
         */
        
        d = Math.sqrt(Math.pow(p2.getX()-p1.getX(), 2) + Math.pow(p2.getY()-p1.getY(), 2));
        
        System.out.println("Distância: " + d);
    }
    
}
