import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n,r,sum=0;
        System.out.print("Enter nember=");
        n=input.nextInt();

        while (n!=0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;

        }
        System.out.print("Reverse="+sum);
    }
}
