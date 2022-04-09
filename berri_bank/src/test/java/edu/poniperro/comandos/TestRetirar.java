package edu.poniperro.comandos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.poniperro.commands.Cuenta;
import edu.poniperro.commands.comandos.Retirar;

public class TestRetirar {

    Cuenta franky = new Cuenta(1, 15000);
    Retirar retiro = new Retirar(franky, 10000);

    @DisplayName("Test execute() de retirar")
    @Test
    void testExecute() {
        retiro.execute();
        assertEquals(franky.getBerris(), 5000);
    }
}
