package com.example.psp_tema2_ej1;

public class Hilo extends Thread {
    private char caracter;
    private int repeticiones;

    public Hilo(char caracter, int repeticiones) {
        this.caracter = caracter;
        this.repeticiones = repeticiones;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(caracter);
        }
    }
}
