import java.util.Scanner;

public class CountingDigitOfNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n,count=0;
        System.out.print("Enter nember=");
        n=input.nextInt();

        while (n!=0){

            n=n/10;
            count++;
        }
        System.out.print("Number of digit="+count);
    }
}
