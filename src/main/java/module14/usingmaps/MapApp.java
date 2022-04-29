package module14.usingmaps;

import java.util.*;

public class MapApp {

    public void printKeys(Map<String, String> map){
        Set<Map.Entry<String, String>> myEntries = map.entrySet();
        for (Map.Entry<String, String> entry : myEntries) {
            System.out.println(entry.getKey());
        }
    }

    public void printValues(Map<String, String> map){
        Set<Map.Entry<String, String>> myEntries = map.entrySet();
        for (Map.Entry<String, String> entry : myEntries) {
            System.out.println(entry.getValue());
        }
    }

    public void printKeysAndValues(Map<String, String> map){
        Set<Map.Entry<String, String>> myEntries = map.entrySet();
        for (Map.Entry<String, String> entry : myEntries) {
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }
    }

    public Map<String, Integer> mapFun(Map<String, Integer> map){
        map.remove("Jeep Wrangler");
        map.put("Ford Explorer", 2012);
        map.put("Smart Fortwo", 2013);
        return map;
    }

    public Map<String, List<Car>> listCars(List<Car> cars){
        List<Car> fordList = new ArrayList<>();
        List<Car> hondaList = new ArrayList<>();
        List<Car> toyotaList = new ArrayList<>();
        for(Car car : cars){
            if(car.getMake().equals("Ford")){
                fordList.add(car);
            }else if(car.getMake().equals("Honda")){
                hondaList.add(car);
            }else if (car.getMake().equals("Toyota")){
                toyotaList.add(car);
            }
        }
        Map<String, List<Car>> makesMap = new HashMap<>();
        makesMap.put("Ford", fordList);
        makesMap.put("Honda", hondaList);
        makesMap.put("Toyota", toyotaList);
        return makesMap;
    }
}