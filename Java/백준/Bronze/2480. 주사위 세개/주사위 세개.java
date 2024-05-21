import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
  
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    int price;

    if((a==b)&&(b==c)){
    	price=10000+(a*1000);
    }else if((a!=b)&&(b!=c)&&(c!=a)){
        if((a>b)&&(a>c)){
            price = a;
        }else if((b>a)&&(b>c)){
                price =b;
        }else{
                price =c;
	}
        price*=100;
    }else{
        if((a==b)||(a==c))
            price=(a*100)+1000;
        else 
            price =(b*100)+1000;
    }
    System.out.print(price);

        s.close();
    }
}