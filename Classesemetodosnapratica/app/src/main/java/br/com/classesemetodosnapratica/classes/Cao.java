package br.com.classesemetodosnapratica.classes;

class Cao extends Animal {

    void latir(){
        System.out.println("Latir como um cao");
    }

    void correr(){
        super.correr();
        System.out.println("cao");
    }

}
