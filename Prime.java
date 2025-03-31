public class Prime {
    public static void main(String[] args) {
        int n = 5;

        // boolean ans = findPrime(n);
        boolean ans2 = findPrime_2(n);
        // System.out.println(ans);
        System.out.println(ans2);

        
    }

        // public static boolean findPrime(int n){

        //     if(n <= 1){
        //         return false;
        //     }

        //     double s = Math.sqrt(n);
        //     System.out.println(s);
        //     for(int i=2; i <=  Math.sqrt(n); i++){
        //         if(n % i == 0){
        //             return false;
        //         }
        //     }

        //     return true;
        // }

        public static boolean findPrime_2(int n){

            if(n <= 1){
                return false;
            }

            int c = 2;
            while(c * c <= n){
                if(n % c == 0){
                    return false;
                }
                c++;
            }
            return true;
        }
        
    
}
