package edu.poniperro.invoker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.poniperro.commands.Cuenta;
import edu.poniperro.commands.comandos.DepositarImpl;
import edu.poniperro.commands.comandos.Retirar;
import edu.poniperro.commands.invoker.Invoker;

public class TestInvoker {

    Cuenta chopper = new Cuenta(1, 50);
    Retirar retiro = new Retirar(chopper, 50);
    DepositarImpl deposito = new DepositarImpl(chopper, 5000);
    Invoker invoker = new Invoker();

    @DisplayName("Test integracion invoker")
    @Test
    void testInvoker() {
        invoker.recibirOperacion(retiro);
        invoker.recibirOperacion(deposito);
        invoker.realizarOperaciones();
        assertEquals(chopper.getBerris(), 5000);
    }

}