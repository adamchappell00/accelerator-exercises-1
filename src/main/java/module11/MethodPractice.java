package module11;

public class MethodPractice {


	// subtract - COMPLETE
    // Create a method called subtract() that takes two int parameters (a and b) and returns the value of b subtracted from a.
    public static int subtract(int a, int b){
        return a - b;
    }

	// subtractOrZero - COMPLETE
    // Create a method called subtractOrZero() that takes two int parameters (a and b) and returns the value of b subtracted from a, unless the result is less than zero, in which case, return 0.

    public static int subtractOrZero(int a, int b){
        if((a - b) < 0){
            return 0;
        }
        return a - b;
    }

	// max - COMPLETE
    // Create a method called max() that takes three int parameters (a, b, and c) and returns the value of the largest of the three.

    public static int max(int a, int b, int c){
        int highest = a;
        if ((b > a) && (b > c)){
           highest = b;
        }else if((c > a) && (c > b)){
            highest = c;
        }
        return highest;
    }
	// min - COMPLETE
    // Create a method called min() that takes three int parameters (a, b, and c) and returns the value of the smallest of the three.

    public static int min(int a, int b, int c){
        int lowest = a;
        if ((b < a) && (b < c)){
            lowest = b;
        }else if((c < a) && (c < b)){
            lowest = c;
        }
        return lowest;
    }

	// isLarger -
    // Create a method called isLarger() that takes two int parameters (first and second) and returns true if the first is greater than second.

    public static boolean isLarger(int first, int second){
        return first > second;
    }
}