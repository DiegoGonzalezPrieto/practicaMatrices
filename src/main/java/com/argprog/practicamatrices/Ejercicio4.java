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
 * 4. Una casa de comida rápida utiliza una matriz de 20 filas y 5 columnas para 
 * determinar cada plato del menú y sus correspondientes ingredientes que 
 * contiene. Para ello, cada fila representa un plato principal en donde en la 
 * primera columna se especifica su nombre (por ejemplo: Milanesa), y en las 
 * demás los posibles acompañamientos que puede tener el plato (por ejemplo, 
 * puré, ensalada rusa, papas fritas, ensalada de lechuga y tomate, ensalada 
 * de zanahoria, etc). En caso de que tenga el plato menos de 4 tipos de 
 * acompañamiento, en la matriz se cargará la palabra Ninguno en las posiciones 
 * que queden vacías.

Se desea un programa que sea capaz de permitir la carga de la matriz, 
* de buscar un plato en particular que un cliente ingrese por teclado y 
* mostrarle de forma automática los posibles acompañamientos del mismo. 
 */

public class Ejercicio4 {
    private String[][] menu = new String[20][5];
    
    private String[] platos = new String[20];
    
    public void cargarMenu(){
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < menu.length; row++) {
            for (int col = 0; col < menu[row].length; col++) {
                if (col == 0) {
                    System.out.println("Ingresar nombre de plato:");
                } else {
                    System.out.println("Ingresar acompañamiento " + col + " para " + menu[row][0] + ":");
                }
                String acompañamiento = input.nextLine();
                menu[row][col] = "" != acompañamiento? acompañamiento : "Ninguno";
            }
        }
        for (int i = 0; i < platos.length; i++) {
            platos[i] = menu[i][0];
        }
    }
    
    public void mostrarPlatos(){
        System.out.println("Los platos son:");
        for (String plato : platos) {
            System.out.println(plato);
        }
    }
    
    public void buscarPlato(){
        Scanner input = new Scanner(System.in);
        String seleccion = "";
        
        mostrarPlatos();
        
        System.out.println("\nIngresar plato a consultar:");
        
        seleccion = input.nextLine();
        
        for (int row = 0; row < menu.length; row++) {
            if (seleccion.equals(menu[row][0]))  {
                String resultado = "";
                
                System.out.println("\nLos acompañamientos para " + seleccion + " son:");
                
                for (int col = 1; col < menu[row].length; col++) {
                    String acompañamiento = menu[row][col];
                    resultado += (!acompañamiento.equals("Ninguno"))? acompañamiento + " " : "";
                }
                System.out.println(resultado + "\n");
                break;
            }
        }
            
    }
}
