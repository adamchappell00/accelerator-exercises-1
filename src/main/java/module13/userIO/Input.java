package module13.userIO;

import module13.userIO.interfaces.UserIO;

import java.util.Scanner;


public class Input implements UserIO {

    Scanner scan;

    public Input(){
         scan = new Scanner(System.in);
    }


    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(scan.nextLine());
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        return Long.parseLong(scan.nextLine());
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        return Double.parseDouble(scan.nextLine());
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        return Float.parseFloat(scan.nextLine());
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return scan.nextLine();
    }
}
