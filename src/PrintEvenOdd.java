import java.util.Scanner;

public class PrintEvenOdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n,i;
        System.out.print("Enter nember=");
        n=input.nextInt();

        for(i=1;i<=n;i++){

            if(i%2==0){
                System.out.println(  i+" Is even number");
            }
            else{
                System.out.println(i+" Is odd number" );
            }
        }
    }
}
