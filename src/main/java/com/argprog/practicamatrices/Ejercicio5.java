/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.practicamatrices;

import java.util.Scanner;

/**
 *
 * @author di3
 * 5. Una empresa constructora desea llevar a cabo un premio para sus obreros 
 * que hayan realizado horas extras en los últimos 6 meses. Para ello, 
 * lleva una matriz de control de 15 filas x 6 columnas, donde cada fila 
 * corresponde a un empleado distinto y donde cada columna representa el 
 * total de horas trabajadas por mes. El monto de horas normal trabajado x 
 * mes es de 8 horas diarias, 5 días a la semana, 4 semanas por mes, es 
 * decir: 160 horas. Todo monto superior a este es considerado como horas extras.

Se desea un programa que permita la carga de horas trabajadas por cada obrero 
* y que sea capaz de determinar aquellos que hayan realizado horas extras. 
* Para registrar las horas extras realizadas se utilizará un vector de 15 
* posiciones en donde se deberá calcular y almacenar la cantidad de horas 
* extras de cada obrero. En caso de que no haya realizado horas extras, deberá 
* incluirse un número 0.
 */


public class Ejercicio5 {
    
    private int[][] horasMensuales = new int[15][6];
    
    private int[] horasExtra = new int[15];
    
    public void cargarhoras(){
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < horasMensuales.length; row++) {
            for (int col = 0; col < horasMensuales[row].length; col++) {
                System.out.println(String.format("Horas trabajadas por empleado %s en mes %s:", row + 1, col + 1));
                horasMensuales[row][col] = input.nextInt();
            }
        }
    }
    
    public void determinarHorasExtra(){
        for (int row = 0; row < horasMensuales.length; row++) {
            for (int col = 0; col < horasMensuales[row].length; col++) {
                horasExtra[row] += (horasMensuales[row][col] > 160)? (horasMensuales[row][col] - 160) : 0;
            }
        }
    }
    
    public void mostrarHorasExtra(){
        for (int row = 0; row < horasExtra.length; row++) {
            System.out.println("Las horas extra del empleado " + (row + 1) + " son: " + horasExtra[row]);
        }
    }
}
