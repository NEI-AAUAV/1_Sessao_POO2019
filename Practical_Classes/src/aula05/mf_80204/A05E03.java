package aula05.mf_80204;

import java.util.Scanner;

/**
 * Exercício 5.3 - Biblioteca
 * 
 * Notas Gerais:
 * 
 * 1 - A modelação dos objectos foi feita atendendo ao enunciado, tentando fazer
 * o mínimo de suposições.
 * 
 * 1b - A utilização de "aluno" ou "utilizador" no enunciado é ligeiramente
 * confusa/ambígua. Ao escrever os nomes, houve uma tentativa de usar o termo
 * mais relevante, mas sem muito sucesso (opinião pessoal), pelo que se houver
 * qualquer confusão, "utilizador" ou "aluno" são a mesma coisa [na
 * interpretação do autor].
 * 
 * 1c - Mesma situação para "requisitar" e "emprestar", se bem que estes é
 * relativamente mais claro que são a mesma coisa (neste contexto).
 * 
 * 2 - Tal como mencionado no enunciado, estamos a supor que só existe 1 cópia
 * de cada Livro.
 * 
 * 3 - O enunciado dizia explicitamente para modificar a classe Utilizador de
 * forma a esta poder poder guardar os IDs dos livros requisitados.
 * 
 * " Cada aluno só poderá requisitar simultaneamente um máximo de 3 livros. Deve
 * modificar a classe utilizador para poder guardar os IDs dos livros
 * requisitados, bem como a classe livro para indicar a sua disponibilidade."
 * 
 * No entanto, isto não é uma boa prática...
 * 
 * A Biblioteca é que devia ser responsável por manter um registo dos
 * empréstimos a cada aluno!
 * 
 * Mas mantendo fiel ao enunciado, foi utilizado um ArrayList na classe
 * Utilizador para guardar os Livros que foram emprestados na classe Utilizador.
 * Isto simplifica bastante a lógica, assim não nos temos que preocupar com
 * índices ou em criar arrays novos, etc.
 * 
 * 
 * Desafio Extra 1 (Fácil):
 * 
 * A validação dos tipos de empréstimos devia ser feito na Biblioteca.
 * 
 * Altera o programa de teste e a Biblioteca de forma a que no programa de teste
 * só seja lida uma linha não vazia, e que do lado da Biblioteca, seja feita a
 * validação quanto ao tipo de empréstimo.
 * 
 * 
 * Desafio Extra 2 (Médio):
 * 
 * De momento, a classe Livro é a responsável por manter um registo dos ids.
 * 
 * No entanto, conceptualmente, isso não faz muito sentido, pois a Biblioteca é
 * que devia fazer essa gestão.
 * 
 * Afinal de contas, é a Biblioteca que está a registar os Livros.
 * 
 * Faz as alterações que achares necessárias.
 * 
 * Dica: Começa por modificar os construtores do Livro para aceitarem tabmém um
 * id.
 * 
 * NOTA IMPORTANTE: Ao modificares os construtores, o Exercício 5.2 vai deixar
 * de funcionar. Podes optar por criar uma versão diferente do Livro para manter
 * a funcionar, ou simplesmente adaptar o programa do 5.2 para os novos
 * construtores.
 * 
 * Dica2: Apesar de a Biblioteca também estar a registar os alunos, não faças
 * alterações à classe Aluno.
 * 
 * Apesar de por um lado fazer sentido, se pegarmos no caso da UA, a Biblioteca
 * e os serviços académicos ambos têm algum tipo de registos dos alunos, mas
 * apenas os serviços académicos é que são responsáveis por gerir os Números
 * Mecanográficos.
 * 
 * 
 * Desafio Extra 3 (Díficil):
 * 
 * A Biblioteca é que devia ser responsável por manter um registo dos
 * emprestimos a cada utilizador.
 * 
 * Removendo o atributo dos livros emprestados na classe Utilizador, adapta a
 * Biblioteca para que tudo continue a funcionar, com agora responsabilidade dos
 * empréstimos estar do lado da Biblioteca.
 * 
 * Desafio Extra 4 (Impossível com a matéria dada até agora, precisa de matéria
 * mais à frente):
 * 
 * Atualmente estamos percorrer as listas de alunos e dos livros registados
 * sempre que queremos devolver/emprestar um livro.
 * 
 * Se não existir um dos elementos, estamos a percorrer a lista para nada.
 * 
 * Altera a Biblioteca de forma a que o acesso aos dados seja imediato, sem
 * teres que percorrer os valores.
 * 
 * Dica: Conheces alguma classe do java que permita isso?
 * 
 * @author Miguel Fradinho Alves - 80204
 *
 */

public class A05E03 {
    // Devimos o Scanner como variável estática porque vamos estar a ler várias
    // vezes, em sítios diferentes (nas funções por exemplo)
    // Assim, não precisamos de estar sempre a criar e abrir.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // opção do menu
        int option;
        // Variáveis de leitura
        // número mecanográfico
        int mec;
        int idLivro; //
        String nome;
        String curso;
        String titulo;
        String tipoEmprestimo;
        // Criar a nossa biblioteca para gerir
        Biblioteca bibli = new Biblioteca();
        boolean wantsToExit = false;
        while (!wantsToExit) {
            System.out.println("1 - inscrever utilizador");
            System.out.println("2 - remover utilizador");
            System.out.println("3 - imprimir lista de utilizadores");
            System.out.println("4 - registar um novo livro");
            System.out.println("5 - imprimir lista de livros");
            System.out.println("6 - emprestar");
            System.out.println("7 - devolver");
            System.out.println("8 - sair");
            System.out.print("→ ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    mec = lerNumero("Número Mecanográfico? ");
                    nome = lerLinha("Nome?: ");
                    curso = lerLinha("Curso?: ");
                    bibli.inscreverUtilizador(nome, mec, curso);
                    break;
                case 2:
                    mec = lerNumero("Número Mecanográfico? ");
                    bibli.removerAluno(mec);
                    break;
                case 3:
                    bibli.listarAlunos();
                    break;
                case 4:
                    titulo = lerLinha("Título?: ");
                    tipoEmprestimo = lerEmprestimo();
                    bibli.registarLivro(titulo, tipoEmprestimo);
                    break;
                case 5:
                    bibli.listarLivros();
                    break;
                case 6:
                    idLivro = lerNumero("ID do livro? ");
                    mec = lerNumero("Número Mecanográfico? ");
                    bibli.emprestarLivro(idLivro, mec);
                    break;
                case 7:
                    idLivro = lerNumero("ID do livro? ");
                    mec = lerNumero("Número Mecanográfico? ");
                    bibli.devolverLivro(idLivro, mec);
                    break;
                case 8:
                    wantsToExit = true;
                    break;
                default:
                    System.out.println("Opção inválida!\n");
                    break;
            }
            // Imprimimos uma linha em branco no final de cada para tornar mais legível
            System.out.println();
        }
        System.out.println("A sair...");
        // fechar o scanner, visto que já não vamos precisar de ler mais
        sc.close();
    }

    /**
     * Função para ler uma linha não vazia.
     * 
     * Semelhante ao input() do python (que imprime uma mensagem)
     * 
     * @param prompt mensagem a imprimir
     * @return linha lida
     */
    public static String lerLinha(String prompt) {
        String t;
        while (true) {
            System.out.print(prompt);
            t = sc.nextLine();
            if (t.length() > 0) {
                break;
            }
        }
        return t;
    }

    /**
     * Função para ler um número positivo, semelhante ao input() do python (que
     * imprime uma mensagem)
     * 
     * @param prompt mensagem a imprimir
     * @return número lido
     */
    public static int lerNumero(String prompt) {
        int t;
        while (true) {
            System.out.print(prompt);
            t = sc.nextInt();
            sc.nextLine();
            if (t >= 0)
                break;
        }
        return t;
    }

    /**
     * Função para ler o tipo de empréstimo, válido
     * 
     * @return o tipo de empréstimo
     */
    public static String lerEmprestimo() {
        String t;
        while (true) {
            System.out.println("Emprestimo (Normal/Condicional)? ");
            t = sc.nextLine();
            if (t.toUpperCase().equals("CONDICIONAL") || t.toUpperCase().equals("NORMAL"))
                break;
        }
        return t.toUpperCase();
    }
}
