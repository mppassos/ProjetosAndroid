package br.com.classesemetodosnapratica;

public class Funcionario {

    //propriedades
    String nome;
    double salario;

    //métodos - sem retorno / com retorno
    double recuperarSalario( double bonus, double descontoAdicional ){
        this.salario = this.salario - (this.salario * 0.1); //10% desse salario
        return this.salario + bonus - descontoAdicional;
        //System.out.println( this.salario );
    }
}
