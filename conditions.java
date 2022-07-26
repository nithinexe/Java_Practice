
import java.util.*;


public class conditions {

    public static void main(String[] args) {
        /*
        syntax for conditions is if(boolean expression T or F){
        //body

        } else {
        // do this


        }

         */
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();

        if(salary > 10000) {
            System.out.println("your salary pay has increased by 2000");
            int salary2 = salary + 2000;
            System.out.println(salary2);
        }
        else if(salary==9999){
            salary +=20000;
            System.out.println("Heheyy You got a bonus" + salary);
        }
        
        
        else {
            System.out.println("your salary is the same " + salary);
        }
    }



}
