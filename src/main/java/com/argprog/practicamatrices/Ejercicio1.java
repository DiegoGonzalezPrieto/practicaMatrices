/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.practicamatrices;

import java.util.Scanner;

/**
 *
 * @author di3
 *  1.      Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 
 * jugadores de futbol en los últimos 3 partidos que jugaron, donde cada fila 
 * representa a un jugador y cada columna a la cantidad de goles que hizo. Se 
 * necesita un programa que sea capaz de permitir la carga de los goles, 
 * calcular el promedio de goles realizado por cada jugador y almacenar 
 * el resultado en un vector de 5 posiciones, donde cada posición representará 
 * a un jugador. Tener en cuenta el siguiente diagrama para llevar a cabo el planteo:

Nota: tener en cuenta que el promedio de goles puede dar como resultado un número que NO SEA ENTERO.
 */
public class Ejercicio1 {
    
    private int[][] golesTotales = new int[5][3];
    private double[] promedioGoles = new double[5];

    public int[][] getGolesTotales() {
        return golesTotales;
    }

    public double[] getPromedioGoles() {
        return promedioGoles;
    }
    
    
    public Ejercicio1(){
        cargarGoles();
        calcularPromedios();
    }
    
    public void cargarGoles(){
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < golesTotales.length; row++){
            for (int col = 0; col < golesTotales[row].length; col++) {
                System.out.println(String.format("Ingresar el gol %s del jugador %s:", col, row));
                golesTotales[row][col] = input.nextInt();
            }
        }
    }
    
    public void calcularPromedios(){
        for (int row = 0; row < golesTotales.length; row++){
            int suma = 0;
            double promedio;
            for (int col = 0; col < golesTotales[row].length; col++) {
                suma += golesTotales[row][col];
            }
            // importante hacer el casteo de suma a (double) sino no se obtiene
            // el promedio preciso
            promedio = (double) suma / golesTotales[row].length; 
            promedioGoles[row] = promedio;
        }
    }
    
    public void imprimirGoles(){
        for (int row = 0; row < golesTotales.length; row++) {
            String jugador = "El jugador " + row + " ha hecho:\n";
            for (int col = 0; col < golesTotales[row].length; col++) {
                jugador += String.format("%s goles en el partido %s, ", golesTotales[row][col], col);
            }
            System.out.println(jugador);
        }

    }
    
    public void imprimirPromedios(){
        for (int i = 0; i < promedioGoles.length; i++) {
            System.out.println(String.format("El jugador %s tiene un promedio de %s goles.", i, promedioGoles[i]));
        }
    }
}
