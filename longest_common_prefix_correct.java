import java.util.Arrays;
import java.util.Scanner;

public class longest_common_prefix_correct {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];

        for(int i=0 ; i < arr.length ; i++){
            arr[i] = scanner.nextLine();
        }

        String ans = longestCommonPrefix(arr, n);
        System.out.println(ans);

    }

    public static String longestCommonPrefix(String[] strs, int n){

        Arrays.sort(strs);
        
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        StringBuilder ans = new StringBuilder();
        for(int i=0 ; i < first.length; i++){
            if(first[i] != last[i]){
                break;
            }
            ans.append(first[i]);
        }

        return ans.toString();
    }
}
