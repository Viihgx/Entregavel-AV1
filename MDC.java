public class MDC {

 public static int mdc(int a, int b) {
    if (b == 0) {
      return a;
    }
    return mdc(b, a % b);
  }
  public static void main (String[] args) {  
   System.out.println(mdc(12, 18)); // 6
   System.out.println(mdc(35, 14)); // 7
  }
}