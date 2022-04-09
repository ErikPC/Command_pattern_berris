package edu.poniperro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.poniperro.commands.Cuenta;

public class CuentaTest {

    Cuenta luffy = new Cuenta(1, 500);
    Cuenta usopp = new Cuenta(3, 200);

    @DisplayName("Test Cuenta retirar()")
    @Test
    void testRetirar() {
        luffy.retirar(250);
        assertEquals(luffy.getBerris(), 250);
    }

    @DisplayName("Test Cuenta depositar()")
    @Test
    void testDepositar() {
        usopp.depositar(2000);
        assertEquals(usopp.getBerris(), 2200);
    }
}
