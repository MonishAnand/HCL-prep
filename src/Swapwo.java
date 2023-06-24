import java.util.Scanner;

public class Swapwo {
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        int a=c.nextInt();
        int b=c.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a ="+a);
        System.out.println("b = "+b);
    }
}
