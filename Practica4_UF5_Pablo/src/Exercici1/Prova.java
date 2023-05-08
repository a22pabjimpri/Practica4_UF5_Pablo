/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercici1;

/**
 *
 * @author Pablo Jiménez
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LlistaDeNoms llista = new LlistaDeNoms();

        try {
            llista.afegirNom("Pablo");
            llista.afegirNom("Pepe");
            System.out.println("Número de persones: " + llista.getNumeroElements());
            System.out.println(llista.imprimirNoms());
            
            llista.insertarNomEnPosicio(2, "Mengano");
            llista.insertarNomEnPosicio(0, "Mauricio");
            System.out.println("Número de persones: " + llista.getNumeroElements());
            System.out.println(llista.imprimirNoms());

            System.out.println("Nom en la posició 3: " + llista.obtenirNom(3));

            llista.eliminarNom(1);
            System.out.println("Número de persones: " + llista.getNumeroElements());
            System.out.println(llista.imprimirNoms());
            
            System.out.println(llista.buscarNom("Mengano"));

        } catch (RepetitException e) {
            System.out.println(e.getMessage());
        } catch (ForaRangException e) {
            System.out.println(e.getMessage());
        }
    }

}
