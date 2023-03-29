public class NumeroPrimo {

    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
         for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
         return true;
    }
    public static void main(String[] args) {
      int num1 = 4;
      int num2 = 5;
        if (ehPrimo(num1)) {
            System.out.println(num1 + " é primo");
        } else {
            System.out.println(num1 + " não é primo");
        }
        if (ehPrimo(num2)) {
            System.out.println(num2 + " é primo");
        } else {
            System.out.println(num2 + " não é primo");
        }
    }
}

