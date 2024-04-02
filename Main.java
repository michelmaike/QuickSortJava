public class Main {
    public static void main(String[] args) {
        int[] sequencia = {5,2,9,1,5,6};

        QuickSort quicksort = new QuickSort();
        
        quicksort.ordenar(sequencia);
        
        System.out.println("sequencia ordenada:");
        for(int numero : sequencia) {
            System.out.print(numero+" ");
        }
    }
}
