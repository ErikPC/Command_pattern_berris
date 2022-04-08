package edu.poniperro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.poniperro.commands.Cuenta;

public class CuentaTest {

    Cuenta luffy = new Cuenta(1, 500);
    Cuenta zoro = new Cuenta(2, 300);
    Cuenta usopp = new Cuenta(3, 200);

    @Test
    public void testRetirarDinero() {
        luffy.depositar(5.25);
        assertEquals(luffy.getBerris(), 505.25, 0);
    }

    @Test
    public void testDepositardinero() {
        zoro.depositar(200);
        assertEquals(zoro.getBerris(), 500, 0);
    }
}
