import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        int a =c.nextInt();
        int b=c.nextInt();
        int d =c.nextInt();
        int average=(a+b+d)/3;
        System.out.println(average);
    }
}
