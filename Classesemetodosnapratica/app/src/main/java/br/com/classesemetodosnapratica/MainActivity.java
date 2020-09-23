package br.com.classesemetodosnapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.com.classesemetodosnapratica.classes.Animal;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Obama obama = new Obama();
        obama.ganharEleicao();


        /*
        ### Interface
        *Pode-se dizer a grosso modo, que uma interface é um contrato que quando assumido
        *por uma classe, deve ser implementado.
        *
        *Interface é utilizada pois podemos ter muitos objetos ( Classes) que podem possuir
        * a mesma ação( métodos) porém, podem executá-las de maneiras diferentes.
         */



        //ContaBancaria contaBancaria = new ContaBancaria(  );

        /*Pessoa pessoa = new Pessoa();
        pessoa.exibirDados("Matheus", 25);
        pessoa.exibirDados("Matheus"); */



       // Animal animal = new Animal();


        /*
        Conta conta = new Conta();
        conta.depositar(100);//200
        conta.sacar(50);//150

        System.out.println( conta.recuperarSaldo());
        */

        /*Passaro passaro = new Passaro();
        passaro.correr();*/

        /*Cao cao = new Cao();
        cao.correr();
        */

       /* Cao cao = new Cao();
        cao.setCor("Azul");
        System.out.println(cao.getCor());*/

        /*Passaro passaro = new Passaro();
        passaro.correr();
        passaro.dormir();
        passaro.voar();

        Cao cao = new Cao();
        cao.dormir();
        cao.latir();*/

        /*Animal animal = new Animal();
        animal.correr();*/

        /*Funcionario funcionario = new Funcionario();
        funcionario.nome = "Matheus";
        funcionario.salario = 5000;

        double salarioRecuperado = funcionario.recuperarSalario( 120 , 20 );
        System.out.println( "O salario do " + funcionario.nome + " é :" + salarioRecuperado );
        */

        //int numero = 10;
        /*Casa minhaCasa = new Casa();
        minhaCasa.cor = "Azul";

        Casa minhaCasa2 = new Casa();
        minhaCasa2.cor = "Branca";

        System.out.println( minhaCasa.cor );
        minhaCasa.abrirPorta();*/
    }
}