import java.util.Scanner;

public class LAB3_3 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner in =new Scanner(System.in);
        System.out.println("Input three number");
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        if(x==y && y==z && z==x){
            System.out.println("all are the same ");
        } else if (x!=y && y!=z && z!=x) {
            System.out.println("all are different");
        }
        else
            System.out.println("NO");
    }
}
