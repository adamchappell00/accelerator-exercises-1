package module14;

public class SumArrays {

    public static int sumArrays(int[] arr1, int[] arr2){
        int total = 0;
        for(int num : arr1){
            total += num;

        }
        for(int num : arr2){
            total += num;
        }
        return total;
    }

    public static int[] arrayify(int a, int b){
        int[] array = {};
        if(a < 0 ){
            return array;
        }
        array = new int[a];
        int num = b;
        for(int i = 0; i < a; i++){
            array[i] = num++;
        }
        return array;
    }
}
