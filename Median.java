import java.util.Arrays;

public class Median {
    public static void main(String[] args)
   {
	int[] arr = {4, 7, 1, 2, 5, 6};
	int n = 6;
	System.out.print("The median of the array is: ");
	double ans = getMedian(arr, n);
    System.out.println(ans);
   }

   public static double getMedian(int[] arr, int n){

    Arrays.sort(arr);

    double ans =0;
    if(n % 2 == 0){
        int index1 = (n/2) -1;
        int index2 = (n/2);

        ans = (double)(arr[index1] + arr[index2]) /2;

    }
    else{
        ans = (double)arr[(n/2)];
    }

    return ans;
   }
}
