/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.practicamatrices;

/**
 *
 * @author di3
 * 
 * 3.      Se desea un programa que sea capaz de rellenar completamente con 
 * números 1 una matriz de 4 x 4 a excepción de su diagonal principal, la cual 
 * debe ser rellenada con números 0. Una vez realizada la carga, se desea 
 * mostrar la matriz de forma ordenada por pantalla. Tener como ejemplo la 
 * matriz que se presenta a continuación. 
 */
public class Ejercicio3 {
    
   int[][] matriz = new int[4][4];
   
   public void llenarMatriz(){
       for (int row = 0; row < matriz.length; row++) {
           for (int col = 0; col < matriz[row].length; col++) {
               matriz[row][col] = (row != col)? 1 : 0;
               }
           }
       }
   
   public void mostrarMatriz(){
       for (int row = 0; row < matriz.length; row++) {
           String line = "";
           for (int col = 0; col < matriz[row].length; col++) {
               line += matriz[row][col] + " ";
           }
           System.out.println(line);
       }
   }
    
}
