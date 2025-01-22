package org.example.tamagotchi.model;

public class Tamagotchi {

    // atributos
    private String nombre;
    private int energia;
    private int hambre;
    private CurrentState estado;

    private static final int MAX_ENERGIA = 100;

    // constructor
    public Tamagotchi(String nombre, int energia, int hambre) {
        this.nombre = nombre;
        this.energia = 100;
        this.hambre = 0;
        this.estado = CurrentState.FELIZ;
    }

    // setters & getters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return this.energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getHambre() {
        return this.hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public CurrentState getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Nombre = " + getNombre() + "\n" +
                "Energía = " + getEnergia() + "\n" +
                "Hambre = " + getHambre() + "\n";
    }

    // métodos
    public void alimentar(int alimento){
        this.hambre -= alimento;
        if (hambre < 0) {
            hambre = 0;
        }
        System.out.println(this.nombre + " ha sido alimentado. ");
        System.out.println("Hambre: " + hambre);
    }

    public void jugar(int minutosDeJuego){
        this.energia -= minutosDeJuego;
        this.hambre += (minutosDeJuego/2);
        if (this.energia < 0){
            this.energia = 0;
        }
        if (this.hambre > MAX_ENERGIA){
            this.hambre = MAX_ENERGIA;
        }
        System.out.println(this.nombre + " ha jugado " + minutosDeJuego + " minutos. ");
        System.out.println("Energía: " + energia);
        System.out.println("Hambre: " + hambre);
    }

    public void descansar(int horasDurmiendo){
        if (this.energia == MAX_ENERGIA){
            System.out.println(this.nombre + " no necesita descansar!");
            return;
        }

        this.energia += (horasDurmiendo * 4);
        if (this.energia > MAX_ENERGIA){
            this.energia = MAX_ENERGIA;
        }
        System.out.println(this.nombre + " ha descansado " + horasDurmiendo + " horas!");
        System.out.println("Energía: " + energia);
    }

    public void verEstado() {
        CurrentState estadoActual;

        if (this.energia < 20 && this.hambre >= 80) {
            estadoActual = CurrentState.ENFERMO;
        } else if (this.hambre >= 80) {
            estadoActual = CurrentState.HAMBRE;
        } else if (this.energia < 20) {
            estadoActual = CurrentState.CANSADO;
        } else {
            estadoActual = CurrentState.FELIZ;
        }

        System.out.println(estadoActual);
        System.out.println(this.nombre + " " + estadoActual.getDescripcionEstado());
    }

    public void cambiarEstado(CurrentState nuevoEstado){
        this.estado = nuevoEstado;
    }
}
