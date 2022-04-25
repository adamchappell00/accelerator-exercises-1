package module11;

import java.util.Scanner;

public class CommandLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Welcome to CommandLineGram ---");
        System.out.println("Enter Your First Name:");
        String firstName = sc.nextLine();
        System.out.println("Enter Your Last Name:");
        String lastName = sc.nextLine();
        System.out.println("Enter Your Email:");
        String email = sc.nextLine();
        System.out.println("Enter Your Twitter Handle:");
        String twitter = sc.nextLine();
        System.out.println("Enter Your Age:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Your Country:");
        String country = sc.nextLine();
        System.out.println("Enter Your Profession:");
        String profession = sc.nextLine();
        System.out.println("Enter Your Favorite OS:");
        String operatingSystem = sc.nextLine();
        System.out.println("Enter Your Favorite Programming Language:");
        String language = sc.nextLine();
        System.out.println("Enter Your Favorite Computer Scientist:");
        String computerScientist = sc.nextLine();
        System.out.println("Enter Your Favorite Shortcut:");
        String shortcut = sc.nextLine();
        System.out.println("Have you ever built your own computer?");
        boolean builtComputer = Boolean.parseBoolean(sc.nextLine());
        System.out.println("If you could be any superhero, who would it be?");
        String superhero = sc.nextLine();

        // -- BREAK BETWEEN INPUT AND OUTPUT --
        System.out.println("---- Your Information ----");
        System.out.println("-- Personal Data --");
        System.out.println(" First Name: " + firstName);
        System.out.println(" Last Name: " + lastName);
        System.out.println(" Email: " + email);
        System.out.println(" Twitter: " + twitter);
        System.out.println(" Age: " + age);
        System.out.println(" Country: " + country);
        System.out.println(" Profession: " + profession);
        System.out.println("--Favorites--");
        System.out.println(" OS: " + operatingSystem);
        System.out.println(" Language: " + language);
        System.out.println(" Computer Scientist: " + computerScientist);
        System.out.println(" Shortcut: " + shortcut);
        System.out.println(" Built A Computer: " + builtComputer);
        System.out.println(" Superhero You Would Be: " + superhero);
    }
}