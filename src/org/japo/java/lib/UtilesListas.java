/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

/**
 *
 * @author - Raúl Granel Blasco - raul.granel@gmail.com
 */
public class UtilesListas {

    // Comparar listas.
    public static int compararListas(String[] lista1, String[] lista2) {

        int aciertos = 0;

        for (String num1 : lista1) {
            for (String num2 : lista2) {
                if (num1.equals(num2)) {
                    aciertos++;
                }
            }
        }
        return aciertos;
    }

    public static void mostrarLista(String[] lista, String titulo) {

        System.out.println(titulo);

        for (int i = 0; i < lista.length; i++) {
            System.out.println("=");
        }
        for (String item : lista) {
            System.out.printf("Item.......: %s\n", item);
        }
    }
}
