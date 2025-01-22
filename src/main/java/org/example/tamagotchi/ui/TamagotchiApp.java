package org.example.tamagotchi.ui;

import org.example.tamagotchi.model.Tamagotchi;

import java.util.ArrayList;
import java.util.Scanner;

public class TamagotchiApp {
    public static void main(String[] args) {

        Tamagotchi yibis = new Tamagotchi("Javapoo", 100, 0);

        ArrayList<Tamagotchi> tamagotchis = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean jugar = true;
        int alimento = 0;
        int minutosJugando = 0;
        int horas = 0;

        while(jugar){

            System.out.println(Colors.VERDE + "Elige un número para realizar una acción:" + Colors.RESET);
            System.out.println(Colors.AZUL + "(1) Alimentar a " + yibis.getNombre() + Colors.RESET);
            System.out.println(Colors.CIAN + "(2) Jugar con " + yibis.getNombre() + Colors.RESET);
            System.out.println(Colors.AMARILLO + "(3) Hacer que descanse " + yibis.getNombre() + Colors.RESET);
            System.out.println(Colors.MAGENTA + "(4) Ver el estado de " + yibis.getNombre() + Colors.RESET);
            System.out.println(Colors.ROJO + "(5) Salir" + Colors.RESET);

            try {
                int opcionElegida = scanner.nextInt();
                switch(opcionElegida) {
                    case 1:
                        System.out.println("¿Cuanto alimento quieres darle? (0 a 100 gramos)");
                        alimento = scanner.nextInt();
                        yibis.alimentar(alimento);
                        break;
                    case 2:
                        System.out.println("¿Cuantos minutos quieres jugar con " + yibis.getNombre() + "?");
                        minutosJugando = scanner.nextInt();
                        yibis.jugar(minutosJugando);
                        break;
                    case 3:
                        System.out.println("¿Cuantas horas descansará " + yibis.getNombre() + "?");
                        horas = scanner.nextInt();
                        yibis.descansar(horas);
                        break;
                    case 4:
                        System.out.println(yibis);
                        yibis.verEstado();
                        break;
                    case 5:
                        System.out.println("Hasta luego!");
                        jugar = false;
                        break;
                    default:
                        System.out.println("No es una opción válida!");
                }
            } catch (Exception e) {
                System.out.println("Entrada no válida. \nIngresa un número de las opciones mostradas");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
