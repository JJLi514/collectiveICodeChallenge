public class FactorialNumber {
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
        int n = 3;
        boolean ans = isFactorial(n);
        System.out.println(ans);
    }
}
