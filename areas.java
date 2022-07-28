// finding area of shapes of rectangle, rhombus, equilateral triangle and //gm using switch


import java.util.*;


public class areas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the shape of which you wanna find the area:");
        String area = in.next();

        switch(area){
            case "rectangle":
                System.out.println("enter length and width: ");
                double l = in.nextDouble();
                double w = in.nextDouble();
                double Rect = l*w;
                System.out.println("area of rectangle is : " + Rect);
                break;
            case "parallelogram":
                System.out.println("enter base and height: ");
                double b = in.nextDouble();
                double h = in.nextDouble();
                double Para = b*h;
                System.out.println("area of //gm is : " + Para);
                break;
            case "rhombus":
                System.out.println("enter diagonal p and diagonal q: ");
                double p = in.nextDouble();
                double q = in.nextDouble();
                double Rhom = (p*q)/2;
                System.out.println("area of //gm is : " + Rhom);
                break;
            case "equilateraltriangle":
                System.out.println("enter a side : ");
                double a = in.nextDouble();

                double Equi = 0.433*(a*a);
                System.out.println("area of //gm is : " + Equi);
                break;
            default:
                System.out.println("enter valid shape like rectangle, rhombus etc..");

        }

    }
}
