import java.util.*;

public class task2{

    public static void main (String[] args){
        

Scanner input = new Scanner (System.in);

System.out.println("Enter your total saving :");


double saving = input.nextDouble();

double formula = (0.025 * saving);

System.out.println("Zakat due (2.5%):  " + formula);

    }
}