import java.util.Scanner;
public class validString {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Eneter the string : ");
       String s = scanner.next();

       int ans = valid(s);
       System.out.println(ans);
    }

    public static int valid(String s){

        int star = 0;
        int hash=0;

        for(int i=0 ; i < s.length() ; i++){
            if(s.charAt(i) == '*'){
                star++;
            }
            else{
                hash++;
            }
        }

        


            return star - hash;
        

        // if( star < hash){
        //     return hash - star;
        // }
        
    }
}
