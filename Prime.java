public class Prime {
    public static void main(String[] args) {
        int n = 8;

        boolean ans = findPrime(n);
        System.out.println(ans);

        
    }

        public static boolean findPrime(int n){

            if(n <= 1){
                return false;
            }

            double s = Math.sqrt(n);
            System.out.println(s);
            for(int i=2; i <=  Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }

            return true;
        }
        
    
}
