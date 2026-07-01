import java.util.*;

public class task5{

    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Cylinder radius : ");
        double radius = input.nextDouble();

        System.out.println("Enter Cylinder height : ");
        double height = input.nextDouble();

        double formula = Math.PI * Math.pow(radius,2) * height;
        
        System.out.println("formula = " + formula);
    
    }
    }