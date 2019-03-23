/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.rc_86182.Ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que modela a biblioteca.
 * 
 * @author rc
 */
public class Biblioteca {
    /**
     * Lista de alunos existentes.
     */
    private final List<Utilizador> listaAluno;
    /*
     * Lista de livros existentes.
     */
    private final List<Livro> listaLivros;
    /**
     * Lista de livros disponíveis.
     */
    private final List<Livro> livrosDisponiveis;
    /**
     * Lista de empréstimos.
     */
    private final List<String[]> emprestimos;

    private final Utilizador aluno;
    private Livro livro;

    public Biblioteca() {
        this.livro = new Livro();
        this.aluno = new Utilizador();
        this.listaAluno = new ArrayList<>();
        this.listaLivros = new ArrayList<>();
        this.livrosDisponiveis = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }
    
    /**
     * Função que permite adicionar um novo aluno.
     * 
     * @param aluno que vai ser adicionado.
     */
    public void addAluno(Utilizador aluno) {
        //Condição de verificação de existência do aluno.
        boolean existe = false;
        
        //Percorremos a lista de todos os alunos e verificamos se já se encontra registado
        for (int i = 0; i < listaAluno.size(); i++) {
            if(listaAluno.get(i).getNmec() == aluno.getNmec()) {
                existe = true;
            }
        }
        
        if(existe) { //Se existir é impressa uma mensagem de erro
            System.err.println("O aluno já existe!");
        }else{ // Caso contrário o aluno é adicionado
            listaAluno.add(aluno);
        }
    }
    
    /**
     * Função que permite remover um aluno.
     * 
     * Nota: Se um aluno que vai ser removido tiver
     * livros associados estes também devem ser
     * logicamente libertados.
     * 
     * @param nmec do aluno a ser removido.
     */
    public void removeAluno(String nmec) {
        /**
         * Declaração de variáveis:
         *  Nmec - nmec em string convertido para int
         *  i    - variável a ser incrementada nos ciclos for
         * 
         * Nota: Para converter de String para inteiro usa-se:
         *          Integer.parseInt();
         */
        int Nmec = Integer.parseInt(nmec), i;
        
        //Permite percorrer a lista dos alunos e remover um aluno que já existe.
        for (i = 0; i < listaAluno.size(); i++) {
            if (Nmec == listaAluno.get(i).getNmec()) {
                listaAluno.remove(i);
                System.out.println("Aluno " + listaAluno.get(i).getNmec() + " removido");
            }
        }
        
        //Uma vez que os aluno já foi removido é necessário libertar os seus
        //livros caso este os tenha, deste modo, percorremos a lista de 
        //empréstimos de modo a procurar algum livro que esteja associado ao
        //nmec que acabamos de remover.
        
        for (i = 0; i < emprestimos.size(); i++) {
            String[] emprestimo = emprestimos.get(i);
            if (emprestimo[0] == nmec) {
                for (i = 0; i < listaLivros.size(); i++) {
                    livro = listaLivros.get(i);
                    if (("" + livro.getId()).equals(emprestimo[1])) {
                        livrosDisponiveis.add(livro);
                        break;
                    }
                }
            }
        }
    }

    /**
     * Função que permite imprimir todos os alunos.
     * 
     * Considerações:
     *      - A lista pode ser vazia e nesse caso devemos
     *        informar que não há utilizadores
     *      - Se a lista não estiver vazia devemos imprimir 
     *        o Nome, NMec, Curso
     * 
     * Nota: Para facilitar a forma como é feita a impressão,
     * estamos a optar por alinhas todo o conteúdo à esquerda.
     */
    public void printAluno() {
        System.out.println("Lista de utilizadores :");
        
        //Primeiro verificamos se a lista está vazia
        if(listaAluno.isEmpty()){
            
            System.out.println("Não existe qualquer utilizador registado");

        } else { //Como a lista não está vazia procedemos à impressão dos mesmos
            System.out.printf("%-20s| %-6s| %-30s|\n","NOME","Nº MEC","CURSO");
            System.out.println("-------------------------------------------------------------");

            for (int i = 0; i < listaAluno.size(); i++) {
                System.out.printf("%-20s| %-6d| %-30s|\n",
                        listaAluno.get(i).getNome(),
                        listaAluno.get(i).getNmec(),
                        listaAluno.get(i).getCurso());
            }
        }
    }
    
    /**
     * Função que nos permite adicionar um livro à lista de livros.
     * 
     * Notas: Quando um novo livro é adicionado temos que
     *        ter em conta que ele também deve ser adicionado
     *        à lista de livros disponíveis.
     * @param livro que vai ser adicionado.
     */
    public void addBook(Livro livro) {
        listaLivros.add(livro);
        livrosDisponiveis.add(livro);
    }
    
    /**
     * Função que nos permite imprimir todos os livros.
     * 
     * Considerações: Temos que verificar numa primeira
     * instância que a lista de livros está vazia, caso
     * isso se verifique simplesmente é impressa uma 
     * mensagem a dizer que não existem livros.
     * 
     * Nota: Para facilitar a forma como é feita a impressão,
     * estamos a optar por alinhas todo o conteúdo à esquerda.
     */
    public void printBook() {
        System.out.println("Livros registados :");
        
        // Em primeira instância fazemos a verificação se a lista está vazia
        if(listaLivros.isEmpty()){
            
            System.out.println("Não existe qualquer livro registado");
            
        }else{ // Como a lista não está vazia procedemos à impressão dos mesmos.
            
            System.out.printf("%-6s| %-20s| %-15s|\n","ID","TITULO","EMPRESTIMO");
            System.out.println("----------------------------------------------");
            for (int i = 0; i < listaLivros.size(); i++) {
                System.out.printf("%-6d| %-20s| %-15s|\n",
                        listaLivros.get(i).getId(),
                        listaLivros.get(i).getTitulo(),
                        listaLivros.get(i).getTipo_emprestimo());
            }
            
        }
        
    }
    
    /**
     * Função que nos permite fazer algumas verificações extra.
     * 
     * @param nmec que queremos validar
     * @param id do livro que queremos validar
     * 
     * @return true caso seja válido
     *         false caso seja inválido
     */
    public boolean verificacoes (String nmec, String id){
        boolean inscrito = false;
        
        for (int i = 0; i < listaAluno.size(); i++) {
            if ((""+listaAluno.get(i).getNmec()).equals(nmec)) {
                inscrito = true;
            }
        }
        if (!inscrito) {
            System.err.println("O aluno não está inscrito");
            return false;
        }

        boolean livro_registado = false;
        for (int i = 0; i < listaLivros.size(); i++) {
            if (listaLivros.get(i).getId() == Integer.parseInt(id)) {
                livro_registado = true;
            }
        }
        if (!livro_registado) {
            System.err.println("O livro não foi registado");
            return false;
        }
        
        return true;
    }
    
    /**
     * Função que nos permite fazer um empréstimo de um livro.
     * 
     * @param nmec do estudante a quem o livro vai ser emprestado.
     * 
     * @param id do livro a ser emprestado.
     */
    public void emprestar(String nmec, String id) {

        if (!verificacoes(nmec, id)) {
            // do nothing
        }else{
            /**
             * Declarações de variáveis:
             *  i        - Variável que vai ser incrementada nos ciclos for.
             *  contagem - Dos livros que estão emprestados
             */
            int contagem = 0, i;
            for (i = 0; i < emprestimos.size(); i++) {
                String[] emprestimo = emprestimos.get(i);
                if (emprestimo[0].equals(nmec)) {
                    contagem++;
                }
            }
            if (contagem == 3) {
                
                System.err.println("Não pode requisitar. Máximo excedido!");
                
            }else{
                //Se tudo correr bem, então colocar o livro a "NÃO DISPONIVEL"
                for (i = 0; i < livrosDisponiveis.size(); i++) {
                    if (livrosDisponiveis.get(i).getId() == Integer.parseInt(id)) {
                        String[] tuplo = { nmec, id };
                        emprestimos.add(tuplo);
                        livrosDisponiveis.remove(i);
                        System.out.println("Livro requisitado");
                    }else{System.err.println("O livro já foi emprestado");}
                }
                
            }
        }
    }
    
    /**
     * Função que nos permite devolver um livro após a sua requisição.
     * 
     * Considerações: Devemos verificar numa primeira instância se os
     * valores introduzidos são válidos, isto é, se o id e o nmec 
     * estão registados. Após isto temos de analisar se o aluno 
     * tem livros requisitados, fazemos isto com recurso à lista, 
     * isto é, percorremos a lista de empréstimos e verificamos se
     * existe algum feito associado ao nmec, caso não esteja deve 
     * ser impressa uma mensagem de erro.
     * Após isso devemos verificar se o livro foi efetivamente
     * emprestado, caso não tenha sido devemos imprimir uma mensagem
     * de erro a informar isso.
     * 
     * @param nmec do aluno que vai devolver o livro.
     * @param id do livro a ser devolvido.
     */
    public void devolver(String nmec, String id) {
        if (!verificacoes(nmec, id)) {
            //do nothing
        }else{
            /**
             * Declaração de variáveis:
             *  i                   - Variável de incremento do for.
             *  alunos_requisitaram - Controla se foram requisitados livros.
             *  livros_emprestados  - número de livros emprestados
             */
            int alunos_requisitaram = 0, livros_emprestados = 0, i;
            
            for (i = 0; i < emprestimos.size(); i++) {
                String[] emprestimo = emprestimos.get(i);
                if (emprestimo[0].equals(nmec)) {
                    alunos_requisitaram++;
                }
            }
            if (alunos_requisitaram == 0) {
                System.err.println("O aluno não requisitou livros");
            } else{
                for (i = 0; i < livrosDisponiveis.size(); i++) {
                    livro = livrosDisponiveis.get(i);
                    if (livro.getId() == Integer.parseInt(id)) {
                        livros_emprestados++;
                    }
                }
                if (livros_emprestados == 1) {
                    
                    System.err.println("O livro não foi emprestado");
                    
                } else{
                    
                    for (i = 0; i < emprestimos.size(); i++) {
                        String[] emprestimo = emprestimos.get(i);
                        if (emprestimo[0].equals(nmec) && emprestimo[1].equals(id)) {
                            emprestimos.remove(i);
                        }
                    }
                    for (i = 0; i < listaLivros.size(); i++) {
                        livro = listaLivros.get(i);
                        if(livro.getId() == Integer.parseInt(id)){
                            livrosDisponiveis.add(livro);
                            System.out.println("Livro devolvido");
                            
                        } else{System.err.println("O aluno não requisitou esse livro");}
                    }
                }
            }            
        }
    }
    
    /**
     * Função que permite verificar se um determinado livro está disponível.
     * 
     * Notas: Se o livro não estiver disponível deve ser apresentada uma
     * mensagem de erro.
     * 
     * @param id do livro que queremos verificar
     */
    public void verificar(String id) {
        for (int i = 0; i < livrosDisponiveis.size(); i++) {
            livro=livrosDisponiveis.get(i);
            if(livro.getId() == Integer.parseInt(id)){
                System.out.println("O livro está disponível");
            } else {System.err.println("O livro não está disponível");}
        }
    }
}