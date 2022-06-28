public class FactorialNumber {
    static boolean otherWays(int n){
        if (n == 0){
            return true;
        }
        return usingRecursive(n,2);
    }
    static boolean usingRecursive(int n, int i){
        if (n == 1){
            return true;
        }
        if (n % i != 0){
            return false;
        }
        if (n % i == 0 && n >= i){
            return usingRecursive(n / i,i + 1);
        }
        return true;
    }

    static boolean isFactorial(int n){
        for (int i = 1; ; i++){
            if (n % i == 0){
                n = n / i;
            }else {
                break;
            }
        }
        return n == 1;
    }


   public static void main(String[] args) {
        int n = 2;
        int n1 = 27;
        int n2 = 24;
        int n3 = 5040;
        System.out.println("The number " + n + " is Factorial? "+otherWays(n));
        System.out.println("The number " + n1 + " is Factorial? "+otherWays(n1));
        System.out.println("The number " + n2 + " is Factorial? "+otherWays(n2));
        System.out.println("The number " + n3 + " is Factorial? "+otherWays(n3));
    }
}
