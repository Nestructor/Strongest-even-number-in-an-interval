import java.util.*;

public class Strongest {

    public int of(int[] array) {
        if(array.length == 2 && array[0] < array[1] && array[0] >= 0) {
            return getStrongest(getIntervalArray(array));
        }
        return 0;
    }

    private int[] getIntervalArray(int[] array) {
        int[] intervalArray = new int[array[1]-array[0]+1];
        int j = 0;
        for (int i = array[0]; i <= array[1]; i++) {
            intervalArray[j++] += i;
        }
        return intervalArray;
    }

    private int getStrongest(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], getPossibleStrongest(array[i]));
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    private int getPossibleStrongest(int elem) {
        int counter = 0;
        while(elem % 2 == 0) {
            counter++;
            elem /= 2;
        }
        return counter;
    }

}
