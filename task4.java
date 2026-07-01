import java.util.*;

public class task4{

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter base of the triangle : ");
        double base = input.nextDouble();

        System.out.println("Enter height of the triangle : ");
        double height = input.nextDouble();

        double triangleArea = (0.5 * base * height);

        System.out.println("Result = " + triangleArea);



        
    }
}


