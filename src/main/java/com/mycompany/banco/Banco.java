/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author elizo
 */
public class Banco {
     public static String[] datosPersonas(){
        HashMap<String, String> personas = new HashMap<>();
        personas.put("nombre", "elizon");
        personas.put("apellido", "Rodrigez");
       //System.out.println(personas.get("nombre"));
       //System.out.println(personas.get("apellido"));
       
       String nombre = personas.get("nombre");
       String apellido = personas.get("apellido");
       return new String[]{nombre, apellido};
   }
    public static void operacion(int op){
        String[] ps = datosPersonas();
        Scanner sc = new Scanner(System.in);
        
        Cuenta cuenta = new Cuenta(ps[0], ps[1], 121494, 5000.25, 0.0);
        double input;
        switch (op) {
            case 1 -> {
                System.out.println("Ingrese la Cantidad a Retirar");
                input = sc.nextDouble();
                cuenta.Retiro(input); 
            }
            case 2 -> {
                System.out.println("Ingrese la Cantidad a Depositar");
                input = sc.nextDouble();
                cuenta.Deposito(input);
            }
            case 3 -> {
                cuenta.mostrarDatos(op);
            }
        }
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int salir;
       do{
        System.out.println("Eliga La opcion a Realizar....");
        System.out.println("1.Retiro de Efectivo");
        System.out.println("2.Deposito de Efectivo");
        System.out.println("3.Consulta de Balance");
        System.out.println("-------------------------------------------------------------------");
        int op = sc.nextInt();
        
        switch(op){
            case 1 -> operacion(op); 
            case 2 -> operacion(op);
            case 3 -> System.out.print("balance");
            default -> System.out.print("Opcion no valida");
        }
        System.out.println("Desea Salir? 1.Salir 2.Otra opercion");
        salir = sc.nextInt();
        }while(salir != 1);
    }
    public static void main(String[] args) {
      System.out.println("-------------------------------------------------------------------");
      System.out.println("\tBanco Credito Facil\n");
      menu();
      System.out.println("-------------------------------------------------------------------");
    }
    
}
