package com.generation;

import com.generation.didi.ConductorDidiSpecial;
import com.generation.didi.DidiDriver;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class Main {

    public static void main(String[] args) {
        /*
        * EJERCICIO
            1. Encapsulamiento
            2. Crear clase ConductorDidiSpecial que herede de clase UberDrive
            3. Crear un objeto de cada clase (2)
            4. Calcula e imprime el precio de un viaje de 6 km para cada tipo de conductor:
                ConductorDidi
                ConductorDidiSpecial

        */
        DidiDriver conductor1 = new DidiDriver("Juan Manuel", "Versa","BU8701");
        ConductorDidiSpecial conductor2 = new ConductorDidiSpecial("Brayan Perez", "Enzo","M3L4P3");


        System.out.println("Por Kilometro:");
        System.out.println("El precio en didi normal es: $" + conductor1.calculatePriceDistance(6));
        System.out.println("El precio en didi especial es: $" + conductor2.calculatePriceDistance(6));
        System.out.println("\nPor minuto:");
        System.out.println("El precio en didi normal es: $" + conductor1.calculatePriceTime(40));
        System.out.println("El precio en didi especial es: $" + conductor2.calculatePriceDistance(15));


	/*
	herencia: heredar atributos de una clase padre
    polimorfismo: variaciones en el funcionamiento de un mismo método en clases diferentes

        Ave ave = new Ave("perri el ornitorrinco");
        ave.comunicarse();
        ave.hacerNido();
        ave.comer();
        ave.respirar();
        Animal animal = new Animal();
        animal.comunicarse();

        // animal.hacerNido(); // no se puede, ya que solo se hereda en un solo sentido, de padre a hijo
        System.out.println("-----------------------------------------------");

        Perro lomito = new Perro("Giby");
        lomito.comunicarse();
        lomito.jugar();
        lomito.comer();
        //igualmente no puede acceder a nada de la clase ave porque igualmente solo va de padre a hijo

	 */
    }
}
