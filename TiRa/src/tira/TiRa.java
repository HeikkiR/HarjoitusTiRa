/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tira;

/**
 *
 * @author Veikko
 */
public class TiRa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] taulukko = new int[6];
        taulukko[0] = 8;
        taulukko[1] = 4;
        taulukko[2] =6;
        taulukko[3] = 10;
        taulukko[4] = 7;
        taulukko[5] = 9;
        
        Jarjestaja sortti = new Jarjestaja();
        int[] jtaulu = new int[6];
        jtaulu = sortti.kupla(taulukko);
        
        
        System.out.println(jtaulu[0]);
        System.out.println(jtaulu[1]);
        System.out.println(jtaulu[2]);
        System.out.println(jtaulu[3]);
        System.out.println(jtaulu[4]);
        System.out.println(jtaulu[5]);
    }
    
}