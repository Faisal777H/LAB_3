import java.util.Scanner;

public class LAB4_3 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three Integer ");
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        if (x<y && y<z){
            System.out.println("Increasing ");
        } else if (x>y && y>z) {
            System.out.println("Decreasing ");
        }
        else
            System.out.println("Neither");
    }
}
