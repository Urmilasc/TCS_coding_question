public class Monkeys_eat_banana_PEanuts {
    public static void main(String[] args){
        int n=10;
        int k=4;
        int j=3;
        int m = 14;
        int p = 9;

        int count =0;

        int monkey_eaten = m / k;
        int rem_b = m % k;
        count = count + monkey_eaten;

        int monkey_eaten_P = p / j;
        int rem_p = p % j;
        count =count + monkey_eaten_P;

        if(rem_b < k &&  rem_p < j  ){
            count = count + 1;
        }

        int ans = n - count;
        System.out.println(ans);
    }
}
