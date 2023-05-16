package org.example.model;

import com.sun.deploy.association.Association;

public class Carro {

    int velocidad;
    private int cambioVelocidad;
    public static int MAX_VELOCIDAD = 80;

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

    public void decelerar(int deceleracion) {
        velocidad -= deceleracion;
    }

    public void frenar() {
        if (velocidad > 0) {
            this.velocidad = 0;
        }else {
            throw new RuntimeException("Te encuentras a velocidad 0 km/h");
        }
    }
}
