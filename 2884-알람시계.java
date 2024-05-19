import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int hour = s.nextInt();
        int min = s.nextInt();
        
	    if(min<45){
            min = (min-45)+60;
                if(hour==0){
                    hour = 23;
	            }else{
	             --hour;
	             }
        }else{
            min = min-45;
        }

        System.out.print(hour+" "+min);
        s.close();
    }
}
/*시간
분
경우3
	1. min>=45
	2. min <45
		1. hour=0
*/
