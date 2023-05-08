/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercici3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ausias
 */
public class Repartiment {
    List<String> cartes;
    
    public Repartiment() {
        
        cartes = new ArrayList<>();        
        for (int i = 1; i <= 10; i++) {
            cartes.add(i + " d'ors");
        }
        cartes.add("sota d'ors");
        cartes.add("cavall d'ors");
        cartes.add("rei d'ors");

        for (int i = 1; i <= 10; i++) {
            cartes.add(i + " de copes");
        }
        cartes.add("sota de copes");
        cartes.add("cavall de copes");
        cartes.add("rei de copes");

        for (int i = 1; i <= 10; i++) {
            cartes.add(i + " d'espases");
        }
        cartes.add("sota d'espases");
        cartes.add("cavall d'espases");
        cartes.add("rei d'espases");

        for (int i = 1; i <= 10; i++) {
            cartes.add(i + " de bastos");
        }
        cartes.add("sota de bastos");
        cartes.add("cavall de bastos");
        cartes.add("rei de bastos");
    }
    
     public void remenarCartes() {
        Collections.shuffle(cartes);
    }
     
     public List<String> donarMa(List<String> baralla, int numCartes) {
        List<String> cartesRepartides = baralla.subList(0, numCartes);
        baralla.removeAll(cartesRepartides);
        return cartesRepartides;
    }
    
    
    
    
}
