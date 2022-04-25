package module11;

import java.util.Scanner;

public class HelloAndAdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("You entered: "+ name);
        System.out.println("Let's do addition, enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.printf("You entered %s and %s, added together that makes %s.", num1, num2, (num1+num2));
    }

}
