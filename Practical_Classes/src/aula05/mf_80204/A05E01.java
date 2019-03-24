package aula05.mf_80204;

/**
 * Exercício 5.1 - Figuras Geométricas
 * 
 * Notas Gerais:
 * 
 * 1 - A modelação dos objectos foi feita estritamente como pedido no enunciado,
 * com o menor de suposições possíveis.
 * 
 * 2 - O método da interceção de dois círculos, conceptualmente, podia ser feito
 * na própria modelação do círculo. No entanto, optou-se por fazer no programa
 * de teste.
 * 
 * Desafio Extra 1 (Fácil):
 * 
 * Altera o programa de teste de forma a que os dados do Triângulo sejam
 * inseridos pelo utilzador, validando os mesmos.
 * 
 * Desafio Extra 2 (Médio):
 * 
 * A maneira como modelamos os dados deixa um pouco a desejar, porque os
 * triângulos e os retângulos apenas "existem" algures, enquanto que o círculo é
 * fixo num ponto.
 * 
 * Para tornar estas entidades mais gerais (por exemplo, utilização num programa
 * de desenho, como geogebra), altera as classe do Triângulo e do Retângulo de
 * forma a que estas também tenham um centro.
 * 
 * Faz as alterações que forem necessárias, respeitando a mesma estrutura.
 * 
 * @author Miguel Fradinho Alves - 80204
 * 
 */
public class A05E01 {

    public static void main(String[] args) {
        // Informações do Triângulo
        System.out.println("Triângulo:");
        Triangulo triag = new Triangulo(10, 11, 8);
        System.out.println("Área: " + triag.calcArea());
        System.out.println("Perímetro: " + triag.calcPerimetro());
        System.out.println(triag);
        System.out.println();

        // Informações do Retângulo
        System.out.println("Retângulo:");
        Retangulo rect = new Retangulo(7, 4);
        System.out.println("Área: " + rect.calcArea());
        System.out.println("Perímetro: " + rect.calcPerimetro());
        System.out.println(rect);
        System.out.println();

        // Informações de 2 Círculos
        System.out.println("Círculo 1:");
        Circulo circ1 = new Circulo(new Ponto(0, 0), 7.0);
        System.out.println("Área: " + circ1.calcArea());
        System.out.println("Perímetro: " + circ1.calcPerimetro());
        System.out.println(circ1);
        System.out.println("Círculo 2:");
        Circulo circ2 = new Circulo(new Ponto(1.0, 1.0), 7.0);
        System.out.println("Área: " + circ2.calcArea());
        System.out.println("Perímetro: " + circ2.calcPerimetro());
        System.out.println(circ2);
        // Teste da implementação do método para verse eles se intersetam, com o método
        // criado, deve devolver verdadeiro

        System.out.println("Os circulos intersetam-se? " + circulosIntersetam(circ1, circ2));
        System.out.println();

        // Testar o .equals para mais círculos, não há necessidade de fazer o mesmo para
        // o Retângulo e o Triângulo, pois o raciocínio é o mesmo.
        System.out.println("Igualdade de Círculos");
        Circulo circ3 = new Circulo(new Ponto(5.0, 3.0), 9.0);
        Circulo circ4 = new Circulo(new Ponto(9.0, 2.0), 8.0);
        Circulo circ5 = new Circulo(new Ponto(9.0, 2.0), 8.0);
        Circulo circ6 = new Circulo(new Ponto(5.0, 3.0), 7.0);
        System.out.println(circ3);
        System.out.println(circ4);
        System.out.println(circ5);
        System.out.println(circ6);
        System.out.println("Circ3 igual a Circ4 ? " + (circ3.equals(circ4) ? "Sim" : "Não"));
        System.out.println("Circ3 igual a Circ5 ? " + (circ3.equals(circ5) ? "Sim" : "Não"));
        System.out.println("Circ3 igual a Circ6 ? " + (circ3.equals(circ6) ? "Sim" : "Não"));
        System.out.println("Circ4 igual a Circ5 ? " + (circ4.equals(circ5) ? "Sim" : "Não"));
    }

    /**
     * Verifica se dois circulos se intercetam.
     * 
     * @param circulo1
     * @param circulo2
     * @return true se os circulos se intercetarem
     */
    public static boolean circulosIntersetam(Circulo circulo1, Circulo circulo2) {

        Ponto centro1 = circulo1.getCentro();
        Ponto centro2 = circulo2.getCentro();
        double x1 = centro1.getX();
        double y1 = centro1.getY();
        double x2 = centro2.getX();
        double y2 = centro2.getY();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double raio1 = circulo1.getRaio();
        double raio2 = circulo2.getRaio();
        // 2 circulos intersetam-se se a distcia entre os centros for inferior ou
        // igual à soma dos raios
        if (distance <= (raio1 + raio2)) {
            return true;
        }
        return false;

    }
}
