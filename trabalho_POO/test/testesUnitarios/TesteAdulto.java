/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesUnitarios;


import modelo.Adulto;


/**
 *
 * @author mateus
 */
public class TesteAdulto {
    public static void main(String[] args) {
        Adulto Paulo = new Adulto("Paulinho","123456789",31);
        
        System.out.println(Paulo.getLogin());
        
    
}
}
