/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.practicamatrices;

import java.util.Scanner;

/**
 *
 * @author di3
 * 
 * 2.      Una escuela primaria utiliza una matriz para calcular los promedios 
 * de sus alumnos. Para ello tienen una matriz de 10 filas, donde cada fila 
 * representa a un alumno y 4 columnas. Las primeras 3 columnas representan las 
 * notas de cada uno de los alumnos, mientras que la 4 es el promedio 
 * de las mismas. Se desea un programa que sea capaz de permitir la carga 
 * por teclado de las 3 notas de cada alumno, de realizar el cálculo automático 
 * del promedio, de guardar el mismo en la 4 columna y luego mostrar por 
 * pantalla cada una de las notas y el promedio obtenido. Por ejemplo.
 */
public class Ejercicio2 {
    
    double[][] notas = new double[10][4];

    public double[][] getNotas() {
        return notas;
    }
    
    public void cargarNotas(){
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < notas.length; row++) {
            for (int col = 0; col < notas[row].length -1; col++) {
                System.out.println(String.format("Ingresar nota %s de alumnx %s:", col, row + 1));
                notas[row][col] = input.nextDouble();
            }
        }
    }
    
    public void calcularPromedio(){
        
        for (int row = 0; row < notas.length; row++) {
            double suma = 0.0;
            for (int col = 0; col < notas[row].length -1 ; col++) {
                suma += notas[row][col];
            }
            notas[row][notas[row].length - 1] = suma / (notas[row].length - 1); 
        }
    }
    
    public void mostrarNotas(){
        for (int row = 0; row < notas.length; row++) {
            String output = String.format("Las notas de estudiante %s son:\n", (row +1));
            for (int col = 0; col < notas[row].length - 1; col++) {
                output += notas[row][col] + "   ";
            }
            output += "\nY el promedio es " + notas[row][notas[row].length - 1];
            System.out.println(output);
        }
    }
    
}
