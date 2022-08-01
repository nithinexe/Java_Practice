import java.util.*;

 /*
        creating a function syntax
        access modifier return_type name(){

        //body

        return statement;
        }
         */

public class sum_function {

    public static void main(String[] args) {

        sum();

    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1+ num2;
        System.out.println("Sum = " + sum);


    }

}
