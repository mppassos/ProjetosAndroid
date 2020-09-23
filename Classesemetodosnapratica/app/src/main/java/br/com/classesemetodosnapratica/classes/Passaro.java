package br.com.classesemetodosnapratica.classes;

class Passaro extends Animal{

    void voar(){
        System.out.println("Voar como um passaro");
    }

    void correr(){
        super.correr();
        System.out.println("passaro");
    }
}
