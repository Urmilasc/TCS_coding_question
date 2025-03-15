public class sun_count {
    public static void main(String[] args) {
        String day= "Thurs";
        int n = 20;

        int count = 0;
        int sunday = n /7;
        int rem = n % 7;
        count = sunday;
        
        if(day.equals("mon")) rem = 7-1;
        if(day.equals("mon")) rem = 7-2;
        if(day.equals("mon")) rem = 7-3;
        if(day.equals("mon")) rem = 7-4;
        if(day.equals("mon")) rem = 7-5;
        if(day.equals("mon")) rem = 7-6;
        if(day.equals("mon")) rem = 7-7;

        if(rem < n % 7){
            count = count +1;
        }
        

        System.out.println(count);
    }
}
