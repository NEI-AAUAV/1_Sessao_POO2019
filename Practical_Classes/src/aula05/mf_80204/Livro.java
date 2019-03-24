package aula05.mf_80204;

/**
 * Classe que modela um Livro, utilizado nos exercícios Exercício 5.2 e
 * Exercício 5.3.
 * 
 * 
 * .equals() e .hashCode() gerados pelo Eclipse
 * 
 * @author Miguel Fradinho Alves - 80204
 *
 */
public class Livro {
    /**
     * Contador do número total de livros, para servidor dos ids
     */
    private static int LIVROS_IDS = 100;
    /**
     * Id do Livro
     */
    private int id;
    /**
     * Título do Livro
     */
    private String titulo;
    /**
     * Tipo de empréstimo
     */
    private String tipoEmprestimo;
    /**
     * Disponibilidade do livro
     */
    private boolean disponivel;

    /**
     * Cria um Livro com o título fornecido. O tipo de emprestimo é considerado
     * normal
     * 
     * @param title título do livro
     */
    public Livro(String title) {
        this.id = LIVROS_IDS;
        LIVROS_IDS++;
        this.titulo = title;
        this.tipoEmprestimo = "NORMAL";
        this.disponivel = true;
    }

    /**
     * Cria um Livro com o título fornecido
     * 
     * @param title
     * @param emprestimo
     */
    public Livro(String title, String emprestimo) {
        this.id = LIVROS_IDS;
        LIVROS_IDS++;
        this.titulo = title;
        this.tipoEmprestimo = emprestimo;
        this.disponivel = true;
    }

    /**
     * 
     * @return o id do livro
     */
    public int getId() {
        return this.id;
    }

    /**
     * 
     * @return o título do livro
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * 
     * @return o tipo de empréstimo do livro
     */
    public String getTipoEmprestimo() {
        return this.tipoEmprestimo;
    }

    /**
     * Modifica o tipo de empréstimo do livro
     * 
     * @param tipoEmprestimo novo tipo de empréstimo
     */
    public void setTipoEmprestimo(String tipoEmprestimo) {
        this.tipoEmprestimo = tipoEmprestimo;
    }

    /**
     * @return verdadeiro se o livro estiver disponível
     */
    public boolean isDisponivel() {
        return disponivel;
    }

    /**
     * Modifica a disponibilidade do livro
     * 
     * @param disponivel nova disponibilidade do livro
     */
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return String.format(
                        "Livro  %d; %s; %s; %s", this.id, this.titulo, this.tipoEmprestimo,
                        this.disponivel ? "disponível" : "NÃO disponível"
        );
    }

}
