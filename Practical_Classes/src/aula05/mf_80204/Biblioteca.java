package aula05.mf_80204;

import java.util.ArrayList;

/**
 * Classe que modela uma Biblioteca, utilizada no Exercício 5.3.
 * 
 * @author Miguel Fradinho Alves - 80204
 *
 */
public class Biblioteca {
    /**
     * Número máximo de alunos que se podem registar
     */
    private static final int MAX_ALUNOS = 100;
    /**
     * Número máximo de livros que se podem registar
     */
    private static final int MAX_LIVROS = 100;

    /**
     * Número máximo de livros que cada aluno pode emprestar.
     * 
     */
    public static final int MAX_EMPRESTIMOS = 3;
    /**
     * Lista dos alunos registados
     */
    private ArrayList<Utilizador> alunos = new ArrayList<>();
    /**
     * Lista dos livros registados
     */
    private ArrayList<Livro> livros = new ArrayList<>();

    /**
     * Inscreve um Utilizador na Biblioteca
     * 
     * @param nome  nome do aluno
     * @param mec   número mecanográfico
     * @param curso curso do aluno
     */
    public void inscreverUtilizador(String nome, int mec, String curso) {
        Utilizador utilizador = new Utilizador(nome, mec, curso);
        // Não podemos inscrever um aluno que já esteja registado
        if (alunos.contains(utilizador)) {
            System.out.println("Esse aluno já está registado!");
            return;
        }
        // Nem se atingimos o limite máximo de alunos
        else if (alunos.size() == MAX_ALUNOS) {
            System.out.println("Limite máximo de alunos registados atingido!");
            return;
        }
        // O aluno não está registado nem atingimos o limite, por isso, adicionamos à
        // lista de alunos
        else {
            alunos.add(utilizador);
            System.out.printf("Registado: %d - %s - %s\n", mec, nome, curso);
        }
    }

    /**
     * Remove um aluno do registo, caso ele exista.
     * 
     * Caso o aluno tenha livros que ainda não tenham sido devolvidos, estes passam
     * a estar "magicamente" disponíveis.
     * 
     * @param mec número do aluno
     */
    public void removerAluno(int nMec) {
        Utilizador aluno = getUtilizador(nMec);
        if (aluno == null) {
            System.out.println("Esse aluno não se encontra registado!\n");
            return;
        }

        // Nota: Estamos a fazer a suposição que os livros que o aluno ainda ter na sua
        // posse voltam "magicamente" para a biblioteca

        // Quando o aluno é removido, alteramos os livros que ele tinha requisitado sem
        // devolver para disponiveis
        ArrayList<Livro> livrosEmprestados = aluno.getLivrosEmprestados();
        if (livrosEmprestados.size() > 0) {
            for (Livro livro : livrosEmprestados) {
                livro.setDisponivel(true);
            }
        }
        // finalmente, removemos o aluno
        alunos.remove(aluno);
        System.out.printf("Removido o aluno com número mecanográfico: %s\n", nMec);

    }

    /**
     * Imprime a lista de Alunos registados
     */
    public void listarAlunos() {
        for (Utilizador x : alunos) {
            System.out.println(x);
        }
    }

    /**
     * Regista um novo Livro.
     * 
     * @param titulo     título do livro
     * @param emprestimo tipo de emprestimo
     */
    public void registarLivro(String titulo, String emprestimo) {
        if (livros.size() == MAX_LIVROS) {
            System.out.println("Limite máximo de livros registados atingido!");
            return;
        }
        Livro livro = new Livro(titulo, emprestimo);
        livros.add(livro);
        System.out.printf("Foi adicionado o livro \"%s\"\n", titulo);
    }

    /**
     * Imprime a lista dos Livros registados
     */
    public void listarLivros() {
        for (Livro x : livros) {
            System.out.println(x);
        }
    }

    /**
     * Empresta um Livro a um aluno
     * 
     * @param idLivro id do livro a emprestar
     * @param nMec    nMec do aluno
     */
    public void emprestarLivro(int idLivro, int nMec) {
        Livro livro = getLivro(idLivro);
        if (livro == null) {
            System.out.println("Esse livro não se encontra registado!\n");
            return;
        }
        Utilizador aluno = getUtilizador(nMec);
        if (aluno == null) {
            System.out.println("Esse aluno não se encontra registado!\n");
            return;
        }
        // Citando o enunciado, "os livros com tipo de empréstimo CONDICIONAL não podem
        // ser requisitados."
        if (livro.getTipoEmprestimo().equals("CONDICIONAL")) {
            System.out.println("Este livro não pode ser requisitado!\n");
            return;
        }
        // Se o livro não estiver disponível, então avisamos e saímos da função
        if (!livro.isDisponivel()) {
            System.out.println("O livro não se encontra disponível\n");
            return;
        }
        ArrayList<Livro> livrosEmprestados = aluno.getLivrosEmprestados();
        // Existe um limite de 3 livros que os alunos podem requisitar
        if (livrosEmprestados.size() >= MAX_LIVROS) {
            System.out.println("O aluno não pode requistar mais livros!\n");
            return;
        }

        // O aluno não pode requisitar o mesmo livro 2 vezes
        if (livrosEmprestados.contains(livro)) {
            System.out.println("O aluno já requisitou esse livro!\n");
            return;
        }

        // o livro deixa de estar disponível
        livro.setDisponivel(false);

        // adicionamos à lista
        livrosEmprestados.add(livro);

        // e atualizamos a lista de livros do aluno
        aluno.setLivrosEmprestados(livrosEmprestados);

        // informamos o utilizador
        System.out.printf("O aluno %d requisitou %d livros no total\n", aluno.getnMec(), livrosEmprestados.size());
        System.out.printf("Foi requisitado o livro: %s\n", livro.getTitulo());

    }

    /**
     * Devolve um Livro à Biblioteca
     * 
     * @param idLivro id do livro a devolver
     * @param nMec    nMec do aluno que o requisitou
     */
    public void devolverLivro(int idLivro, int nMec) {
        Livro livro = getLivro(idLivro);
        if (livro == null) {
            System.out.println("Esse livro não se encontra registado!\n");
            return;
        }
        Utilizador aluno = getUtilizador(nMec);
        if (aluno == null) {
            System.out.println("Esse aluno não se encontra registado!\n");
            return;
        }
        // Se o livro estiver disponível, então não se pode devolver
        if (livro.isDisponivel()) {
            System.out.println("O livro encontra-se disponível\n");
            return;
        }

        ArrayList<Livro> livrosEmprestados = aluno.getLivrosEmprestados();

        // O aluno só pode devolver livros se os tiver requisitados
        if (livrosEmprestados.size() <= 0) {
            System.out.println("O aluno não livros para devolver!\n");
            return;
        }

        // O aluno não pode devolver um livro que não tenha requisitado
        if (!livrosEmprestados.contains(livro)) {
            System.out.println("O aluno não requisitou esse livro!\n");
            return;
        }

        // o livro passa a estar disponível
        livro.setDisponivel(true);
        // removemos da lista
        livrosEmprestados.remove(livro);
        // e atualizamos a lista de livros do aluno
        aluno.setLivrosEmprestados(livrosEmprestados);

        // informamos o utilizador
        System.out.printf("O aluno %d requisitou %d livros no total\n", aluno.getnMec(), livrosEmprestados.size());
        System.out.printf("O livro %s foi devolvido\n", livro.getTitulo());
    }

    /**
     * Função auxiliar para obter um livro da lista
     * 
     * @param id id do livro a procurar
     * @return o Livro, caso exista na lista, null se não existir
     */
    private Livro getLivro(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    /**
     * Função auxiliar para obter um utilizador da lista
     * 
     * @param nMec nMec do utilizador a procurar
     * @return o Utilizador, caso exista na lista, null se não existir
     */
    private Utilizador getUtilizador(int nMec) {
        for (Utilizador utilizador : alunos) {
            if (utilizador.getnMec() == nMec) {
                return utilizador;
            }
        }
        return null;
    }
}
