public class ArmStrong {
    public static void main(String[] args) {
        int n= 153;
        int duplicate = n;
        int digit =0;
        while( n > 0){
            digit++;
            n= n/10;
        }
        int m=153;
        boolean ans = findArmstrong(duplicate, digit);
        System.out.println(ans);
        System.out.println("digit : " +digit);
    }

    public static boolean findArmstrong(int n, int digit){

        int original= n;
        double sum=0;
        while(original > 0){

            int rem = original % 10;
            sum = sum + Math.pow(rem, digit);

            original = original/10;
        }

        if(sum == n){
            return true;
        }
        return false;
    }
}
