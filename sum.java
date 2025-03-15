import java.util.Scanner;

public class sum{
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        int ans = (findsum(n));
        System.out.println(ans);

        int ans2 = optimalSum(n);
        System.out.println(ans2);

    }

    public static int findsum(int n){

        if(n < 0 || n == 0){
            return 0;
        }

        int i=0;
        int sum = 0;

        while(i <= n){
            sum = sum +i;
            i++;
        }
        return sum;
    }

    public static int optimalSum(int n){
        if(n < 0 || n == 0){
            return 0;
        }

        int sum= n * (n+1) /2;
        return sum;
        
    }
}