package edu.poniperro.commands;

public class Cuenta {

    private int id;
    private double berris;

    public Cuenta(int id, double berris) {
        this.id = id;
        this.berris = berris;
    }

    private double getBerris() {
        return berris;
    }

    private int getId() {
        return id;
    }

    public void retirar(double berris) {
        this.berris = getBerris() - berris;
        System.out.println("[COMANDO RETIRAR] Nami ha venito y te ha robado: " + berris + "Cuenta: " + getId() +
                "Nami te ha dejado con: " + getBerris());
        System.out.println("La marina no logra encontrar a la gata ladrona");
    }

    public void depositar(double berris) {
        this.berris = getBerris() + berris;
        System.out.println("[COMANDO DEPOSITAR] Esperemos que Nami no te haya visto" + "Cuenta: " + getId() +
                "Te quedan: " + getBerris());
    }
}
