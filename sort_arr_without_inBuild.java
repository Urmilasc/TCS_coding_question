import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;
public class sort_arr_without_inBuild {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enetr the size of array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the lement of rray");
        for(int i=0 ; i < n ; i++){
            arr[i] = scanner.nextInt();
        }

        sort(arr,  n);

        for(int i=0 ; i < n ; i++){
            System.out.print(arr[i]);
        }
    }

    public static void sort(int[] arr, int n){

        int low=0;
        int mid=0;
        int high = n-1;

        while(mid <= high){


            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                
                mid++;
                
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                mid++;
                high--;
            }
        }
        
    }
}
