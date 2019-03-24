package aula05.mf_80204;

/**
 * Classe para representar um Círculo, "caracterizado por um centro e raio"
 * 
 * @author Miguel Fradinho Alves - 80204
 *
 */
public class Circulo {
    /**
     * Centro do Círculo
     */
    private Ponto centro;
    /**
     * Raio do Círculo
     */
    private double raio;

    /**
     * Cria um Círculo a partir de um Ponto e do valor do raio
     * 
     * @param ponto ponto onde o Círculo estará centrado
     * @param raio  valor do raio
     */
    public Circulo(Ponto ponto, double raio) {
        this.centro = ponto;
        this.raio = raio;
    }

    /**
     * Cria um Círculo a partir das coordenadas x,y do seu centro, e do raio
     * 
     * @param x valor das abcissas do centro
     * @param y valor das ordenedas do centro
     * @param r valor do raio
     */
    public Circulo(double x, double y, double r) {
        this.centro = new Ponto(x, y);
        this.raio = r;
    }

    /**
     * Construtor por defeito.
     * 
     * Cria um Círculo em (0,0) com raio 1
     */
    public Circulo() {
        this.centro = new Ponto();
        this.raio = 1.0f;
    }

    /**
     * 
     * @return o Ponto onde está centrado o Círculo
     */
    public Ponto getCentro() {
        return this.centro;
    }

    /**
     * Altera o Ponto onde o Círculo está centrado
     * 
     * @param ponto novo Ponto onde centrar o Círculo
     */
    public void setCentro(Ponto ponto) {
        this.centro = ponto;
    }

    /**
     * 
     * @return o raio do Círculo
     */
    public double getRaio() {
        return this.raio;
    }

    /**
     * Altera o raio do Círculo para o novo valor
     * 
     * @param raio novo raio
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

    /**
     * Calcula a área do Círculo
     * 
     * @return área do Círculo
     */
    public double calcArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    /**
     * Calcula o perimetro do Círculo
     * 
     * @return perimetro do Círculo
     */
    public double calcPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String toString() {
        return String.format("Círculo de centro %s e raio %.2f", this.centro, this.raio);
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
        result = prime * result + ((centro == null) ? 0 : centro.hashCode());
        long temp;
        temp = Double.doubleToLongBits(raio);
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
        Circulo other = (Circulo) obj;
        if (centro == null) {
            if (other.centro != null) {
                return false;
            }
        }
        else if (!centro.equals(other.centro)) {
            return false;
        }
        if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio)) {
            return false;
        }
        return true;
    }

}
