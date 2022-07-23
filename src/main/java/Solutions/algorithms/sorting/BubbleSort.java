package Solutions.algorithms.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] unsortedArray = {5,6,7,3,2,1};
        bubbleSort(unsortedArray);

    }
    public static void bubbleSort(int[] unsortedArray) {
        boolean swap = true;

        while (swap) {
            swap = false;
            for(int i =0 ; i < unsortedArray.length -1 ; i ++) {
                if (unsortedArray[i] > unsortedArray[i+1]) {
                    swap = true;
                    int temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i+1];
                    unsortedArray[i+1]= temp;
                }
            }
            for (int x : unsortedArray) {
                System.out.print(x + " ") ;
            }
            System.out.println();
        }
    }
}
