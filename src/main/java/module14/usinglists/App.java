package module14.usinglists;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static int total (List<Integer> numbers) {

        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }

        return sum;
    }

    public static int totalEven (List<Integer> numbers) {

        int sum = 0;
        for(int i = 0; i < numbers.size(); i += 2) {
            sum += numbers.get(i);
        }

        return sum;
    }

    public static List<String> swapFirstAndLast(List<String> strings) {

        String temp = strings.get(0);
        strings.set(0, strings.get(strings.size() - 1));
        strings.set(strings.size() - 1, temp);

        return strings;
    }

    public static List<Integer> reverse(List<Integer> numbers) {

        List<Integer> reversed = new ArrayList<>();

        for(int i = numbers.size()-1; i >= 0; i--) {

            // length - (i + 1) is the n-th to last element
            // so when i = 0, it would be the last element
            // when i = 3, it would be the fourth to last element since i=3 is the 4th element, etc
            reversed.add(numbers.get(i));
        }

        return reversed;
    }

    public static List<Integer> lessThanFive(List<Integer> numbers) {

        int lessThanFive = 0;
        for(int num : numbers){
            if(num < 5){
                lessThanFive++;
            }
        }

        if(lessThanFive == 0){
            return null;
        }
        List<Integer> lessThan = new ArrayList<>();

        for(int num : numbers) {
            if ( num < 5 ) {

                // subtracting numLessThanFive from length then decrementing numLessThanFive
                // allows us to go from 0 to length - 1 in order without additional variables
               lessThan.add(num);
            }
        }

        return lessThan;
    }

    //challenge
    public static List<List<Integer>> splitAtFive(List<Integer> numbers) {

        List<Integer> lessthan = new ArrayList<>();
        List<Integer> morethan = new ArrayList<>();

        for(int num : numbers) {

            // subtracting numLessThanFive from length then decrementing numLessThanFive
            // allows us to go from 0 to length - 1 in order without additional variables
            // same with numMoreThanFive
            if ( num < 5 ) {
                lessthan.add(num);
            } else {
                morethan.add(num);
            }
        }
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(lessthan);
        listOfLists.add(morethan);
        return listOfLists;
    }

    // Challenge
    public static List<List<String>> evensAndOdds(List<String> strings) {

        //leveraging integer division
        List<String> odds = new ArrayList<>();

        // Set evens to null for reassignment below
        List<String> evens = new ArrayList<>();

        for(String string : strings){
            if(strings.indexOf(string) % 2 == 0){
                evens.add(string);
            } else {
                odds.add(string);
            }
        }
        List<List<String>> listOfLists = new ArrayList<>();
        listOfLists.add(evens);
        listOfLists.add(odds);

        return listOfLists;
    }
}
