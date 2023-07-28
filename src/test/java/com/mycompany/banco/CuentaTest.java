/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.banco;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elizo
 */
public class CuentaTest {
    
    public CuentaTest() {
    }

    @Test
    public void testDeposito() {
        System.out.println("Deposito");
        double saldo= 6000;
        double deposito = 1000;
        double expResult = saldo +deposito;
        Cuenta instance = new Cuenta("Elizon", "Rodriguez", 121494, saldo, 0.0);
        double result = instance.Deposito(deposito);
         assertEquals(expResult, result, 0);
        //fail( "The test case is a prototype.");
    }
    
    @Test
    public void testRetiro(){
        System.out.println("Retiro");
        double saldo = 5000.25;
        double deposito = 1000.00;
        double expResult = saldo - deposito;
        Cuenta instance = new Cuenta("Elizon", "Rodriguez", 121494, saldo, 0.0);
        double result = instance.Retiro(deposito);
        assertEquals(expResult, result, 0);
    }
    
}
