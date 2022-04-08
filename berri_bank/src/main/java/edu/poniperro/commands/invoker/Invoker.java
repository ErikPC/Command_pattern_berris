package edu.poniperro.commands.invoker;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.commands.intefaces.Order;

public class Invoker {

    private List<Order> operaciones = new ArrayList<>();

    private List<Order> getOperaciones() {
        return operaciones;
    }

    public void recibirOperacion(Order operacion) {
        getOperaciones().add(operacion);
    }

    public void realizarOperaciones() {
        getOperaciones().forEach(o -> o.execute());
    }
}
