import java.util.Scanner;

public class Binaryrep {
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        int dec=c.nextInt();
        String bin ="";
        while (dec>0){
            int rem=dec%2;
            bin=rem+bin;
            dec=dec/2;
        }
        System.out.println(bin);
    }
}
