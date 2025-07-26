public class FrogJmp {

    public static void main(String[] args) {
        int run = solution(10, 85, 10);
        System.out.println(run);
    }

    public static int solution(int X, int Y, int D) {
        int num = Y-X;
        int runCount = num / D;
        if (num % D != 0) {
            runCount = runCount + 1 ;
        }
        return runCount;
    }

    //another solution

//                int runCount = 0;
//                while(X <= Y) {
//                    X = X + D;
//                    runCount++;
//                }

}


