import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        int a=c.nextInt();
        if(a%2==0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
    }
}
