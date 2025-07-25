import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] A = {1, 3, 1, 3, 1, 5, 1};
        int num = solution(A);
        System.out.println(num);
    }

    public static int solution(int[] arr) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (numSet.contains(arr[i])) {
                numSet.remove(arr[i]);
            } else {
                numSet.add(arr[i]);
            }
        }
        return numSet.stream().findFirst().get();
    }
}
