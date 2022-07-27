
import java.util.*;



public class largest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q find the largest number between 3

        if(a>b && a>c){
            System.out.println("a is greatest: " + a);

        } else if (b>a && b>c) {
            System.out.println(" b is greater "+ b);


        }else {
            System.out.println("c is largest " + c);
        }
    }


}
