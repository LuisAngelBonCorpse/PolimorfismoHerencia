package com.generation.animales;

public abstract class Animal { //clase abstracta debe tener al menos un metodo abstracto, no puede heredar
    protected String nombre;
    protected int edad;

    public Animal(){
    }

    public Animal(String nombre){
        this.nombre = nombre;
        System.out.println("constructor padre");
    }

    public void comunicarse(){
        System.out.println("Hola");
    }

    public void comer() {
        System.out.println("Ñam!");
    }

    public abstract void respirar(); //los hijos deben de tener si o si el overwrite de este metodo
}
