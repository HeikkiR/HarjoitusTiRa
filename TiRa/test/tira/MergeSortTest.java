/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tira;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Heikki Rantala
 * @version 0.8
 */
public class MergeSortTest {
    
        private int[] taulu1;
        private int[] taulu2;
        private int[] taulu3;
        private int[] taulu4;
        private int max = 30000;
    
    /**
     * Luo neljä järjestettävää taulukkoa jotka ovat aina kymmenen kertaa toisiaan suurempia
     */
    @Before
    public void setUp() {
        taulu1 = new int[1000];
        taulu2 = new int[10000];
        taulu3 = new int[100000];
        taulu4 = new int[1000000];
        
        Random sattuma = new Random();
        
        for (int i = 0; i < taulu1.length; i++) {
            taulu1[i] = sattuma.nextInt(max);
            }
        for (int i = 0; i < taulu2.length; i++) {
            taulu2[i] = sattuma.nextInt(max);
            }
    
        for (int i = 0; i < taulu3.length; i++) {
            taulu3[i] = sattuma.nextInt(max);
            }
        
        for (int i = 0; i < taulu4.length; i++) {
            taulu4[i] = sattuma.nextInt(max);
            }
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sort method, of class MergeSort.
     */
    @Test
    public void testSort() {
        
        MergeSort kokeiltava = new MergeSort();
        
        // 10000 alkion taulukon järjestäminen ja testaaminen
                
        
        long aloitusAika = System.currentTimeMillis();
        
        kokeiltava.sort(taulu1);
        
        long lopetusAika = System.currentTimeMillis();
        long kokonaisAika = lopetusAika - aloitusAika;
        
        System.out.println("msort 1000 alkioinen taulukko " + kokonaisAika);
        
        if(!tarkastaja(taulu1)) {
            fail("Virhe.");
            }

        // suuremman taulukon järjestäminen
        
        aloitusAika = System.currentTimeMillis();
        
        kokeiltava.sort(taulu2);
        
        lopetusAika = System.currentTimeMillis();
        kokonaisAika = lopetusAika - aloitusAika;
        
        System.out.println("msort 10000 alkioinen taulukko " + kokonaisAika);
        
        if(!tarkastaja(taulu2)) {
            fail("Virhe.");
            }
        
        // ... ja vielä suuremman järjestäminen
        
        aloitusAika = System.currentTimeMillis();
        
        kokeiltava.sort(taulu3);
        
        lopetusAika = System.currentTimeMillis();
        kokonaisAika = lopetusAika - aloitusAika;
        
        System.out.println("msort 100000 alkioinen taulukko " + kokonaisAika);
        
        if(!tarkastaja(taulu3)) {
            fail("Virhe.");
            }

        // ... ja tosi suuren taulukon järjestäminen järjestäminen
        
        aloitusAika = System.currentTimeMillis();
        
        kokeiltava.sort(taulu4);
        
        lopetusAika = System.currentTimeMillis();
        kokonaisAika = lopetusAika - aloitusAika;
        
        System.out.println("msort 1000000 alkioinen taulukko " + kokonaisAika);
        
        if(!tarkastaja(taulu4)) {
            fail("Virhe.");
            }
        
        assertTrue(true);
    }
    /**
     * Järjestyksen tarkastus metodi
     */   
    private boolean tarkastaja(int[] taulukko) {
    for (int i = 0; i < taulukko.length - 1; i++) {
      if (taulukko[i] > taulukko[i + 1]) {
        return false;
      }
    }
    return true;
  }
}
