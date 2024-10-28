import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n,r,sum=0,temp;
        System.out.print("Enter nember=");
        n=input.nextInt();
        temp=n;
        while (temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;

        }
        if(sum==n){
            System.out.print("Palindrome Number");
        }
        else {
            System.out.print("Not Palindrome Number");
        }
    }

}
