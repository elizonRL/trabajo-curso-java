/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author elizo
 */
public class Cuenta extends Persona{
    private int numeroDeCuenta;
    private double saldo;
    private double deposito;

    public Cuenta(String nombre, String apellido, int numeroDeCuenta, double saldo, double deposito){
        super(nombre, apellido);
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo= saldo;
        this.deposito = deposito;
    }
    public double Deposito(double deposito){
        saldo += deposito;
        mostrarDatos(deposito);
        return saldo;
    }
    public double Retiro(double deposito){
        if(saldo < deposito ){
           System.out.print("Fondos Insuficientes");
        }else{
            saldo -= deposito;
            mostrarDatos(deposito);
        }
        return saldo;
    }
    public void mostrarDatos(double deposito){
        System.out.print("La cantidad a depositar es: "+ deposito + "\nEn el numero de ceunta No.: "
                +numeroDeCuenta+"\nNombre: "+ getNombre() + "\npellido: "+ getApellido()
                +"\nSaldo: "+ saldo  +"\n");
    }
    
    
}
