import java.util.Scanner;

public class PrintNumbe {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int n,i;
        System.out.print("Enter your nember N=");
        n=input.nextInt();

        for(i=1;i<=n;i++){
            System.out.println(+i);
        }

    }
}
