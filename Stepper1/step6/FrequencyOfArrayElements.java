import java.util.HashMap;
import java.util.Map;

class FrequencyOfArrayElements{
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        int n = arr.length;
        countFrequencies(arr, n);
    }

    static void countFrequencies(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < n; i++){
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}