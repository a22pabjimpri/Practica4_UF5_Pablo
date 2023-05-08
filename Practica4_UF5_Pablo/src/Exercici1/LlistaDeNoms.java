/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercici1;

import java.util.ArrayList;
import java.util.Iterator;

public class LlistaDeNoms {
    private ArrayList<String> llistaNoms;

    public LlistaDeNoms() {
        llistaNoms = new ArrayList<String>();
    }

    public int getNumeroElements() {
        return llistaNoms.size();
    }

    public void afegirNom(String nom) throws RepetitException {
        if (llistaNoms.contains(nom)) {
            throw new RepetitException("El nom ja existeix.");
        }
        llistaNoms.add(nom);
    }

    public void insertarNomEnPosicio(int index, String nom) throws ForaRangException {
        if (index < 0 || index > llistaNoms.size()) {
            throw new ForaRangException("La posició està fora de rang.");
        }
        llistaNoms.add(index, nom);
    }

    public String obtenirNom(int index) throws ForaRangException {
        if (index < 0 || index >= llistaNoms.size()) {
            throw new ForaRangException("La posició està fora de rang.");
        }
        return llistaNoms.get(index);
    }

    public void eliminarNom(int index) throws ForaRangException {
        if (index < 0 || index >= llistaNoms.size()) {
            throw new ForaRangException("La posició està fora de rang.");
        }
        llistaNoms.remove(index);
    }

    public String imprimirNoms() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < llistaNoms.size(); i++) {
            sb.append("Posició ").append(i).append(": ").append(llistaNoms.get(i)).append("\n");
        }
        return sb.toString();
    }

    public String buscarNom(String nom) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> iterator = llistaNoms.iterator();
        while (iterator.hasNext()) {
            String nomActual = iterator.next();
            if (nomActual.contains(nom)) {
                sb.append(nomActual).append("\n");
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
}
