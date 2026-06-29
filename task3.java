import java.util.*;

public class task3{

    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);

        System.out.println("Enter amount in SAR : ");
        double amount = input.nextDouble();

        System.out.println("Enter exchange rate (SAR per USD) : ");
double exchange = input.nextDouble();


double formula = (amount / exchange);

System.out.println("Equivalent amont in USD = " + formula);

    }


}
