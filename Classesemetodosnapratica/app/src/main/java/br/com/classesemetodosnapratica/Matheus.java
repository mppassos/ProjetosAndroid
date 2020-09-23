package br.com.classesemetodosnapratica;

public class Matheus extends Cidadao implements Presidente {

    @Override
    public void ganharEleicao() {
       System.out.println("Ganhar uma eleicao no Brasil");
    }
}
