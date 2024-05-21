import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<2;j++){
                int a=s.nextInt();
                int b=s.nextInt();
                System.out.println(a+b);
            }
        }
        
        s.close();
    }
}
/*
        int a = s.nextInt();
        int A,B;
        for(int i =1;i<=a;i++){
            A=s.nextInt();
            B=s.nextInt();
            System.out.println(A+B);
        }

*/
