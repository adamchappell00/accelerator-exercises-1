package module11;

import java.util.Scanner;

public class RectPavingCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rectangle Paving Company\n");
        System.out.println("Enter the width of your driveway (in feet):");
        int width = sc.nextInt();
        System.out.println("Enter the length of your driveway (in feet):");
        int length = sc.nextInt();
        int area = width * length;
        int perimeter = (length + width) * 2;
        System.out.println("Enter the cost of the concrete per square foot:");
        double concrete = sc.nextDouble();
        double subcost1 = area * concrete;
        System.out.println("Enter the cost of framing and footers per linear foot:");
        double framing = sc.nextDouble();
        double subcost2 = perimeter * framing;
        System.out.printf("The area of your driveway is %s square feet.\n", area);
        System.out.printf("The perimeter of your driveway is %s feet.\n", perimeter);
        System.out.println("--Your Cost Quote--");
        System.out.println("Concrete: $"+ subcost1);
        System.out.println("Framing: $"+ subcost2);
        System.out.println("Total Cost: $"+ (subcost1 + subcost2));
    }
}