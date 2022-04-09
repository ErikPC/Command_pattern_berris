package edu.poniperro.comandos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.poniperro.commands.Cuenta;
import edu.poniperro.commands.comandos.DepositarImpl;

public class TestDepositarImpl {

    Cuenta usopp = new Cuenta(3, 200);
    DepositarImpl deposito = new DepositarImpl(usopp, 2000);

    @DisplayName("Test execute() de Depositar")
    @Test
    void testExecute() {
        deposito.execute();
        assertEquals(usopp.getBerris(), 2200);
    }
}
