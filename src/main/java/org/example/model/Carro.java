package org.example.model;

public class Carro {

    private int velocidad;
    private int cambioVelocidad;
    private int velocidadMax;

    public int getVelocidad(){
        return velocidad;
    }

    public int getCambioVelocidad() {
        Carro carro = new Carro();

        if (carro.velocidad == 0) {
            cambioVelocidad = 1;
        }
        return cambioVelocidad;
    }


    public int getVelocidadMax() {
        Carro carro = new Carro();

        velocidadMax = 0;
        for (int i = 0; i < 80; i++) {
            if (carro.cambioVelocidad < 80){
                velocidadMax += 1;
            }
        }
        return velocidadMax;
    }
}
