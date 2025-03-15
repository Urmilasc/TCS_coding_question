import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class array_map_with_count {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter size of array");
       int n = scanner.nextInt();
       char[] arr= new char[n];

       for(int i=0 ;  i < arr.length ; i++){
        arr[i] = scanner.next().charAt(0);

       }

       HashMap<Character , Integer> m = new HashMap<>();
       char ans = '/';
       for(int i=0 ; i < arr.length ; i++ ){
        m.put(arr[i], m.getOrDefault(arr[i],0) + 1);
       }

       for(int i=0 ; i < arr.length ; i++){
        if(m.get(arr[i]) % 2 != 0){
            System.out.println(arr[i]);
            break;
        }
       
       }
       
       
   } 
}
