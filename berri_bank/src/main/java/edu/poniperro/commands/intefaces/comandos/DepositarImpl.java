package edu.poniperro.commands.intefaces.comandos;

import edu.poniperro.commands.Cuenta;
import edu.poniperro.commands.intefaces.Order;

public class DepositarImpl implements Order {

    private Cuenta cuenta;
    private double berri;

    public DepositarImpl(Cuenta cuenta, double berri) {
        this.cuenta = cuenta;
        this.berri = berri;
    }

    private Cuenta getCuenta() {
        return cuenta;
    }

    private double getBerri() {
        return berri;
    }

    @Override
    public void execute() {
        getCuenta().depositar(getBerri());
    }

}
