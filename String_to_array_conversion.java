import java.util.ArrayList;
import java.util.Scanner;

public class String_to_array_conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String[] arr = s.split(",");
        ArrayList<Integer> ans = new ArrayList<>();
        for(String i : arr){
            int num = Integer.parseInt(i);
            ans.add(num);
        }

        for(int i: ans){
            System.out.print(i + " ");
        }


    }
}
