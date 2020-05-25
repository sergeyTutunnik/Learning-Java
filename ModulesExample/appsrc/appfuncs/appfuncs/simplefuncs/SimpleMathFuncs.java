package appfuncs.simplefuncs;

public class SimpleMathFuncs {

    // Determine if a is factor of b.
    public static boolean isFactor(int a, int b) {
        if ((b % a) == 0) {
            return true;
        }
        return false;
    }

    //Returns the smallest positive factor that a and b hava in common
    public static int lcf(int a, int b) {
        //Factor using positive values
        a = Math.abs(a);
        b = Math.abs(b);

        int min = Math.min(a, b);

        for (int i = 2; i <= min / 2; i++) {
            if (isFactor(i, a) && isFactor(i, b)) {
                return i;
            }
        }
        return 1;
    }

    //Returns the largest positive factor that a and b have in common
    public static int gcf(int a, int b) {
        //Factor using positive values
        a = Math.abs(a);
        b = Math.abs(b);

        int min = Math.min(a, b);

        for (int i = min / 2; i >= 2; i--) {
            if (isFactor(i, a) && isFactor(i, b)) {
                return i;
            }
        }
        return 1;
    }

}
