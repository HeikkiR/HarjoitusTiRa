
package tira;

/**
 * Mergesort algoritmi tira-harjoitustyöhön
 * 
 * 
 * @author Heikki Rantala
 * @version 0.8
 */
public class MergeSort {
  private int[] taulukko;
  private int[] apu;

/**
 * Varsinainen kutsuttava metodi joka laittaa leikin käyntiin
 * @param taulu on taulukko kokonaislukuja
 */  
  public void sort(int[] taulu) {
    this.taulukko = taulu;
    this.apu = new int[taulu.length];
    mergesort(0, taulu.length - 1);
  }

  /**
   * Rekursiivinen metodi joka hajottaa taulukon osiin
   * 
   * @param ala
   * @param yla 
   */
  
  private void mergesort(int ala, int yla) {

    if (ala < yla) {
        int middle = ala + (yla - ala) / 2;
        mergesort(ala, middle);
        mergesort(middle + 1, yla);
        merge(ala, middle, yla);
    }
  }
  
/**
 * Osien yhdistäminen ja varsinainen kärjestäminen
 * 
 * 
 * @param pieni
 * @param keski
 * @param suurin 
 */
  private void merge(int pieni, int keski, int suurin) {

    for (int i = pieni; i <= suurin; i++) {
        apu[i] = taulukko[i];
    }

    int i = pieni;
    int j = keski + 1;
    int k = pieni;

    while (i <= keski && j <= suurin) {
        if (apu[i] <= apu[j]) {
            taulukko[k] = apu[i];
            i++;
      } 
        else {
        taulukko[k] = apu[j];
        j++;
      }
      k++;
    }
    
    while (i <= keski) {
      taulukko[k] = apu[i];
      k++;
      i++;
    }

  }
} 

