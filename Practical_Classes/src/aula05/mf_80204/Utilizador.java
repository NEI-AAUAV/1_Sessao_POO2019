package aula05.mf_80204;

import java.util.ArrayList;

/**
 * Classe que modela um Utilizador, utilizado nos exercícios Exercício 5.2 e Exercício 5.3.
 * 
 * .equals() e .hashCode() gerados pelo Eclipse
 * @author Miguel Fradinho Alves - 80204
 *
 */
public class Utilizador {
    /**
     * Número mecanográfico (identificador único)
     */
    private int nMec;
    /**
     * Nome do aluno
     */
    private String nome;
    /**
     * Curso do aluno
     */
    private String curso;
    /**
     * Lista de livros que o aluno já requisitou
     */
    private ArrayList<Livro> livrosEmprestados;

    /**
     * Cria um utilizador com os dados fornecidos.
     * 
     * @param nome  nome do aluno
     * @param nMec  número mecanográfico
     * @param curso curso do aluno
     */
    public Utilizador(String nome, int nMec, String curso) {
        this.nome = nome;
        this.nMec = nMec;
        this.curso = curso;
        this.livrosEmprestados = new ArrayList<>();
    }

    /**
     * 
     * @return o número mecanográfico do utilizador
     */
    public int getnMec() {
        return this.nMec;
    }

    /**
     * Modifica o número mecanográfico do utilizador
     * 
     * @param nMec novo número mecanográfico
     */
    public void setnMec(int nMec) {
        this.nMec = nMec;
    }

    /**
     * 
     * @return o nome do utilizador
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * 
     * @return o curso do utilizador
     */
    public String getCurso() {
        return this.curso;
    }

    /**
     * 
     * @return os livros que o utilizador requisitou
     */
    public ArrayList<Livro> getLivrosEmprestados() {
        return this.livrosEmprestados;
    }

    /**
     * Modifica a lista dos livros que o utilizador requisitou
     * 
     * @param livros nova lista
     */
    public void setLivrosEmprestados(ArrayList<Livro> livros) {
        this.livrosEmprestados = livros;
    }

    @Override
    public String toString() {
        return String.format("Aluno: %d; %s; %s", this.nMec, this.nome, this.curso);
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
        result = prime * result + ((curso == null) ? 0 : curso.hashCode());
        result = prime * result + nMec;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Utilizador other = (Utilizador) obj;
        if (curso == null) {
            if (other.curso != null) {
                return false;
            }
        }
        else if (!curso.equals(other.curso)) {
            return false;
        }
        if (nMec != other.nMec) {
            return false;
        }
        if (nome == null) {
            if (other.nome != null) {
                return false;
            }
        }
        else if (!nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

}
