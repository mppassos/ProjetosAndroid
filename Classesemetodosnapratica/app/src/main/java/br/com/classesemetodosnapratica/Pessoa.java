package br.com.classesemetodosnapratica;

public class Pessoa {

    private String nome;
    private int idade;

    public void exibirDados(String nome){
        System.out.println("Exibir apenas nome: " + nome);
    }

    public void exibirDados(String nome , int idade){
        System.out.println("nome: " + nome + " idade: " + idade);
    }

}
