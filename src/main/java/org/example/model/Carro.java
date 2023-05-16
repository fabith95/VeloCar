package org.example.model;

public class Carro {

    private int velocidad;
    private int cambioVelocidad;
    public static int MAX_VELOCIDAD = 100;


    public int getVelocidad() {

        return velocidad;
    }

    public int getCambioVelocidad() {
        Carro carro = new Carro();

        if (carro.velocidad == 0) {
            this.cambioVelocidad = 10;
        }
        return this.cambioVelocidad;
    }

    public void acelerar() {

        if (velocidad < MAX_VELOCIDAD) {
            this.velocidad += 10;
        } else {
            throw new RuntimeException("No debes superar la velocidad: " + MAX_VELOCIDAD);
        }
    }

    public void decelerar() {

        if (velocidad < MAX_VELOCIDAD) {
            this.velocidad += 10;
        }
        if (velocidad < MAX_VELOCIDAD) {
            this.velocidad -= 10;
        }


    }


}
