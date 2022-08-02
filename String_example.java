import java.util.*;


public class String_example {

    public static void main(String[] args) {
        String message = string();
        System.out.println(message);
    }
    static String string(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter string");
        String s = in.nextLine();
        return s;
    }



}
