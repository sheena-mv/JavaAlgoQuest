import java.util.Arrays;

public class RotationSolution {
    public static void main(String[] args) {
        int[] A = {3,4,5,6,7};
        int[] B = solution(A, 2);
        System.out.println("Question : " + Arrays.toString(A));
        System.out.println("Answer   : " + Arrays.toString(B));

        //[7, 3, 4, 5, 6] - K=1
        //[6, 7, 3, 4, 5] - K=2
    }

    public static int[] solution(int[] A, int K) {
        int arrLength = A.length;
        if (arrLength == 0) {
            return A;
        }
        K = K % arrLength;
        if (K == 0) {
            return A;
        }
        int[] modifiedArray = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            modifiedArray[(i + K) % arrLength] = A[i];
        }
        return modifiedArray;
    }
}
