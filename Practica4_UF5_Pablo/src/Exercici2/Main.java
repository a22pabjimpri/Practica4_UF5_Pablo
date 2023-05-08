/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercici2;

/**
 *
 * @author Pablo Jiménez
 */
public class Main {
    public static void main(String[] args) {
        Loteria loteria = new Loteria();
        try {
            loteria.nou(1);
            loteria.nou(2);
            loteria.nou(3);
            loteria.nou(4);
            loteria.nou(5);
            loteria.nou(6);
            loteria.nou(5); // Llençara la excepcio de repetit
        } catch (RepetitException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(loteria.imprimirPremiats());
        
        if(loteria.premiat(3)==true){
            System.out.println("El numero ha sigut premiat");
        }
        if(loteria.premiat(7)==false){
            System.out.println("El numero no ha sigut premiat");
        }
        
    }
}
