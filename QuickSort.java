public class QuickSort {

    public void ordenar(int[]vetor) {
        quickSort(vetor, 0, vetor.length-1);
    }
    private void quickSort(int[]vetor, int inicio, int fim) {
        if(inicio<fim) {
            int indParti = particionar(vetor, inicio, fim);
            quickSort(vetor,inicio, indParti-1);
            quickSort(vetor, indParti+1, fim);
        }
    }
    private int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = (inicio -1);
        for(int j=inicio;j<fim;j++) {
            if(vetor[j]<=pivo) {
                i++;
                int temp = vetor[i];
                vetor[i] =vetor[j];
                vetor[j] = temp;
            }
        }

        int temp = vetor[i+1];
        vetor[i+1] = vetor[fim];
        vetor[fim] = temp;
  
        return i+1;
    }
}
