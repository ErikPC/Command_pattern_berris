package edu.poniperro.commands.comandos;

import edu.poniperro.commands.Cuenta;
import edu.poniperro.commands.intefaces.Order;

public class Retirar implements Order {
    private Cuenta cuenta;
    private double berri;

    public Retirar(Cuenta cuenta, double berri) {
        this.cuenta = cuenta;
        this.berri = berri;
    }

    private double getBerri() {
        return berri;
    }

    private Cuenta getCuenta() {
        return cuenta;
    }

    @Override
    public void execute() {
        getCuenta().retirar(getBerri());
    }

}
