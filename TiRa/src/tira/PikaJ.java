
package tira;

/**
 * Quicksort algoritmi tira harjoitustyöhön
 * 
 * @author Heikki Rantala
 * @Version 1 
 */
public class PikaJ {
    
    
 /**
 * Quicksort-toteutuksen kutsuttava metodi.
 * 
 * @param taulu int taulukko
 */ 
     
    public void sort(int taulu[]) {
        if (taulu.length == 0) {       // tarkastetaan onko taulukon pituus 0
            return;
        }
        quick(taulu,0,taulu.length - 1);
    }

    
    /**
     * Quicksortin apumetodi jossa varsinainen järjestäminen tapahtuu.
     * 
     * @param taulu tuolukko kokonaislukuja
     * @param vasen int taulukon indeksi
     * @param oikea int taulukon indeksi
     * @return taulukko
     */
    
    private int jako(int[] taulu, int vasen, int oikea) {
        
      int i = vasen;
      int j = oikea;
      int apu;
      int pivot;
 
      
      // Valitaan pivot arvoksi ensimmäisen, keskimmäisen ja viimeisen luvun mediaani.
      
      int keski = vasen + (oikea-vasen) / 2;
      if ( (vasen <= keski && keski <= oikea) || (vasen >= keski && keski >= oikea) ) {
          pivot = taulu[keski];
      }
      else 
          if ((keski <= vasen && vasen <= oikea) || (keski >= vasen && vasen >= oikea) ) {
              pivot = taulu[vasen];
          }
          else {
              pivot = taulu[oikea];
          }
  
      /*
      pivot = taulu[vasen];  
            // Tyhmä vaihtoehtoinen pivot valinta joka tuottaa mielenkiintoisia tuloksia, jopa kaatumisen. Mukana kokeilemise helpottamiseksi.
      */
      
      // Järjestetään lukuja pivot arvoon verraten
      
      while (i <= j) {
            while (taulu[i] < pivot)
                  i++;
            while (taulu[j] > pivot)
                  j--;
            if (i <= j) {
                  apu = taulu[i];
                  taulu[i] = taulu[j];
                  taulu[j] = apu;
                  i++;
                  j--;
            }
      }
     
      return i;
    }
 
/**
 * Quicksortin apumetodi jossa tapahtuu rekursio
 * 
 * @param taulu int taulukko
 * @param vasen int taulukon indeksi
 * @param oikea int taulukon indeksi
 */
    
     private void quick(int taulu[], int vasen, int oikea) {
    
        int index = jako(taulu, vasen, oikea);
      
        if (vasen < index - 1)
            quick(taulu, vasen, index - 1);
        if (index < oikea)
            quick(taulu, index, oikea);
        
    }
    
}