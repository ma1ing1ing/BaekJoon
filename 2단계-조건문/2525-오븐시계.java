/* m<60 h>24, m>60 changedh>24, time의 h가 hour+h >= 24 
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int hour = s.nextInt();
        int min = s.nextInt();
        int time = s.nextInt();
        int m = (time%60)+min;
        int h = (time/60)+hour;

        if(m<60){
            if(h>=24)
                h-=24;
        }else{
            int changedH = (m/60)+h;
            m%=60;
            if(changedH>=24)
                h=changedH-24;
            else
                h=changedH;
        }

        System.out.print(h+" "+m);
        s.close();
    }
}
