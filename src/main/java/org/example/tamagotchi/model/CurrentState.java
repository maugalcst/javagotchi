package org.example.tamagotchi.model;

public enum CurrentState {
    FELIZ("Está felíz :)"),
    CANSADO("Necesita descansar!"),
    HAMBRE("Necesita alimento!"),
    ENFERMO("está enfermo. Necesita alimento y descanso!");

    private final String descripcionEstado;

    CurrentState(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

}


