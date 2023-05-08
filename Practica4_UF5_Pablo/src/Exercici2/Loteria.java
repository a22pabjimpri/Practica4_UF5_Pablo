/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercici2;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Loteria {
    private Collection<Integer> numerosPremiats;

    public Loteria() {
        numerosPremiats = new HashSet<Integer>();
    }

    public void nou(int numero) throws RepetitException {
        if (numerosPremiats.contains(numero)) {
            throw new RepetitException("El número " + numero + " ja existeix en la loteria.");
        }
        numerosPremiats.add(numero);
    }

    public String imprimirPremiats() {
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = numerosPremiats.iterator();
        while (it.hasNext()) {
            sb.append(it.next() + "\n");
        }
        return sb.toString();
    }

    public boolean premiat(int n) {
        return numerosPremiats.contains(n);
    }
}
