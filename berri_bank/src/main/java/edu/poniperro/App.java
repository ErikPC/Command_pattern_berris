package edu.poniperro;

import edu.poniperro.commands.Cuenta;
import edu.poniperro.commands.comandos.DepositarImpl;
import edu.poniperro.commands.comandos.Retirar;
import edu.poniperro.commands.invoker.Invoker;

public class App {
    public static void main(String[] args) {
        Cuenta luffy = new Cuenta(1, 30000.25);

        DepositarImpl deposito = new DepositarImpl(luffy, 1);
        Retirar robo = new Retirar(luffy, 500.25);

        Invoker invoker = new Invoker();
        invoker.recibirOperacion(deposito);
        invoker.recibirOperacion(robo);

        invoker.realizarOperaciones();

        System.out.println(
                "################@@#OOooO##@#############\n" +
                        "###############@O°       .*#############\n" +
                        "###############o           °@###########\n" +
                        "######@@@@@####*          .o############\n" +
                        "######OooOO##@@@*    .OOO#@@@@@#########\n" +
                        "######Oo*°  ..°**.    °o****oO#@@#######\n" +
                        "######@@@@#*     .°.    °.     .o#######\n" +
                        "###########@O    .O@°   O@#.     #######\n" +
                        "############@o     ..    .     .O@######\n" +
                        "##############     .°°   .**°   °*#@####\n" +
                        "##############     #@@°  .@@@O    .#####\n" +
                        "#####@@@@@@###    o###*   O#@O     °@###\n" +
                        "#####o*°**O#@o   o@@@@o   o@o      *@###\n" +
                        "###@*    .o@#   .*****°   .      .o#####\n" +
                        "####O°   °*°  °****°°.     .°°*oO#@#####\n" +
                        "####@@#Oo**o*°.. .*@@@.   °@@@@@@#######\n" +
                        "######@@@@@o    °*O@@*    *#############\n" +
                        "###########°    oOOo°    .##############\n" +
                        "############o°.        °o###############\n" +
                        "############@@##OOOOOO#@@###############");
    }

}
