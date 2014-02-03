
package tira;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

/**
 * Tulee tehdä vielä ainakin lisää testejä näytös tarkoituksiin.
 * 
 * Kaikki sortti algoritmit eivät ilmeisesti vielä toimi täydellisesti. 
 * Joko quicksort on naurettavan nopea tai sitten mergesort ei toimi vielä ihan kuten pitäisi.
 * 
 * @author Heikki Rantala
 * @version 0.2      3.2.2014
 */
public class JarjestajaTest {
    
    private int[] tauluk;
    private int[] tauluq;
    private int[] taulum;
    private int max = 30000;
    private int koko = 5000;
    
    /*
    public JarjestajaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    */
    
    /**
     * Tässä luodaan tarkastettava taulukko satunnaisia lukuja
     */
    @Before
    public void setUp() {
        
        tauluk = new int[koko];
        taulum = new int[koko];
        tauluq = new int[koko];
        
        Random sattuma = new Random();
        
        for (int i = 0; i < tauluk.length; i++) {
            tauluk[i] = sattuma.nextInt(max);
            }
        for (int i = 0; i < tauluq.length; i++) {
            tauluq[i] = sattuma.nextInt(max);
            }
    
        for (int i = 0; i < taulum.length; i++) {
            taulum[i] = sattuma.nextInt(max);
            }
    }
    /*
    @After
    public void tearDown() {
    }
    */
    
    /**
     * Test of kupla method, of class Jarjestaja.
     */
    
    @Test
    public void testKupla() {
        
        Jarjestaja instance = new Jarjestaja();
        
        long aloitusAika = System.currentTimeMillis();
        
        instance.kupla(tauluk);
        
        long lopetusAika = System.currentTimeMillis();
        long kokonaisAika = lopetusAika - aloitusAika;
        
        System.out.println("bublesort " + kokonaisAika);
        
        if(!tarkastaja(tauluk)) {
            fail("Virhe.");
            }
        assertTrue(true);
    }

    /**
     * Test of quickSort method, of class Jarjestaja.
     */    
    @Test
    public void testQuickSort() {
        
        Jarjestaja instance = new Jarjestaja();
        
        long aloitusAika = System.currentTimeMillis();
        
        instance.quickSort(tauluq);
        
        long lopetusAika = System.currentTimeMillis();
        long kokonaisAika = lopetusAika - aloitusAika;
        
        System.out.println("quicksort " + kokonaisAika);
        
        if(!tarkastaja(tauluq)) {
            fail("Virhe.");
            }
        assertTrue(true);
    }

    /**
     * Test of mergesort method, of class Jarjestaja.
     * 
     */   
    @Test
    public void testMergesort() {
        
        Jarjestaja instance = new Jarjestaja();
        
        long aloitusAika = System.currentTimeMillis();
        
        instance.mergesort(taulum);
        
        long lopetusAika = System.currentTimeMillis();
        long kokonaisAika = lopetusAika - aloitusAika;
        
        System.out.println("mergesort " + kokonaisAika);
        
        if(!tarkastaja(taulum)) {
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
