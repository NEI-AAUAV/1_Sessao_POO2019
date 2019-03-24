package aula05.mf_80204;

/**
 * Classe para representar um Ponto num espaço a 2 dimensões. Modelado tal como
 * explícito no enunciado do Exercício 5.1.
 * 
 * 
 * .equals() e .hashCode() gerados pelo Eclipse
 * 
 * @author Miguel Fradinho Alves - 80204
 *
 */
public class Ponto {
    /**
     * Valor das abcissas
     */
    private double x;
    /**
     * Valor das ordenadas
     */
    private double y;

    /**
     * Cria um Ponto com coordenadas x y
     * 
     * @param x valor das abcissas
     * @param y valor das ordenadas
     */
    Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Cria um ponto na origem
     */
    Ponto() {
        this.x = 0D;
        this.y = 0D;
    }

    /**
     * 
     * @return o valor das abcissas do ponto
     */
    public double getX() {
        return this.x;
    }

    /**
     * 
     * @return o valor das ordenadas do ponto
     */
    public double getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return String.format("(%.2f; %.2f)", this.x, this.y);
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
        temp = Double.doubleToLongBits(x);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
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
        Ponto other = (Ponto) obj;
        if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y)) {
            return false;
        }
        return true;
    }
}