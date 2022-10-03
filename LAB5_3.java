import java.util.Scanner;

public class LAB5_3 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three number");
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        if (x>y && y>z)
            System.out.println("In order");
        else if (x<y && y<z) {
            System.out.println("In order");
        }
        else
            System.out.println("otherwise");
    }
}
