import java.util.Scanner;

public class SumNnumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int n,i,sum=0;
        System.out.print("Enter nember N=");
        n=input.nextInt();

        for(i=1;i<=n;i++){
            sum=sum+i;


        }
        System.out.print("The sum of first " +n+ " natural number is=" +sum);
    }
}
