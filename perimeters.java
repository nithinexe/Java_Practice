//to find the perimeters of shapes


import java.util.*;

public class perimeters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the shape of the perimeter: ");
        String perimeter = in.next();

        switch(perimeter){
            case "circle":
                double r = in.nextDouble();
                double circ = 2*3.141592653589793238*r;
                System.out.println("perimeter of circle is : " + circ);
                break;
            case "rectangle":
                double l = in.nextDouble();
                double w = in.nextDouble();
                double rect = 2*(l+w);
                System.out.println("perimeter of rect is : " + rect);
                break;
            case "equilateraltriangle":
                double a = in.nextDouble();
                double equi = 3*a;
                System.out.println("perimeter of equilateraltriangle is : " + equi);
                break;
            case "parallelogram":
                double base = in.nextDouble();
                double side = in.nextDouble();
                double para = 2*(base+side);
                System.out.println("perimeter of  is : " + para);
                break;
            case "square":
                double square_a = in.nextDouble();
                double square_peri = 4*square_a;
                System.out.println("perimeter of square is : " + square_peri);
                break;
            case "rhombus":
                double side_a = in.nextDouble();
                double rhom_peri = 4*side_a;
                System.out.println("perimeter of square is : " + rhom_peri);
                break;
            default:
                System.out.println("enter a valid shape.");
        }

    }

}
