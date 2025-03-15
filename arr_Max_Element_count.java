import java.util.Scanner;
public class arr_Max_Element_count {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enetr the size of array :");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enetr the elemenets of array :");
        for(int i=0 ; i < arr.length; i++){
            int element = scanner.nextInt();
            arr[i] = element;
        }

        int ans = count(arr);
        System.out.println("count is = " +ans);
    }

    public static int count(int[] arr){

        int max = arr[0];
        int count = 1;
        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
                count++;
            }
        }

        return count;
    }
}
