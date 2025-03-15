public class Harshad {
    public static void main(String[] args) {
        int n= 456;
       int original = n;
        int sum=0;
        while(n > 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n /10;
            
        }

        if(original % sum == 0){
            System.out.println("Harshad number");
        }else{
            System.out.println("Not an harshad number");
        }


    }
}
