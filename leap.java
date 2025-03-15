import java.util.Scanner;

public class leap {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int n = scanner.nextInt();

        boolean ans = findLeap(n);
        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean findLeap(int n){

        if(n % 400 == 0){
            return true;
        }

        if(n % 100 == 0){
            return false;
        }

        if(n % 4 == 0){
            return true;
        }
        return false;
    }
}
