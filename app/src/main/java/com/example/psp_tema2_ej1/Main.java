package com.example.psp_tema2_ej1;

public class Main {
    public static void main(String[] args) {
        Hilo hebra1 = new Hilo('Z', 25);
        Hilo hebra2 = new Hilo('X', 25);
        Hilo hebra3 = new Hilo('C', 25);

        hebra1.start();
        hebra2.start();
        hebra3.start();
    }

}
