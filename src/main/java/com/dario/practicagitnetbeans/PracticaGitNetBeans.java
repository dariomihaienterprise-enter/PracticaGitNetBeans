/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.dario.practicagitnetbeans;

/**
 *
 * @author dario
 */
public class PracticaGitNetBeans {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(saludar("DAW"));
    }

    public static String saludar(String nombre) {
        return "Hola, " + nombre + ". Proyecto versionado con Git desde NetBeans.";
    }
}