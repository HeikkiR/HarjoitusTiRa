
package tira;

/**
 * Mergesort algoritmi tira-harjoitustyöhön
 * 
 * @author Heikki Rantala
 * @version 0.8  varsinaisesti kokonaan uusi, mutta pitäisi toimia nyt
 */
public class MergeSort {
  private int[] taulukko;
  private int[] apu;

/**
 * Varsinainen kutsuttava metodi joka laittaa leikin käyntiin
 * 
 * @param taulu on taulukko kokonaislukuja joka siis järjestetään
 */  
  public void sort(int[] taulu) {
    this.taulukko = taulu;
    this.apu = new int[taulu.length];
    mergesort(0, taulu.length - 1);
  }

  /**
   * Rekursiivinen metodi joka hajottaa taulukon osiin
   * 
   * @param vasen
   * @param oikea 
   */
  
  private void mergesort(int vasen, int oikea) {

    if (vasen < oikea) {
        int keskiKohta = vasen + (oikea - vasen) / 2;
        mergesort(vasen, keskiKohta);
        mergesort(keskiKohta + 1, oikea);
        merge(vasen, keskiKohta, oikea);
    }
  }
  
/**
 * Osien yhdistäminen ja varsinainen järjestäminen
 * 
 * 
 * @param vasen
 * @param keski
 * @param oikea 
 */
  private void merge(int vasen, int keski, int oikea) {

    for (int i = vasen; i <= oikea; i++) {
        apu[i] = taulukko[i];
    }

    int i = vasen;
    int j = keski + 1;
    int k = vasen;

    while (i <= keski && j <= oikea) {
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

