/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.rc_86182.Ex3;

import java.util.Scanner;

/**
 * Main class do problema da biblioteca.
 * @author rc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utilizador aluno;
        Livro livro;
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        String Menu ="\nMENU\n"
                + "1 - inscrever aluno\n"
                + "2 - remover aluno\n"
                + "3 - imprimir lista de utilizadores\n"
                + "4 - registar um novo livro\n"
                + "5 - imprimir lista de livros\n"
                + "6 - emprestar\n"
                + "7 - devolver\n"
                + "8 - verificar disponibilidade\n"
                + "9 - sair\n";
        OUTER:
        while (true) {
            System.out.println(Menu);
            System.out.print("Opção: ");
            String resposta = sc.nextLine();
            switch (resposta) {
                case "1":
                    {
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("N Mec: ");
                        String nmec = sc.nextLine();
                        System.out.print("Curso: ");
                        String curso= sc.nextLine();
                        aluno = new Utilizador(nome, Integer.parseInt(nmec), curso);
                        biblioteca.addAluno(aluno);
                        break;
                    }
                case "2":
                    System.out.print("NMec a remover: ");
                    String nMecRemover = sc.nextLine();
                    biblioteca.removeAluno(nMecRemover);
                    break;
                case "3":
                    biblioteca.printAluno();
                    break;
                case "4":
                    {
                        System.out.print("Id: ");
                        String id= sc.nextLine();
                        System.out.print("Titulo: ");
                        String titulo= sc.nextLine();
                        System.out.print("Emprestimo (condicional/normal): ");
                        String tipo_emprestimo= sc.nextLine();
                        livro = new Livro(Integer.parseInt(id), titulo, tipo_emprestimo);
                        biblioteca.addBook(livro);
                        break;
                    }
                case "5":
                    biblioteca.printBook();
                    break;
                case "6":
                    {
                        System.out.print("N Mec: ");
                        String nmec = sc.nextLine();
                        System.out.print("Id: ");
                        String id= sc.nextLine();
                        biblioteca.emprestar(nmec, id);
                        break;
                    }
                case "7":
                    {
                        System.out.print("N Mec: ");
                        String nmec = sc.nextLine();
                        System.out.print("Id: ");
                        String id= sc.nextLine();
                        biblioteca.devolver(nmec, id);
                        break;
                    }
                case "8":
                    {
                        System.out.print("Id: ");
                        String id= sc.nextLine();
                        biblioteca.verificar(id);
                        break;
                    }
                case "9":
                    sc.close();
                    break OUTER;
                default:
                    break;
            }
        }
    }
}