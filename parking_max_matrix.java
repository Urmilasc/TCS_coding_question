public class parking_max_matrix {
    public static void main(String[] args) {
        int[][] arr ={
            {1,0},
            {1,1}
        };

        
        int[] ans = new int[arr.length];

        for(int i=0 ; i < arr.length ; i++){
            int count=0;
            for(int j=0 ; j < arr[0].length; j++){

                if(arr[i][j] == 1){
                    count++;
                }
            }
            ans[i]= count;


        }

        int max= ans[0];
        for(int i=0 ; i < ans.length; i++){
            if(ans[i] > max ){
                max = i;
            }
        }

        if(max != 0){
            System.out.println(max +1);
        }else{
            max = -1;
            System.out.println(max);
        }

        
    }
}
