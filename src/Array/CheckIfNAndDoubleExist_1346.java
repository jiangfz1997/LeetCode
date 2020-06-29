package Array;

import java.util.HashSet;

public class CheckIfNAndDoubleExist_1346 {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> arrSet = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0 && arrSet.contains(arr[i] / 2) || arrSet.contains(arr[i] * 2))
                return true;
            arrSet.add(arr[i]);
        }

        return false;
    }
}
