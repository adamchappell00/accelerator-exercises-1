package module15.lambdastream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        List<Television> tvs = FileIO.getTelevisions("televisions.csv");
        System.out.println("Tvs larger than 60");
        tvs.stream().filter(t -> t.getScreenSize() > 60)
                .forEach(t -> {
                    System.out.println(t);
                });
        System.out.println("Tvs brands ===================");
        Map<String, List<Television>> tvsByBrand = tvs.stream().collect(Collectors.groupingBy(t -> t.getBrand()));
        tvsByBrand.keySet().stream().forEach(b -> {
            System.out.println(b);
        });
        double avg = tvs.stream().mapToDouble(t-> t.getScreenSize()).average().getAsDouble();
        System.out.println("Average Tv size is: " + avg);

        int biggestTv = tvs.stream().mapToInt(t -> t.getScreenSize()).max().getAsInt();
        System.out.println("The largest tv is: "+ biggestTv);
    }

}