/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.rc_86182.Ex3;

/**
 * Classe que modela o Livro.
 * 
 * Nota: Neste tipo de classes, podes e deves recorrer ao teu IDE.
 * Todo o código aqui colocado foi gerado a partir do IDE, a única coisa
 * que foi alterada foi apenas a formatação do toString() de modo a obter
 * a formatação pretendida.
 * 
 * No caso do NetBeans para gerar este código vai a:
 * Source -> Insert Code -> Construtor
 * Source -> Insert Code -> Getter's and Setter's
 * Source -> Insert Code -> toString
 * 
 * @author rc
 */
public class Livro {
    /**
     * Id do livro;
     */
    private int id;
    /**
     * Título do livro.
     */
    private String titulo;
    /**
     * Tipo de empréstimo, pode ser:
     *   - Normal
     *   - Condicional
     */
    private String tipo_emprestimo;
    
    /**
     * Construtor da classe livro.
     * @param id - Id do livro.
     * @param titulo - Título do livro
     * @param tipo_emprestimo - Tipo de empréstimo
     */
    public Livro(int id, String titulo, String tipo_emprestimo) {
        this.titulo = titulo;
        this.tipo_emprestimo = tipo_emprestimo;
        this.id = id;
    }

    public Livro() {
    }
    
    /**
     * Getter do ID.
     * 
     * @return id do livro 
     */
    public int getId() {
        return id;
    }
    
    /**
     * Setter do id livro.
     * 
     * @param id - do livro 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Getter do título do livro.
     * 
     * @return título do livro
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Setter do título do livro.
     * 
     * @param titulo do livro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Getter do tipo de empréstimo.
     * 
     * @return tipo de empréstimo
     */
    public String getTipo_emprestimo() {
        return tipo_emprestimo;
    }
    
    /**
     * Setter do tipo do empréstimo.
     * 
     * @param tipo_emprestimo 
     */
    public void setTipo_emprestimo(String tipo_emprestimo) {
        this.tipo_emprestimo = tipo_emprestimo;
    }

    @Override
    public String toString() {
        return "Livro " + this.getId() + ": " 
                + this.getTitulo() + ", " 
                + this.getTipo_emprestimo();
    }
}
