public class Contagem {

 public static int Contagem2(int n, int[] arr) {
   int count = 0;
   for (int i = 0; i < arr.length; i++) {
     if (arr[i] >= 1 && arr[i] <= n) {
       count++;
      }
    }
   return count;
  }
  public static void main(String[] args) {
   System.out.println(Contagem2(5, new int[] {1, 3, 7, 4, 2})); // 3
   System.out.println(Contagem2(10, new int[] {5, 12, 15, 1, 9})); // 4
  }
}