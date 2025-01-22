package org.example.tamagotchi.model;

public class Food {

    private String nombre;
    private int valorNutricional;
    private String tipo;

    public Food(String nombre, int valorNutricional, String tipo) {
        this.nombre = nombre;
        this.valorNutricional = valorNutricional;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValorNutricional() {
        return valorNutricional;
    }

    public String getTipo() {
        return tipo;
    }

    

}
