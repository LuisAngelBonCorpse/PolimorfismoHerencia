package com.generation;

import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;

public class Main {

    public static void main(String[] args) {
	/*
	herencia: heredar atributos de una clase padre
    polimorfismo: variaciones en el funcionamiento de un mismo método en clases diferentes
    */
        Ave ave = new Ave("perri el ornitorrinco");
        ave.comunicarse();
        ave.hacerNido();
        ave.comer();
        ave.respirar();
        /*Animal animal = new Animal();
        animal.comunicarse();
        */
        // animal.hacerNido(); // no se puede, ya que solo se hereda en un solo sentido, de padre a hijo
        System.out.println("-----------------------------------------------");

        Perro lomito = new Perro("Giby");
        lomito.comunicarse();
        lomito.jugar();
        lomito.comer();
        //igualmente no puede acceder a nada de la clase ave porque igualmente solo va de padre a hijo
    }
}
