package edu.poniperro.commands;

public class Cuenta {

    private int id;
    private double berris;

    public Cuenta(int id, double berris) {
        this.id = id;
        this.berris = berris;
    }

    public double getBerris() {
        return berris;
    }

    public int getId() {
        return id;
    }

    public void retirar(double berris) {
        this.berris = getBerris() - berris;
        System.out.println(
                "[COMANDO RETIRAR]\nNami ha venito y te ha robado: " + berris + "\n" + "Cuenta: " + getId() + "\n" +
                        "Nami te ha dejado con: " + getBerris());
        System.out.println("La marina no logra encontrar a la gata ladrona");
    }

    public void depositar(double berris) {
        this.berris = getBerris() + berris;
        System.out.println("[COMANDO DEPOSITAR]\nEsperemos que Nami no te haya visto\n" + "Cuenta: " + getId() + "\n" +
                "Te quedan: " + getBerris());
    }
}
