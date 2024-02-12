public class MainFibonacci {
    static int iterativeCount = 0;
    static int recursiveCount = 0;
    static int recursiveAccumCount = -1;

    public static void main(String[] args) {
//        int n = 3;
//        int n = 10;
        int n = 20;

        fibIterative(n);
        fibRecursive(n);
        fibRecursiveAccum(n,0,1);

        System.out.println("\n# of iterative addition operations: " + iterativeCount);
        System.out.println("\n# of recursive addition operations: " + recursiveCount);
        System.out.println("\n# of recursive with accumulators addition operations: " + recursiveAccumCount);
    }

    public static void fibIterative(int n) {
        int num1 = 0, num2 = 1, num3;

        for (int i = 0; i < n; i++) {
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;

            iterativeCount++;
        }
    }

    public static int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        recursiveCount++;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static int fibRecursiveAccum(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        recursiveAccumCount++;
        return fibRecursiveAccum(n - 1, b, a + b);
    }
}
