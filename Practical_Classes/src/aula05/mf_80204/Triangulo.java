package aula05.mf_80204;

/**
 * Classe para representar um Triângulo, "caracterizado por dimensão dos seus
 * lados (lado1, lado2 e lado3)"
 * 
 * @author Miguel Fradinho Alves - 80204
 *
 */
public class Triangulo {
    /**
     * Lado1 do Triângulo
     */
    private double lado1;
    /**
     * Lado2 do Triângulo
     */
    private double lado2;
    /**
     * Lado3 do Triângulo
     */
    private double lado3;

    /**
     * Cria um Triângulo com lados iguais aos passados no construtor
     * 
     * @param lado1 valor para o lado1
     * @param lado2 valor para o lado2
     * @param lado3 valor para o lado3
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Construtor por defeito.
     * 
     * Cria um Triângulo com lados 2, 3, e 5.
     */
    public Triangulo() {
        lado1 = 2.0f;
        lado2 = 3.0f;
        lado3 = 5.0f;
    }

    /**
     * @return o valor do lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * Altera o lado1 do Triângulo
     * 
     * @param lado1 novo valor para o lado1
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return o valor do lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * Altera o lado2 do Triângulo
     * 
     * @param lado2 novo valor para o lado2
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return o valor do lado3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * Altera o lado3 do Triângulo
     * 
     * @param lado3 novo valor para o lado3
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /**
     * Calcula a área do Triângulo, recorrendo à fórmula de Heron
     * 
     * @return área do Triângulo
     */
    public double calcArea() {
        // Formula de Heron
        double p = this.calcPerimetro() / 2;
        return Math.sqrt(p * (p - this.lado1) * (p - this.lado2) * (p - this.lado3));
    }

    /**
     * Calcula o perímetro do Triângulo
     * 
     * @return o perímetro do Triângulo
     */
    public double calcPerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }

    @Override
    public String toString() {
        return String.format("Triangulo com lado1=%.2f; lado2=%.2f e lado3=%.2f", this.lado1, this.lado2, this.lado3);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(lado1);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lado2);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lado3);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Triangulo other = (Triangulo) obj;
        if (Double.doubleToLongBits(lado1) != Double.doubleToLongBits(other.lado1)) {
            return false;
        }
        if (Double.doubleToLongBits(lado2) != Double.doubleToLongBits(other.lado2)) {
            return false;
        }
        if (Double.doubleToLongBits(lado3) != Double.doubleToLongBits(other.lado3)) {
            return false;
        }
        return true;
    }

}
