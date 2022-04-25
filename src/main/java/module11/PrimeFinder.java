package module11;

import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number limit:");
        int limit = Integer.parseInt(sc.nextLine());
        if(limit < 2){
            System.out.println("You did not enter a valid number");
        } else {
            System.out.println("Prime Numbers from 1 to " + limit + ".");
            for(int i = 2; i < limit; i++){
                boolean isPrime = true;
                for(int j = 2; j < i; j++){
                    if(i % j == 0){
                        isPrime = false;
                    }
                }
                if(isPrime){
                    System.out.println(i);
                }
            }
        }
    }
}
