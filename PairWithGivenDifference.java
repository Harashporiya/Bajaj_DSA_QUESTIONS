import java.util.HashSet;

public class PairWithGivenDifference {
    public boolean findPair(int arr[], int size, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            if (set.contains(arr[i] + n) || set.contains(arr[i] - n)) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}