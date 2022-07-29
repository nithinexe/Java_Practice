// java program to reverse a number


import java.util.*;


public class reverse {
    public static void main(String[] args) {
        int n, rev=0, rem;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while(n!=0){
            rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        System.out.println("reverse = " + rev);

    }
}
