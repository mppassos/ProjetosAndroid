package br.com.classesemetodosnapratica;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria(){
        System.out.println("Configuracoes iniciais");
    }

    public ContaBancaria(int nConta){

        this.numeroConta = nConta;

        //System.out.println("Construtor chamado " + nConta);
    }
}
