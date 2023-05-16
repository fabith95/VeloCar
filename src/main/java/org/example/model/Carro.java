package org.example.model;

import com.sun.deploy.association.Association;

public class Carro {

    int velocidad;
    private int cambioVelocidad;
    public static int MAX_VELOCIDAD = 100;

<<<<<<< HEAD
=======

>>>>>>> c6117e305d467a4a184feb3314793ab7995bcdc1
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
<<<<<<< HEAD
        }
    }

    public void decelerar(int deceleracion) {

        velocidad -= deceleracion;
    }

=======
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

>>>>>>> c6117e305d467a4a184feb3314793ab7995bcdc1

}
