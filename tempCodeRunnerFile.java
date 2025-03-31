import java.util.Scanner;

public class longest_common_prefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enetr the size of array");
        int n = scanner.nextInt();
        String[] arr = new String[n];
        System.out.println("enter the lement of rray");
        for(int i=0 ; i < n ; i++){
            arr[i] = scanner.nextLine();
        }

        longestCommonPrefix(arr, n);
    }

    public static void longestCommonPrefix(String[] strs , int n){

        String ans = " ";
        for(int i=0 ; i < n ; i++){
            // char ch = strs.charAt(i);
            

            int j=0;
            while(j < n){
                if(strs[i].charAt(j) == strs[i].charAt(j+1)){
                    ans = ans + strs[i].charAt(j);
                }
                else{
                    ans = ans + "";
                }
                j++;
            }

        }

        System.out.println(ans);
    }
}
