
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Count_element_in_arr {
    public static void main(String[] args){
        int[] arr = {5,10,15,10,15, 4, 4, 4, 4};

        // Arrays.sort(arr);

        // ArrayList<Integer> ans = new ArrayList<>();
        // int count =1;
        // for(int i=1 ; i  < arr.length; i++){
        //     if(arr[i] == arr[i-1]){
        //         count++;
        //     }
        //     else{
        //         ans.add(count);
        //         count = 1;
        //     }
           
        // }
        // ans.add(count);

        // System.out.println(ans);

        findCount(arr);
        
}

    public static void findCount(int[] arr){

        Arrays.sort(arr);
        Map<Integer, Integer> m= new HashMap<>();
        
        for(int num : arr){
            m.put(num, m.getOrDefault(num, 0) +1);
        }

        for(Map.Entry <Integer, Integer> entry : m.entrySet()){
            System.out.println(entry.getKey() + " ->" + entry.getValue());
        }

    }
}

