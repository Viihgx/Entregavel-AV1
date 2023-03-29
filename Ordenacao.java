import java.util.Arrays;

public class Ordenacao {
  public static void quickSort(int[] arr, int begin, int end) {
    if (begin < end) {
      int partitionIndex = partition(arr, begin, end);
      quickSort(arr, begin, partitionIndex-1);
      quickSort(arr, partitionIndex+1, end);
    }
  }
  private static int partition(int[] arr, int begin, int end) {
    int pivot = arr[end];
    int i = (begin-1);
      for (int j = begin; j < end; j++) {
        if (arr[j] <= pivot) {
         i++;
         int swapTemp = arr[i];
         arr[i] = arr[j];
         arr[j] = swapTemp;
        }
      }
  
    int swapTemp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = swapTemp;
     return i+1;
  }
   public static void main(String[] args) {
    int[] unsortedArr = { 5, 3, 7, 1, 8, 2, 9, 4 };
    quickSort(unsortedArr, 0, unsortedArr.length-1);
    System.out.println(Arrays.toString(unsortedArr)); // [1, 2, 3, 4, 5, 7, 8, 9]
  }
}