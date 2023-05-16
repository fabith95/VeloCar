package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarroTest {

    @Test
    void crearObjetoCarro() {
        Carro carro = new Carro();
        Assertions.assertNotNull(carro);
    }

    @Test
    void unCarroTieneVelocidadCeroPorDefecto() {
        Carro carro = new Carro();
        Assertions.assertEquals(0, carro.getVelocidad());
    }

    @Test
    void validarCambioDeVelocidad() {
        Carro carro = new Carro();
        Assertions.assertEquals(10, carro.getCambioVelocidad());
    }

    @Test
    void acelerarVelocidadCarro() {
        Carro carro = new Carro();
        carro.acelerar();
        Assertions.assertNotEquals(0, carro.getVelocidad());
    }

    @Test
    void velocidadNoSuperiorMax_Velocidad() {
        Carro carro = new Carro();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        Assertions.assertThrows(RuntimeException.class, () -> carro.acelerar());
    }

    @Test
    void disminuirVelocidad() {
        Carro carro = new Carro();
        carro.velocidad = 50;
        carro.decelerar(20);
        Assertions.assertEquals(30, carro.velocidad);
    }

    @Test
    void frenarCarro(){
        Carro carro = new Carro();
        carro.velocidad = 30;
        carro.frenar();
        Assertions.assertEquals(0, carro.getVelocidad());
    }
}
