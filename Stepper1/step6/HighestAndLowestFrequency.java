import java.util.HashMap;
import java.util.Map;
class HighestAndLowestFrequency{
    public static void main(String args[]) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        countFreq(arr, n);
    }

    static void countFreq(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;

        for(int i = 0; i < n; i++) {
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() < minFreq){
                minEle = entry.getKey();
                minFreq = entry.getValue();
            }

            if(entry.getValue() > maxFreq){
                maxEle = entry.getKey();
                maxFreq = entry.getValue();
            }
        }

        System.out.println(maxEle + " occurs " + maxFreq);
        System.out.println(minEle + " occurs "+ minFreq);
    }
}