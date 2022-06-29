import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeWord {
    static boolean strStatic(String str, int b, int e){
//        如果只有一个字符
        boolean strStatic;
        if (b == e){
            return true;
        }
//        如果首字符和尾字符不想等
        if (str.charAt(b)!=str.charAt(e)){
            return false;
        }
        if (b<e-1){
            return strStatic(str,b+1,e-1);
        }
        return true;
    }

    static boolean isPalindrome(String str){
        int n = str.length();
        if (n == 0){
            return true;
        }
        return strStatic(str,0,n-1);
    }

    public static void main(String[] args) {
        String str = "madam";
        String str1 = "adieu";
        String str2 = "rotor";
        String str3 = "";
        String str4 = " ";
        System.out.println("Palindrome? " + isPalindrome(str));
        System.out.println("Palindrome? " + isPalindrome(str1));
        System.out.println("Palindrome? " + isPalindrome(str2));
        System.out.println("Palindrome? " + isPalindrome(str3));
        System.out.println("Palindrome? " + isPalindrome(str4));
    }

    @Test
    void test(){
        Assertions.assertTrue(isPalindrome("madam"));
        Assertions.assertFalse(isPalindrome("adieu"));
        Assertions.assertTrue(isPalindrome("rotor"));
    }
}
