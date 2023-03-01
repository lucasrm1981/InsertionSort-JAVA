package insertionsort;
/**
 *
 * @author lucas.monteiro
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int quantidade = 10000;
    int[] vetor = new int[quantidade];

    for (int i = 0; i < vetor.length; i++) {
     vetor[i] = (int) (Math.random()*quantidade);
     /*
     * Impressão dos números gerados Aleatóriamente
     System.out.print(vetor[i]+"\n");
     */
    }

     long tempoInicial = System.currentTimeMillis();

     insertionSort(vetor);

     long tempoFinal = System.currentTimeMillis();

     System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
    
    }    

public static void insertionSort(int[] vetor) {
    int j;
    int key;
    int i;

    for (j = 1; j < vetor.length; j++)
    {
      key = vetor[j];
      for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
      {
         vetor[i + 1] = vetor[i];
       }
        vetor[i + 1] = key;
    }
    
    /* Impressão da visualização
    * Caso deseje imprimir a ordeção irá implicar no desempenho*/
    for(int x=0; x<vetor.length;x++){
        System.out.print(vetor[x]+"\n");
    }
}
}