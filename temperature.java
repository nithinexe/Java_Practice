import java.util.*;


public class temperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter temp in celcius: ");
        float tempC = input.nextFloat();

        double tempF = (tempC * 1.8) + 32;
        System.out.println(tempF);


    }

}
