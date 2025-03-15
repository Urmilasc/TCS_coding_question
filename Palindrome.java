import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean ans = findpalindrome(n);
        System.out.println(ans);


    }

    public static boolean findpalindrome(int n){

        int original = n;
        int rev =0;
        int temp=0;
        while( n > 0){

            temp = n % 10;
            rev = rev *10 + temp;
            n = n /10;
        }

        if( original == rev){
            return true;
        }
        return false;

    }
}
