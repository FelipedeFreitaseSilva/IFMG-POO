/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.comparacao;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente a = new Cliente("a", "123");
        Cliente b = new Cliente("b", "123");
        
        boolean iguais = a.equals(b);
        
        int stop = 0;
        
    }
    
}
