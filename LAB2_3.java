import java.util.Scanner;

public class LAB2_3 {
    public static void main(String[] args) {
        int x;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number");
        x=in.nextInt();
        if (x<0){
            x=x*-1;
            System.out.println(x);
        }
        if(x<10 && x>0){
            System.out.println("one");}
        else if (x<100 && x>=10) {
            System.out.println("two digit");

        }
        else if (x<1000 && x>=100) {
            System.out.println("Three digit");

        }
        else if (x<10000 && x>=1000) {
            System.out.println("Four digit");

        }
        else if (x<100000 && x>=10000) {
            System.out.println("Five digit");

        }
        else if (x<1000000 && x>=100000) {
            System.out.println("six digit");

        }
        else if (x<10000000 && x>=1000000) {
            System.out.println("Seven digit");

        }
        else if (x<100000000 && x>=10000000) {
            System.out.println("Eight digit");

        }
        else if (x<1000000000 && x>=100000000) {
            System.out.println("Nine digit");

        }

    }
}
