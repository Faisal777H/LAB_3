import java.util.Scanner;

public class LAB6_3 {
    public static void main(String[] args) {
        String name;
        double salary,hour,pay=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name ");
        name=in.next();
        System.out.println("Enter the Salary ");
        salary=in.nextDouble();
        System.out.println("Enter hours worked ");
        hour=in.nextDouble();
        if(hour>40){
            pay=((hour-40)*(1.5*salary)+(40*salary));
        }
        else{
            pay=(hour*salary);
        }
        System.out.println("Name is "+name);
        System.out.println("Salary is "+salary);
        System.out.println("Hours worked by "+hour);
        System.out.println("The pay is "+pay);
    }
}
