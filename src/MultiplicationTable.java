import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n,i,mul;
        System.out.print("Enter nember=");
        n=input.nextInt();

        for(i=1;i<=10;i++){
            mul=n*i;
            System.out.println(n+ " X " +i+ " = " +mul);
        }
    }
}
