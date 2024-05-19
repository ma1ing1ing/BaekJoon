import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int hour = s.nextInt();
        int min = s.nextInt();
        
        if(min<45){
            min += 15;
            if(hour==0)
                hour=23;
            else
                --hour;
        }else
            min -= 45; 
        System.out.print(hour+" "+ min);
        s.close();
    }
}
