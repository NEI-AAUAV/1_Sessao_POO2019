/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.rc_86182.Ex3;

/**
 * Classe que modela o utilizador.
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
public class Utilizador {
    /**
     * Nome do utilizador
     */
    private String nome;
    /**
     * Número mecanográfico do utilizador.
     */
    private int nmec;
    /**
     * Curso do utilizador.
     */
    private String curso;
    
    /**
     * Construtor da classe Utilizador.
     * 
     * @param nome - Nome do utilizador
     * @param nmec - Número mecanográfico do utilizador
     * @param curso - Curso do utilizador
     */
    public Utilizador(String nome, int nmec, String curso) {
        this.nome = nome;
        this.nmec = nmec;
        this.curso = curso;
    }

    public Utilizador() {
    }
    
    /**
     * Getter do nome.
     * 
     * @return Nome do utilizador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setter do nome.
     * 
     * @param nome do utilizador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Getter do NMec
     *
     * @return Nmec do utilizador
     */
    public int getNmec() {
        return nmec;
    }
    
    /**
     * Setter do utilizador.
     * 
     * @param nmec do utilizador.
     */
    public void setNmec(int nmec) {
        this.nmec = nmec;
    }
    
    /**
     * Getter do curso.
     * 
     * @return curso do utilizador.
     */
    public String getCurso() {
        return curso;
    }
    
    /**
     * Setter do curso.
     * 
     * @param curso do utilizador.
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno: " + this.getNmec() + "; " 
                + this.getNome() + "; " 
                + this.getCurso();  
    }
}
