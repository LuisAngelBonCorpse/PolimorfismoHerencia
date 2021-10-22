package com.generation.animales;

public class Perro extends Animal implements Mascota, Mamifero {
    private int patas;
    private boolean cola;
    private String raza;

    public Perro(String nombre){
        super(nombre);
    }

    @Override
    public void jugar(){
        System.out.println("Porque no alcanso esta cosa...");
    }

    @Override
    public void dormir() {
        System.out.println("Zzzzz");
    }

    @Override
    public void soltarPelo() {
        System.out.println("Pelito por aquí, pelito por halla");
    }

    public void ladrar(){
        System.out.println("Grrrr goff goff!!!!");
    }

    @Override //sobreescribe este method, solo se puede porque se está heredando, es buena práctica
    public void comer() {
        System.out.println("Como huesos y croquetas deliciosas!!");
    }

    @Override
    public void respirar(){
        System.out.println("Inhalo, exhalo");
    }

    @Override
    public void gestar() {
        System.out.println("Tiempo de 2-3 meses");
    }

    @Override
    public void mamar() {
        System.out.println("Obtengo anticuerpos de la leche de mi mami");
    }

    @Override
    public void movilidad() {
        System.out.println("Me muevo por tierra, pero se nadar de perrito");
    }
}
