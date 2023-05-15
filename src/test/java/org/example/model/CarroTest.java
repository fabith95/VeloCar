package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarroTest {

    @Test
    void crearObjetoCarro(){
        Carro carro = new Carro();

        Assertions.assertNotNull(carro);
    }

    @Test
    void unCarroTieneVelocidadCeroPorDefecto(){
        Carro carro = new Carro();

        Assertions.assertEquals(0, carro.getVelocidad());
    }

    @Test
    void validarCambioDeVelocidad(){
        Carro carro = new Carro();

        Assertions.assertEquals(1, carro.getCambioVelocidad());
    }

    @Test
    void carroNoSuperaMasDeOchentaKM(){
        Carro carro = new Carro();

        Assertions.assertEquals(80, carro.getVelocidadMax());

    }
}
