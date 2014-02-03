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
        taulukko[2] =3;
        taulukko[3] = 21;
        taulukko[4] = 877;
        taulukko[5] = 9;
        
        Jarjestaja sortti = new Jarjestaja();
        sortti.kupla(taulukko);
        
        
        System.out.println(taulukko[0]);
        System.out.println(taulukko[1]);
        System.out.println(taulukko[2]);
        System.out.println(taulukko[3]);
        System.out.println(taulukko[4]);
        System.out.println(taulukko[5]);
    }
    
}