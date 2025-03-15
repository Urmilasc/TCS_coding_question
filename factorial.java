
import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eneter number : =  ");
        int n = scanner.nextInt();

        int ans = factorial(n);
        System.out.println(ans);
    }

    public static int factorial(int n){

        if(n <= 1){
            return 1;
        }

        return n * factorial(n-1);
    }
}
