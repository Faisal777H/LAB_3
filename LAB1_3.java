import java.util.Scanner;

public class LAB1_3 {
    public static void main(String[] args) {
        int x;
        Scanner in =new Scanner(System.in);
        System.out.println("enter number ");
        x=in.nextInt();
        if(x>0){
            System.out.println("positive ");
        }
        else if (x<0){
            System.out.println("negative ");
        }
        else
            System.out.println("zero");
    }
}
