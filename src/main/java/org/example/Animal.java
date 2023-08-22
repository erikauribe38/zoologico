package org.example;
import org.example.Animal;
public class Animal {

    String nombre;
    String genero;
    double peso;
    Animal pareja;



    public void Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }


    public Animal() {
    }
}
