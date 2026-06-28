import java.util.*;
public class test {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
       
       
        System.out.println("Enter length for rectangle");
        double length = input.nextDouble();
    
    
        System.out.println("Enter width for rectangle ");
        double width = input.nextDouble();

        double area = (length * width);

        System.out.println("Result = " + area);

        }
} 