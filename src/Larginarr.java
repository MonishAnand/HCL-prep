public class Larginarr {
    public static void main(String[] args) {
        int []num={7,8,9,10,6,5};
        int i,l;
        l=num[0];
        for(i=1;i<6;i++){
            if (num[i]>l){
                l=num[i];
            }
        }
        System.out.println(l);
    }
}
