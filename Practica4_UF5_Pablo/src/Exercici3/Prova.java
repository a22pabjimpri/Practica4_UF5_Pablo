/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercici3;

import java.util.List;

/**
 *
 * @author Pablo Jiménez
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Faltes dues cartes ");           
        }

        int n, k;
        try {
            n = Integer.parseInt(args[0]);
            k = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Les cartes han de ser nombres enters");
            return;
        }

        if (n <= 0 || k <= 0) {
            System.out.println("Les cartes han ser nombres positius");
            return;
        }

        Repartiment repartiment = new Repartiment();
        repartiment.remenarCartes();

        for (int i = 1; i <= k; i++) {
            List<String> ma = repartiment.donarMa(repartiment.cartes, n);
            System.out.println("Jugador " + i + ": " + ma);
        }
    }
}
