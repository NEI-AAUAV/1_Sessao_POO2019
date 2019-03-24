package aula05.mf_80204;

/**
 * Classe para representar um Retângulo, "caracterizado por comprimento e
 * altura", utilizado no Exercício 5.1.
 * 
 * 
 * .equals() e .hashCode() gerados pelo Eclipse
 * 
 * @author Miguel Fradinho Alves - 80204
 *
 */
public class Retangulo {
    /**
     * Comprimento do Retângulo
     */
    private double comprimento;
    /**
     * Largura do Retângulo
     */
    private double largura;

    /**
     * Cria um Retângulo a partir do valor do comprimento e do valor da largura
     * 
     * @param comprimento comprimento do Retângulo
     * @param largura     largura do Retângulo
     */
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    /**
     * Construtor por defeito.
     * 
     * Cria um Retângulo com comprimento 5 e largura 2
     */
    public Retangulo() {
        comprimento = 5.0f;
        largura = 2.0f;
    }

    /**
     * 
     * @return o comprimento do Retângulo
     */
    public double getComprimento() {
        return this.comprimento;
    }

    /**
     * Altera o comprimento do Retângulo para o novo valor
     * 
     * @param comprimento novo comprimento
     */
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * 
     * @return a largura do Retângulo
     */
    public double getLargura() {
        return this.largura;
    }

    /**
     * Altera a largura do Retângulo para o novo valor
     * 
     * @param largura nova largura
     */
    public void setLargura(double largura) {
        this.largura = largura;
    }

    /**
     * Calcula a área do Retângulo
     * 
     * @return área do Retângulo
     */
    public double calcArea() {
        return this.largura * this.comprimento;
    }

    /**
     * Calcula o perimetro do Retângulo
     * 
     * @return perímetro do Retângulo
     */
    public double calcPerimetro() {
        return (this.largura * 2) + (this.comprimento * 2);
    }

    @Override
    public String toString() {
        return String.format("Retângulo com comprimento=%.2f e largura=%.2f", this.comprimento, this.largura);
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
        temp = Double.doubleToLongBits(comprimento);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(largura);
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
        Retangulo other = (Retangulo) obj;
        if (Double.doubleToLongBits(comprimento) != Double.doubleToLongBits(other.comprimento)) {
            return false;
        }
        if (Double.doubleToLongBits(largura) != Double.doubleToLongBits(other.largura)) {
            return false;
        }
        return true;
    }

}
