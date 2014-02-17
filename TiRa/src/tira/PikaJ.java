
package tira;

/**
 * Quicksort algoritmi tira harjoitustyöhön
 * 
 * @author Heikki Rantala
 * @Version 0.8  mutta pitäisi olla aika kuosissa
 */
public class PikaJ {
    
    
 /**
 * Quicksort-toteutuksen varsinainen kutsuttava metodi.
 * 
 * @param taulu taulukko
 */ 
     
    public void sort(int taulu[]) {
        quick(taulu,0,taulu.length - 1);
    }

    
    /**
     * Quicksortin apumetodi
     * 
     * @param taulu tuolukko kokonaislukuja
     * @param vasen kokonaisluku paikka taúlukossa
     * @param oikea kokonaisluku paikka taulukossa
     * @return 
     */
    
    private int jako(int[] taulu, int vasen, int oikea) {
        
      int i = vasen;
      int j = oikea;
      int apu;
      
      /////////////////////////////
      
      int kohta = taulu[vasen];  // Parempi olisi random kohta, mutta ei ehkä niin mielenkiintoinen vertailusssa.
     
      /////////////////////////////
      
      while (i <= j) {
            while (taulu[i] < kohta)
                  i++;
            while (taulu[j] > kohta)
                  j--;
            if (i <= j) {
                  apu = taulu[i];
                  taulu[i] = taulu[j];
                  taulu[j] = apu;
                  i++;
                  j--;
            }
      };
     
      return i;
    }
 
/**
 * Quicksortin apumetodi
 * 
 * @param taulu taulukko
 * @param vasen kokonaisluku paikka taulukossa
 * @param oikea kokonaisluku paikka taulukossa
 */
    
     private void quick(int taulu[], int vasen, int oikea) {
    
        int index = jako(taulu, vasen, oikea);
      
        if (vasen < index - 1)
            quick(taulu, vasen, index - 1);
        if (index < oikea)
            quick(taulu, index, oikea);
    }
    
}
